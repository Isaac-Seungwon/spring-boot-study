package com.web.lovetrail.map.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.web.lovetrail.map.mapper.MapMapper;

@Primary
@Repository
public class MapDAOImpl implements MapDAO{
	
	@Autowired
	private MapMapper mapMapper;
	
}
