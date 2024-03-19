package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	
	@GetMapping("/listMember")
	public String listMember() {
		System.out.println("2");
		return "회원목록";
	}
}
