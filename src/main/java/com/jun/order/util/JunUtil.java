package com.jun.order.util;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;

public abstract class JunUtil {
	protected abstract String getJson(Map<String,Object> map) throws JsonProcessingException;
}
