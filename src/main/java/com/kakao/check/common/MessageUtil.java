package com.kakao.check.common;

import java.util.Locale;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * 설명		: 공통 메새지 유틸리티 클래스
 * 작성일 	: 2015.08.09
 * 작성자 	: bhpark
 * 변경 이력 	:
 * </pre>
 */
@Component
public class MessageUtil {

	private static MessageSourceAccessor msAcc = null;

	private static Locale locale = Locale.KOREAN;

	public void setMessageSourceAccessor(MessageSourceAccessor msAcc) {
		MessageUtil.msAcc = msAcc;
	}

	public static String getMessage(String key) {
		return msAcc.getMessage(key, locale);
	}

	public static String getMessage(String key, Object[] objs) {
		return msAcc.getMessage(key, objs, locale);
	}	

}
