package com.jd.gallery;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jd.gallery.user.service.userService;
import com.jd.gallery.user.vo.userVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class mainController {
	
	private static final Logger logger = LoggerFactory.getLogger(mainController.class);
//    
//	@Autowired
	private userService userService;
	
	@RequestMapping(value="/")
    public String index() {
        
        return "login";
    }
    
    @RequestMapping(value="/login")
    public String login() {
        
        return "LoginPage";
    }
    
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
   	public String login(@RequestParam(value = "password") String password) {
    	System.out.println("파라미터넘어옴");
    	System.out.println(password);
    	
    	userVO user = userService.selectOneUser(password);
    	System.out.println(user.toString());
    	return "LoginPage";
   	}
    
	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public String main(Locale locale, Model model) {
		
		return "template";
	}
	
}
