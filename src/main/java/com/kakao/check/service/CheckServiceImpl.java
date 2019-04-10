package com.kakao.check.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.kakao.check.data.CheckMapper;
import com.kakao.check.model.CheckInfo;

public class CheckServiceImpl implements CheckService{
	
	@Autowired
	CheckMapper checkMapper;
	
	@Autowired
	Configuration configuration;
	
	@Override
	public CheckInfo getCheckInfo(String userId) {
		// TODO Auto-generated method stub
		CheckInfo ch = checkMapper.getCheckInfo(userId);
		
		return ch;
	}

	
}
