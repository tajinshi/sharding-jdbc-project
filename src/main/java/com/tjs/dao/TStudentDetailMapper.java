package com.tjs.dao;

import com.tjs.bean.TStudentDetail;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface TStudentDetailMapper {
    @Insert("insert into t_student_detail (student_id,hobby,address,user_id) values (#{student.studentId},#{student.hobby},#{student.address},#{student.userId})")
    Long insertStudentDetail(@Param("student") TStudentDetail student);
}
