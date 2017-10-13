package com.yzg.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class BaseController {
	/**
	 * �û���תJSPҳ��
	 * �˷���������Ȩ�޿���
	 * @param folder ·��
	 * @param jspName JSP����(���Ӻ�׺)
	 * @return ָ��JSPҳ��
	 */
	@RequestMapping("/{folder}/{jspName}")
	public String redirectJsp(@PathVariable String folder, @PathVariable String jspName) {
		return "/" + folder + "/" + jspName;
	}
}
