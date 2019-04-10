package com.kakao.check.data;

import com.kakao.check.model.CheckInfo;

public interface CheckMapper {

	CheckInfo getCheckInfo(String userId);

}
