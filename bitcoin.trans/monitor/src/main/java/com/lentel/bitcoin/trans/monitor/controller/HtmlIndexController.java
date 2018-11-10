
package com.lentel.bitcoin.trans.monitor.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlIndexController {
    
	@RequestMapping("/index")
    public String index() {

    	return "index";
    }
	

}
