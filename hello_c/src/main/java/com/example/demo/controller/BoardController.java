package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
	@GetMapping("/listBoard")
	public String BoardController() {
		System.out.println("2");
		return "게시물 목록!!!!!!!!!!!!!!!!!!!";
	}
}
