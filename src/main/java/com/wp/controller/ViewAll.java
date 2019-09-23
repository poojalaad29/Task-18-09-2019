package com.wp.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wp.model.Student;


@Controller
public class ViewAll {
	@RequestMapping("viewallstudents")
	public ModelAndView showAllStudents(){
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Criteria cr=session.createCriteria(Student.class);
		List<Student> students=cr.list();
		session.close();
		ModelAndView mv=new ModelAndView("allstudent");
		mv.addObject("students", students);
		return mv;
	}

}
