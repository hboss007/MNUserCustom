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
			//��У��Ľ�����д���
			//��ȡ���еĴ�����Ϣ
		   List<ObjectError> list =  br.getAllErrors();
		   if(list.size()>0){//�д���
			   //���������Ϣ
			   for(ObjectError oe:list){
				   System.out.println(oe.getDefaultMessage());
				   
			   }
			   return "add";
			   
			   
		   }else{//û�д���
			   dao.saveadd(hx);
			   System.out.println("<<<<<"+hx.getHxid());
				return "redirect:queryhx.sw";
		   }
		
		
			
	}
	
	@RequestMapping("/saveupdate")
	public String saveupdate(VHangxianInfo hx){
		System.out.println("���뵽���޸ķ�����"+hx.getHxmc());
		//-----�޸ĺ���----------------
		
		
		return "redirect:queryhx.sw";
	}
	
	@RequestMapping("/{hxid}/toupdate")
	public String toupdate(@PathVariable("hxid")Integer hxid,Map map){
		//ȥdao�и��ݺ���ID��ѯ������Ϣ
		VHangxianInfo hx = dao.queryHxById(hxid);
		map.put("hx", hx);
		//----��ѡ��ť���map
		HashMap mp = new HashMap();
		mp.put(0, "����");
		mp.put(1, "ͣ��");
		map.put("zt",mp);
		//---����ѡ��--
		//���Һ��ߣ���ҳ���Ͻ�������ѡ�����
		List<VHangxianInfo> list = dao.queryHx();
		map.put("hxxx",list);
		return "update";
	}

	@RequestMapping("/savefile")
	public String savefile(String uname,MultipartFile fs,HttpServletRequest request) throws Exception{
		System.out.println("�յ�������:"+uname);
			System.out.println(fs.getName());
			System.out.println(fs.getSize());
			System.out.println(fs.getOriginalFilename());
			File f = new File(request.getRealPath("/"),fs.getOriginalFilename());
			fs.transferTo(f);
		
		return "redirect:queryhx.sw";
	}
	
	
	
	
	
	
	

}
