package org.example.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {

    @Insert("INSERT INTO `students`(`id`, `name`, `gender`, `grade`, `score`) VALUES (100, 'test', 1, 1, 99)")
    public void save();

}
