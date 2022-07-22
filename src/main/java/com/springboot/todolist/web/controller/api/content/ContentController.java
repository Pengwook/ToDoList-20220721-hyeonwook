package com.springboot.todolist.web.controller.api.content;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.todolist.service.ContentService;
import com.springboot.todolist.web.dto.CMRespDto;
import com.springboot.todolist.web.dto.content.CreateContentReqDto;
import com.springboot.todolist.web.dto.content.CreateContentRespDto;
import com.springboot.todolist.web.dto.content.ReadContentRespDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/todolist")
@RequiredArgsConstructor
public class ContentController {
	private final ContentService contentService;
	
	@PostMapping("/content")
	public ResponseEntity<?> addContent(@RequestBody CreateContentReqDto createContentReqDto) {
		CreateContentRespDto createContentRespDto = null;
		try {
			createContentRespDto = contentService.createContent(createContentReqDto);	
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.internalServerError().body(new CMRespDto<>(-1, "게시글 등록 실패", createContentRespDto));
		}
		return ResponseEntity.ok().body(new CMRespDto<>(1, "게시글 등록 성공", createContentRespDto));
	}
	
	@GetMapping("/content/{contentcode}")
	public ResponseEntity<?> getContent(@PathVariable int boardcode) {
		ReadContentRespDto readContentRespDto = null;
		try {
			readContentRespDto = contentService.readContent(boardcode);	
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok().body(new CMRespDto<>(-1, "게시글 조회 실패", readContentRespDto));
		}
		return ResponseEntity.ok().body(new CMRespDto<>(1, "게시글 조회 성공", readContentRespDto));
	}
	
	
	@GetMapping("/list")
	public ResponseEntity<?> getContentList(@RequestParam int page) {
		List<ReadContentRespDto> contentDtoList = null;
		try {
			contentDtoList = contentService.readContentList(page);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok().body(
					new CMRespDto<>(-1, "게시글 리스트 " + page + "페이지 불러오기 실패", contentDtoList));
		}
		
		return ResponseEntity.ok().body(
				new CMRespDto<>(1, "게시글 리스트 " + page + "페이지 불러오기 성공", contentDtoList));
	}
}
