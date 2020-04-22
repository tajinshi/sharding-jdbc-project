package com.tjs.dao;

import com.tjs.bean.TStudent;
import com.tjs.service.TStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TStudentTest {
    @Autowired
    private TStudentMapper studentMapper;

    @Autowired
    private TDescMapper tDesc;

    @Autowired
    private TStudentService tStudentService;
    @Test
    public void insertTest() {
        for (int i = 0; i < 10; i++) {
            TStudent student = new TStudent();
            student.setStudentName("小明"+1);
            student.setPhone(1360926548L);
            student.setUserId((long) i);
            studentMapper.insertStudent(student);
            System.out.println(student.getStudentId());
        }
    }

    @Test
    public void insertDescTest() {
        for (int i = 0; i < 10; i++) {
            tDesc.insertDesc("USEE_TYPE","1","管理员");
        }
    }

    /**
     * 测试水平分表，添加绑定表
     */
    @Test
    public void insertStudentDetailTest() {
        for (int i = 0; i < 10; i++) {
            TStudent student = new TStudent();
            student.setStudentName("小明"+1);
            student.setPhone(1360926548L);
            student.setUserId(4L);
            tStudentService.insertStudent(student);
            System.out.println(student.getStudentId());
        }
    }

    /**
     * 测试水平分表，添加绑定表
     */
    @Test
    public void selectStudentAndDetail() {
        studentMapper.selectList(459744171704451072L);
    }
}
