package com.serverless;

import java.util.Collections;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<Object, Object> {

	private static final Logger LOG = LogManager.getLogger(Handler.class);

	@Override
	public Object handleRequest(final Object input, final Context context) {
		LOG.info("received: {}", input);
		return input;
	}
}
