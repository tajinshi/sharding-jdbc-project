package com.tjs.dao;

import com.tjs.bean.TStudent;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface TStudentMapper {
    @Insert("insert into t_student (student_name,student_code,phone,user_id) values (#{studentName},#{studentCode},#{phone},#{userId})")
    @Options(useGeneratedKeys = true,keyProperty = "studentId",keyColumn = "student_id")
    Long insertStudent( TStudent student);

    @Select("SELECT * from t_student s JOIN t_student_detail d WHERE s.student_id = d.student_id and s.student_id = #{studentId}")
    List<Map<String,Object>>  selectList(Long studentId);
}
