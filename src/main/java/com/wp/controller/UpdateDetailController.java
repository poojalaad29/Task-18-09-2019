package com.wp.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.hibernate.SessionFactory;

import com.wp.model.Student;

@Controller
public class UpdateDetailController {
	@RequestMapping("updatedetail")
	public ModelAndView Update(@ModelAttribute("student") Student student){
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.update(student);
		tr.commit();
		session.close();
		ModelAndView mv=new ModelAndView("redirect:Result");
		mv.addObject("info",student);
		return mv;
	}
}
