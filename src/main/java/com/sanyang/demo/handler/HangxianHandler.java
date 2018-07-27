package com.sanyang.demo.handler;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.swing.plaf.multi.MultiTabbedPaneUI;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.sanyang.demo.dao.IHangxianDao;
import com.sanyang.demo.vo.VHangxianInfo;

@Controller
public class HangxianHandler {
	@Autowired
	private IHangxianDao dao;
	
	@RequestMapping("/queryhx")
	public String queryhandler(Map map){
		List<VHangxianInfo> list = dao.queryHx();
		map.put("list", list);
		return "list";
	}
	
	@RequestMapping("/saveadd")
	public String saveaddHx(@Valid VHangxianInfo hx,BindingResult br ,HttpServletRequest request){
			//对校验的结果进行处理
			//获取所有的错误消息
		   List<ObjectError> list =  br.getAllErrors();
		   if(list.size()>0){//有错误
			   //处理错误信息
			   for(ObjectError oe:list){
				   System.out.println(oe.getDefaultMessage());
				   
			   }
			   return "add";
			   
			   
		   }else{//没有错误
			   dao.saveadd(hx);
			   System.out.println("<<<<<"+hx.getHxid());
				return "redirect:queryhx.sw";
		   }
		
		
			
	}
	
	@RequestMapping("/saveupdate")
	public String saveupdate(VHangxianInfo hx){
		System.out.println("进入到了修改方法："+hx.getHxmc());
		//-----修改航线----------------
		
		
		return "redirect:queryhx.sw";
	}
	
	@RequestMapping("/{hxid}/toupdate")
	public String toupdate(@PathVariable("hxid")Integer hxid,Map map){
		//去dao中根据航线ID查询航线信息
		VHangxianInfo hx = dao.queryHxById(hxid);
		map.put("hx", hx);
		//----单选按钮组的map
		HashMap mp = new HashMap();
		mp.put(0, "正常");
		mp.put(1, "停飞");
		map.put("zt",mp);
		//---下拉选择--
		//查找航线，在页面上进行下拉选择操作
		List<VHangxianInfo> list = dao.queryHx();
		map.put("hxxx",list);
		return "update";
	}

	@RequestMapping("/savefile")
	public String savefile(String uname,MultipartFile fs,HttpServletRequest request) throws Exception{
		System.out.println("收到的名字:"+uname);
			System.out.println(fs.getName());
			System.out.println(fs.getSize());
			System.out.println(fs.getOriginalFilename());
			File f = new File(request.getRealPath("/"),fs.getOriginalFilename());
			fs.transferTo(f);
		
		return "redirect:queryhx.sw";
	}
	
	
	
	
	
	
	

}
