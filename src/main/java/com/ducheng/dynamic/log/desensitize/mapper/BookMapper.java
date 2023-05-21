package com.ducheng.dynamic.log.desensitize.mapper;

import com.ducheng.dynamic.log.desensitize.entity.BookEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {

    List<BookEntity> getList();
}
