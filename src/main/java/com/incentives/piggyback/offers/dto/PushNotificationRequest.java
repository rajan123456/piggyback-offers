package com.incentives.piggyback.offers.dto;

import java.util.List;

import lombok.Data;

@Data
public class PushNotificationRequest {

	private PushNotificationPayload pushNotificationPayload;
	private List<String> recepients;
}