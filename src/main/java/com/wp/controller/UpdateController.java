package com.wp.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContext;

import com.wp.model.Student;
@Controller
public class UpdateController {
	@RequestMapping("updatecontroller")
	public ModelAndView Delete(@ModelAttribute("info") Student stu,@RequestParam("sno") int id){
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Student student=(Student) session.get(Student.class, id);
		session.close();
	    ModelAndView mv=new ModelAndView("UpdateDetailPage");
	    mv.addObject("students", student);
		return mv;
}
}
