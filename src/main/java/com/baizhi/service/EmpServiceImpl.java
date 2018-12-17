package com.baizhi.service;

import com.baizhi.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("empService")
@Transactional
public class EmpServiceImpl implements EmpService {
    @Autowired
    EmpService empService;

    public List<Emp> queryAll() {
        List<Emp> emps = empService.queryAll();
        return emps;
    }
}
