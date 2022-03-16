package com.zohocrm.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailUtilImpl implements EmailUtil {
    @Autowired
    private JavaMailSender emailSender;
    
	@Override
	public void sendEmail(String to, String subject, String emailBody) {
		 
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("sujisri2013@gmail.com");
		message.setTo(to);
		message.setSubject(subject);
		message.setText(emailBody);
		emailSender.send(message);
	}

}
 