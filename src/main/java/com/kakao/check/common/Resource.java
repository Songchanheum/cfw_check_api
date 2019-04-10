package com.kakao.check.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * 설명		: 공통 Resource 클래스
 * 변경 이력 	:
 * </pre>
 */
@SuppressWarnings("PMD")
public class Resource {
	
	/**
	 * TIME OUT 설정값
	 */
	public static int CONNECT_TIMEOUT = 3000;
	public static int READ_TIMEOUT = 5000;
	
}
