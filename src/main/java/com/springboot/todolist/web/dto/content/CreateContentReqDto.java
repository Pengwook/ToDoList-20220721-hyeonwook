package com.springboot.todolist.web.dto.content;

import com.springboot.todolist.domain.todolist.Content;

import lombok.Data;

@Data
public class CreateContentReqDto {
	private String content;
	private int usercode;
	
	public Content toEntity() {
		return Content.builder()
				.content(content)
				.usercode(usercode)
				.build();
	}
}
