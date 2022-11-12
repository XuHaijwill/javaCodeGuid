package org.example.dao;

import org.example.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class IndexDao implements Dao{

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public void query() {
        namedParameterJdbcTemplate.update("INSERT INTO `students`(`id`, `name`, `gender`, `grade`, `score`) VALUES (101, 'test', 1, 1, 99)",new HashMap(){});
        System.out.println("dao ---------- query");
        System.out.println(1/0);
    }

    @Override
    public void query1(String ss) {

    }
}
