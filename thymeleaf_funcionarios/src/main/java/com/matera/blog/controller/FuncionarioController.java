package com.matera.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import com.matera.blog.model.Funcionario;
import com.matera.blog.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuncionarioController {
	
	@Autowired
	private PostService service;
	
	@GetMapping("/")
	public ModelAndView findAll() {
		
		ModelAndView mv = new ModelAndView("/funcionario");
		mv.addObject("funcionarios", service.findAll());
		
		return mv;
	}
	
	@GetMapping("/add")
	public ModelAndView add(Funcionario post) {
		
		ModelAndView mv = new ModelAndView("/funcionarioAdd");
		mv.addObject("funcionario", post);
		
		return mv;
	}
	
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {

		return add(service.findOne(id).get());
	}

	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		
		service.delete(id);
		
		return findAll();
	}
	
	@PostMapping("/save")
	public ModelAndView save(Funcionario post, BindingResult result) {
		
		if(result.hasErrors()) {
			return add(post);
		}
		
		service.save(post);
		
		return findAll();
	}
	
}
