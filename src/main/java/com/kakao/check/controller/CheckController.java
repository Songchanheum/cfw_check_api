
package com.kakao.check.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kakao.check.common.ResultUtil;
import com.kakao.check.common.ResultUtil.RESULT_CODE;
import com.kakao.check.model.CheckInfo;
import com.kakao.check.service.CheckService;


@Controller
@Configuration
@ComponentScan("com.kakao.check.service")
public class CheckController extends BaseController {
	
	@Autowired
	CheckService checkService;
	
	@RequestMapping(value = "/check/info/{userId}", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> camInfo(@PathVariable("userId") String userId) {
		
		String procTitle = "[출퇴근 정보 조회] ";
		logger.info(procTitle + "Start check Info :: ");
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		CheckInfo checkInfo = null;
		
		try {		
			checkInfo = checkService.getCheckInfo(userId);
			
		}
		catch(Exception e) {
			logger.error(procTitle + "Exception :: ", e);
			ResultUtil.setError(RESULT_CODE.SYSTEM_ERROR, resultMap);
		}

		logger.debug(procTitle + "Result :: " + resultMap.toString());
		logger.info(procTitle + "End camInfo :: ");
		
		return resultMap;
	}
	
	private void verifyResult(Map<String, Object> resultMap) {
		try {
			if(resultMap.containsKey("rstCode")) {
				resultMap.put("rstCd", (String)resultMap.get("rstCode"));
				resultMap.remove("rstCode");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
