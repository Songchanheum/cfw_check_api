package com.kakao.check.controller;

import java.net.ConnectException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kakao.check.common.ResultUtil;
import com.kakao.check.common.ResultUtil.RESULT_CODE;

/** 
 * <pre>
 * 설명		: Controller 상위 클래스
 * 작성일 	: 2017.02.08
 * 작성자 	: yccho
 * 변경 이력 	:
 * </pre>
 */
public class BaseController {
	public final Logger logger = LoggerFactory.getLogger(getClass());
	
	@ExceptionHandler(Exception.class)
	/**
	 * Error Map 생성
	 * @param resultMap
	 * @param exception
	 */
	public @ResponseBody void handleError(
			Map<String, Object> resultMap
			, Exception exception) {
		//System.out.println("##########" + exception);
		//System.out.println("##########" + exception.getCause());
		
		String resCd = RESULT_CODE.SYSTEM_ERROR;

		try {
			if(exception instanceof SQLException || exception.getCause() instanceof SQLException)
				resCd = RESULT_CODE.DB_ERROR;
			else if(exception instanceof ConnectException || exception.getCause() instanceof ConnectException)
				resCd = RESULT_CODE.CONNECT_ERROR;
			else
				resCd = RESULT_CODE.SYSTEM_ERROR;
		}
		catch(Exception e) {
			e.printStackTrace();
			resCd = RESULT_CODE.SYSTEM_ERROR;
		}
		
		ResultUtil.setError(resCd, resultMap);

	}
	
	/**
	 * Error Map 생성
	 * @param invalidParams
	 * @param resultMap
	 */
	public void handleError(List<String> invalidParams, Map<String, Object> resultMap) {
		if(invalidParams == null)
			ResultUtil.setError(RESULT_CODE.INVALID_PARAM, resultMap);
		else
			ResultUtil.setError(RESULT_CODE.INVALID_PARAM, invalidParams/*.toArray(new String[0])*/, resultMap);
	}

	
//    public class NullSerializer extends JsonSerializer<Object> {
//		@Override
//		public void serialize(Object arg0, JsonGenerator jgen, SerializerProvider provider)
//				throws IOException, JsonProcessingException {
//			jgen.writeString("");			
//		}
//    }
//    
//    public ObjectMapper getObjectMapper() {
//        ObjectMapper mapper = new ObjectMapper();
//        DefaultSerializerProvider sp = new DefaultSerializerProvider.Impl();
//        //NullSerializer nullSerializer = new NullSerializer();
//        sp.setNullValueSerializer(new NullSerializer());
//        sp.setNullKeySerializer(new NullSerializer());
//        mapper.setSerializerProvider(sp);
//        return mapper;
//    }
}
