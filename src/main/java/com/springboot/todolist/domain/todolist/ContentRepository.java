package com.springboot.todolist.domain.todolist;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ContentRepository {
	public int save(Content content);
	public Content findContentByContentcode(int Contentcode);
	public List<Content> getContentListOfIndex(int index); 
}
