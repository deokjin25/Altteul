package com.c203.altteulbe.room.service.exception;

import org.springframework.http.HttpStatus;

import com.c203.altteulbe.common.exception.BusinessException;

public class RoomNotInWaitingStateException extends BusinessException {
	public RoomNotInWaitingStateException() {
		super("대기 중인 방에만 입장할 수 있습니다.", HttpStatus.BAD_REQUEST, 466);
	}
}
