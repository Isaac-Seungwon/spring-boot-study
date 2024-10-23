package com.web.lovetrail.map.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.lovetrail.map.repository.MapDAO;

@Service
public class MapService {

	@Autowired
	private MapDAO mapDao;

}
