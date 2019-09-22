package com.wp.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wp.model.Student;

@Controller
public class InsertController {
	@RequestMapping("insertcontroller")
	public ModelAndView Insert(@ModelAttribute("info") Student stu){
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
				session.save(stu);
				tr.commit();

		ModelAndView mv=new ModelAndView("Result");
		return mv;

		
	}

}
