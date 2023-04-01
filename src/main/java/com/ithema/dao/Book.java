package com.ithema.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.PrimitiveIterator;

/**
 * @author wzy
 * @create 2023-04-01 21:02
 */
@Mapper
public interface Book {
    @Insert("")
    void getById();
}
