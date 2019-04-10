package com.kakao.check.service;

import org.springframework.stereotype.Service;

import com.kakao.check.model.CheckInfo;

@Service
public interface CheckService {

	CheckInfo getCheckInfo(String userId);

}
