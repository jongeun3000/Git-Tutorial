package com.acorp.app;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.acorp.app.util.Criteria;
import com.acorp.app.util.PageMaker;
import com.acorp.app.util.SearchCriteria;
import com.acorp.test.BoardtstService;
import com.acorp.test.BoardtstVO;


@Controller
@RequestMapping("/test/board")
public class BoardtstController {

	private static final Logger logger = LoggerFactory.getLogger(BoardtstController.class);
	
	@Inject
	private BoardtstService service;
	
	@RequestMapping(value="/tb", method = RequestMethod.GET)
	 public String preparing() throws Exception {
		
	    return "test/test-board";
	 }
	
}