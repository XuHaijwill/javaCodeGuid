package org.example.dao;

import org.example.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;

@Component
public class IndexDao implements Dao{

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Transactional
    @Override
    public int insert() {
        int cnt = namedParameterJdbcTemplate.update("INSERT INTO `students`(`id`, `name`, `gender`, `grade`, `score`) VALUES (102, 'test', 1, 1, 99)", new HashMap() {
        });
        System.out.println("dao ---------- insert");
        System.out.println(1/0);
        return cnt;
    }

    @Override
    public void query() {
        System.out.println("dao ---------- query");
    }

    @Override
    public void query1(String ss) {

    }
}
