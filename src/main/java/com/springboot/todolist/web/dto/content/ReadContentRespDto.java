package com.springboot.todolist.web.dto.content;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReadContentRespDto {
	private int contentcode;
	private int usercode;
	private String content;
	private String username;
	private LocalDateTime createdate;
}
