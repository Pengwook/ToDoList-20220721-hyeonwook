package com.springboot.todolist.service;

import java.util.List;

import com.springboot.todolist.web.dto.content.CreateContentReqDto;
import com.springboot.todolist.web.dto.content.CreateContentRespDto;
import com.springboot.todolist.web.dto.content.ReadContentRespDto;

public interface ContentService {
	public CreateContentRespDto createContent(CreateContentReqDto createContentReqDto) throws Exception;
	public ReadContentRespDto readContent(int Contentcode) throws Exception;
	public List<ReadContentRespDto> readContentList(int page) throws Exception;
}
