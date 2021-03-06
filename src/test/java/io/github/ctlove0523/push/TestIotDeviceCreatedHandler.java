package io.github.ctlove0523.push;

import io.github.ctlove0523.common.push.dto.device.IotDeviceCreatedData;
import io.github.ctlove0523.common.push.handlers.IotDeviceCreatedHandler;
import io.github.ctlove0523.commons.serialization.JacksonUtil;

public class TestIotDeviceCreatedHandler implements IotDeviceCreatedHandler {
	@Override
	public void handle(IotDeviceCreatedData data) {
		System.out.println("begin to handle device created");
		System.out.println(JacksonUtil.object2Json(data));
	}
}
