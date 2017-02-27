package com.nb.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/view")
public class LoginController {

	//http://blog.csdn.net/java173842219/article/details/54020244
	@RequestMapping(value = "/existUser" ,method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView existUser(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView modelAndView = new ModelAndView("bussiness");
		modelAndView.addObject("userName","tome");
	    return modelAndView;
	}
		
    @RequestMapping("/listBoardTopic.do") 
    public String listBoardTopic(int topicId) {
        System.out.println("call listBoardTopic method.");
        return "listTopic";
    }
}