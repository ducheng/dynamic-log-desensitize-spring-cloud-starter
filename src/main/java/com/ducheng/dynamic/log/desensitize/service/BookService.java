package com.ducheng.dynamic.log.desensitize.service;

import com.ducheng.dynamic.log.desensitize.entity.BookEntity;
import com.ducheng.dynamic.log.desensitize.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    public List<BookEntity> getList(){
      return   bookMapper.getList();
    }
}
