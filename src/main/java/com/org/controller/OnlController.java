package com.org.controller;


import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.org.model.Addressinfo;
import com.org.model.StudentInfo;
import com.org.serviceimpl.StudentImpl;

@Controller
public class OnlController {
	
	
	ApplicationContext cxt = new ClassPathXmlApplicationContext("Config.xml");
	StudentImpl sp = (StudentImpl)cxt.getBean("Simpl");
	ModelAndView mv = new ModelAndView();
	static StudentInfo s = new StudentInfo();	
	static Addressinfo ai = new Addressinfo()  ;
	static int y = 100;

	@RequestMapping("/Login")
	public ModelAndView Logi(@RequestParam("uname") String s2,@RequestParam("pword") String s3)
	{
		StudentInfo studentInfo= sp.validuandp(s2, s3);
		if(studentInfo !=null) 
	{
        mv.addObject("studentInfo", studentInfo);
		mv.setViewName("QuestionPaper");
	}
	else {
		 mv.setViewName("Failure");
	}
		return mv;
	}	
	
	@RequestMapping("/Register")
	public ModelAndView reg()
	{
		mv.setViewName("Register");
		return mv;
		
	}
	@RequestMapping(value ="/save",method = RequestMethod.POST)
	public ModelAndView regval(@RequestParam("email") String s1,@RequestParam("psw") String s2,@RequestParam("psw-repeat") String s3,@RequestParam("Bname") String s4,@RequestParam("name") String s5,@RequestParam("state") String s6,@RequestParam("city") String s7,@RequestParam("street") String s8)  
	{

		String  f = "true";
		String pat = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
		if(s2.equals(s3) && s2.matches(pat))
		{
			y++;
			String rn = "Y"+"23"+s4.substring(0, 2).toUpperCase()+y; 
	 
			
			ai.setState(s6);
			ai.setCity(s7);
      		ai.setStreet(s8);
			s.setEmail(s1);
			s.setPword(s2);
			s.setBranch(s4);
			s.setUname(s5);
			s.setRegno(rn);
			s.setAddr(ai);
			sp.savedata(s);
			mv.addObject("rnum",rn);
			mv.setViewName("Success");
			
		}
		else
		{	
			f="false";
		    mv.addObject("u",f);
			mv.setViewName("Failure");
		}
	return mv;
	
	}
	
	@RequestMapping( value = "submit", method = RequestMethod.POST )
	public ModelAndView Logout1(HttpServletRequest req ,HttpServletResponse res,StudentInfo o) throws ServletException, IOException {
		
		Map<String,Object > map= mv.getModel();
		StudentInfo info=  (StudentInfo) map.get("studentInfo");
		sp.delobbyid(info.getId());
		mv.setViewName("Logout");
		return mv;

	
		
	}
}