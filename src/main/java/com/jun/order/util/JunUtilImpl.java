package com.jun.order.util;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JunUtilImpl extends JunUtil {
	public String getJson(Map<String,Object> map) {
		try {
			String json = new ObjectMapper().writeValueAsString(map);
			return json;
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
