package com.springboot.todolist.web.controller.api.content;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.todolist.service.ContentService;
import com.springboot.todolist.web.dto.content.CreateContentRespDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/todolist")
@RequiredArgsConstructor
public class ContentController {
	private final ContentService contentService;
	
	@PostMapping("/content")
	public ResponseEntity<?> addContent(@RequestBody CreateContentRespDto createContentRespDto)
}
