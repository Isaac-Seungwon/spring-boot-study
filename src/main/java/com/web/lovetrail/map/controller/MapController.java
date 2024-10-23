package com.web.lovetrail.map.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.lovetrail.map.service.MapService;

@Controller
@RequestMapping(value = "/map")
public class MapController {

	@Autowired
	private MapService mapService;

	@GetMapping(value="/main.do")
	public String mainMap(Model model) {
		
		return "member/map/mainmap";
	}
	
}
