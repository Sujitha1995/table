package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.zohocrm.util.EmailUtil;

@Controller
public class EmailController {
	
	@Autowired
	private EmailUtil emailUtil;
	
	@RequestMapping("sendEmail")
	public String sendEmail(@RequestParam("email") String email,ModelMap modelMap) {
		//System.out.println(email);
        modelMap.addAttribute("email",email);
		return "composeEmail";
	}
	@RequestMapping("/send")
	public String sendEmail(@RequestParam("to") String to,@RequestParam("subject") String subject,@RequestParam("emailBody") String emailBody,ModelMap modelMap) {
//  System.out.println(to);
//  System.out.println(subject);
//  System.out.println(emailBody);
	emailUtil.sendEmail(to, subject, emailBody);	
	modelMap.addAttribute("msg","Email Sent!!!!!!");
	return "composeEmail";
	}
	
	
}
