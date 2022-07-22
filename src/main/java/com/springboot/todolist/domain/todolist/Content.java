package com.springboot.todolist.domain.todolist;

import java.time.LocalDateTime;

import com.springboot.todolist.web.dto.content.CreateContentRespDto;
import com.springboot.todolist.web.dto.content.ReadContentRespDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Content {
	private int contentcode;
	private String content;
	private int usercode;
	private String username;
	private String name;
	private String email;
	private LocalDateTime createdate;
	private LocalDateTime updatedate;
	
	public CreateContentRespDto tocreateContentDto() {
		return CreateContentRespDto.builder()
				.contentcode(contentcode)
				.content(content)
				.usercode(usercode)
				.build();
	}
	
	public ReadContentRespDto toreadContentDto() {
		return ReadContentRespDto.builder()
				.contentcode(contentcode)
				.content(content)
				.usercode(usercode)
				.username(username)
				.createdate(createdate)
				.build();
				
	}
}
