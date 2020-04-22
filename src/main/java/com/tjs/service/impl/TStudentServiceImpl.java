package com.tjs.service.impl;

import com.tjs.bean.TStudent;
import com.tjs.bean.TStudentDetail;
import com.tjs.dao.TStudentDetailMapper;
import com.tjs.dao.TStudentMapper;
import com.tjs.service.TStudentService;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TStudentServiceImpl implements TStudentService {
    @Autowired
    private TStudentMapper tStudentMapper;
    @Autowired
    private TStudentDetailMapper tStudentDetailMapper;

    /**
     * 分布式事务
     * @param student
     * @return
     */
    @ShardingTransactionType(TransactionType.XA)
    @Transactional
    @Override
    public long insertStudent(TStudent student) {
        tStudentMapper.insertStudent(student);
        TStudentDetail tStudentDetail = new TStudentDetail();
        tStudentDetail.setStudentId(student.getStudentId());
        tStudentDetail.setAddress("西安");
        tStudentDetail.setHobby("打球");
        tStudentDetail.setUserId(123L);
        tStudentDetailMapper.insertStudentDetail(tStudentDetail);
        return 0;
    }

}
