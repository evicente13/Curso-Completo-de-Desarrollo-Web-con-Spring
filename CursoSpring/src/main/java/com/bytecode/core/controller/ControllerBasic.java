package com.bytecode.core.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bytecode.core.model.Post;

@Controller
@RequestMapping("/home")
public class ControllerBasic {
	
	@GetMapping({"/post","/"})
	public String saludar(Model model) {
		model.addAttribute("posts", this.getPosts());
		return "index";
	}
	
	public List<Post> getPosts(){
		ArrayList<Post> post = new ArrayList<>();
		post.add(new Post(1, "Desarrollo web es un término que define la creación de sitios web para Internet o una intranet.","http://localhost/img/mario.jpg", new Date(),"Desarrollo Web"));
		post.add(new Post(2, "Desarrollo web es un término que define la creación de sitios web para Internet o una intranet.","http://localhost/img/mario.jpg", new Date(),"Desarrollo Web Front End"));
		post.add(new Post(3, "Desarrollo web es un término que define la creación de sitios web para Internet o una intranet.","http://localhost/img/mario.jpg", new Date(),"Desarrollo Web Back End"));
		post.add(new Post(4, "Desarrollo web es un término que define la creación de sitios web para Internet o una intranet.","http://localhost/img/mario.jpg", new Date(),"Desarrollo Web UX/UI"));
		
		return post;
	}
}
