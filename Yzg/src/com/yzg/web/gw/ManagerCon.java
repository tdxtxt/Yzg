package com.yzg.web.gw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manager")
public class ManagerCon {
	@RequestMapping("")
	public String index() {
		return "page/index";
	}
}
