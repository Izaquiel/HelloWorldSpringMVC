/**
 * 
 */
package br.com.ic.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Izaquiel Cruz
 *
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/controller")
	public ModelAndView hello() {
		String mensagem = "Hello World Spring MCV!!!";
		return new ModelAndView("/hello/view", "msg", mensagem);

	}
}
