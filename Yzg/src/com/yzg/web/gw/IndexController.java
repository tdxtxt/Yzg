package com.yzg.web.gw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yzg.web.BaseController;

@Controller
@RequestMapping("/")
public class IndexController extends BaseController {
	@RequestMapping("")
	public String index() {
		return "page/index";
	}
}
