package com.wp.controller;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.hibernate.SessionFactory;

import com.wp.model.Student;

public class SearchController {
	@RequestMapping("srchcontroller")
	public ModelAndView search(@RequestParam("sno") int id){
		System.out.println("Insode controller");
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		 Student student=(Student) session.get(Student.class, id);
		 System.out.println(student);
		session.close();
		ModelAndView mv = new ModelAndView("Result");
		mv.addObject("info",student);
		return mv;

}
}
	
