package io.github.ctlove0523.amqp.handlers;

import io.github.ctlove0523.amqp.dto.IotDeviceMessage;

public interface IotDeviceMessageHandler {
	void handle(IotDeviceMessage message);
}