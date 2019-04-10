package com.kakao.check.common;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

/** 
 * <pre>
 * 설명		: 시스템 연동 결과에 따른 성공/실패 코드 설정 유틸리티 클래스
 * 작성일 	: 2015.08.09
 * 작성자 	: bhpark
 * 변경 이력 	:
 * </pre>
 */
public class ResultUtil {
	
	public static class RESULT_CODE{
		public static final String SUCCESS 				= "000";
		
		public static final String NO_API				= "101";
		public static final String INVALID_PARAM		= "102";
		public static final String INVALID_PARAM_KEY	= "103";
		public static final String INVALID_PARAM_VALUE	= "104";
		public static final String DATA_TYPE_ERROR 		= "105";
		public static final String DATA_LENTH_ERROR 	= "106";

		public static final String NO_DATA				= "201";
		public static final String DUPLICATE_DATA		= "202";

		public static final String SYSTEM_ERROR 		= "901";
		public static final String DB_ERROR				= "902";
		public static final String CONNECT_ERROR		= "903";
		
		public static final String ETC_ERROR		    = "999";
		
		
		
	}
	
	/**
	 * 성공 리턴 코드 
	 * @param returnObj
	 * @throws JSONException
	 */
	public static void setSuccess(Map<String, Object> resultMap){
		resultMap.put("rstCd", RESULT_CODE.SUCCESS);
		//resultMap.put("errMsg", "");
	}
	
	/**
	 * 에러 리턴 코드
	 * @param rstCd
	 * @param returnObj
	 * @throws JSONException
	 */
	public static void setError(String rstCd, Map<String, Object> resultMap){
		resultMap.put("rstCd", rstCd);
		resultMap.put("errMsg", MessageUtil.getMessage("ERR."+rstCd));
	}
	
	/**
	 * 에러 리턴 코드
	 * @param rstCd
	 * @param returnObj
	 * @throws JSONException
	 */
	//public static void setError(String rstCd, String[] obj, Map<String, Object> resultMap){
	public static void setError(String rstCd, List<String> invalidParams, Map<String, Object> resultMap){
		resultMap.put("rstCd", rstCd);
		resultMap.put("errMsg", MessageUtil.getMessage("ERR."+rstCd) + " " + invalidParams);
	}
	

}
