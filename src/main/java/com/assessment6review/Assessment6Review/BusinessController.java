package com.assessment6review.Assessment6Review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.assessment6review.Assessment6Review.dao.BusinessRepository;
import com.assessment6review.Assessment6Review.entity.Business;

@Controller
public class BusinessController {

	@Autowired 
	BusinessRepository b;
	
	
	@RequestMapping ("/")
	public ModelAndView home(){
		return new ModelAndView ("index", "bus", b.findAll());
		
	}
	
	@RequestMapping ("/create-business")
	public ModelAndView add(@RequestParam ("name") String name, @RequestParam ("location") String location) {
		b.save(new Business(name, location));
		return new ModelAndView ("redirect:/");
	}
	
	
//	@RequestMapping("update") //passes in id and prepopulated feilds
//	public ModelAndView update(@RequestParam ("id") Integer id) {
//		ModelAndView mv = new ModelAndView ("update", "id", id );
//		mv.addObject("help", b.findById(id).orElse(null).getName());
//		return mv;
//	}
//	
//	
	
}
