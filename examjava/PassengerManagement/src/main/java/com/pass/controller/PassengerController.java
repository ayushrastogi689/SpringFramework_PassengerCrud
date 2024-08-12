package com.pass.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pass.model.Passenger;
import com.pass.service.PassengerService;

@Controller
public class PassengerController {
	
	@Autowired
	private PassengerService pService;

	@PostMapping("passenger")
	public ModelAndView save(@ModelAttribute Passenger p) 
	{
		if (p.getMailinglist() == null) 
		{
			p.setMailinglist("false");
		}
		
		pService.save(p);
		
		ModelAndView mv = new ModelAndView();
		
		List<Passenger> list = pService.fetchAll();
		mv.setViewName("display");
		mv.addObject("list", list);
		return mv;

	}

	@GetMapping("list")
	public ModelAndView fetchAll() {
		ModelAndView mv = new ModelAndView();
		List<Passenger> list = pService.fetchAll();
		mv.setViewName("display");
		mv.addObject("list", list);
		return mv;
	}

	@GetMapping("passenger/delete/{id}")
	public ModelAndView delete(@PathVariable("id") int id) {
		pService.remove(id);
		ModelAndView mv = new ModelAndView();
		List<Passenger> list = pService.fetchAll();
		mv.setViewName("display");
		mv.addObject("list", list);
		return mv;

	}

	@PostMapping("/passenger/update/passenger/update/{id}")
	public ModelAndView update(@PathVariable("id") int id, @ModelAttribute Passenger p) {
		pService.update(id, p);
		ModelAndView mv = new ModelAndView();
		List<Passenger> list = pService.fetchAll();
		mv.setViewName("display");
		mv.addObject("list", list);
		return mv;

	}

	@GetMapping("passenger/update/{id}")
	public ModelAndView update(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView();
		List<Passenger> list = pService.fetchAll();
		mv.setViewName("edit");
		mv.addObject("id", id);
		return mv;
	}
}
