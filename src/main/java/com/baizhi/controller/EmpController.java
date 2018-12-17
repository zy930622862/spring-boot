package com.baizhi.controller;

import com.baizhi.entity.City;
import com.baizhi.entity.Emp;
import com.baizhi.mapper.CityMapper;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")

public class EmpController {
    @Autowired
    EmpService empService;
    @Autowired
    CityMapper cityMapper;

    @RequestMapping("/queryAll")
    public List<Emp> queryAll() {
        List<Emp> emps = empService.queryAll();
        System.out.println("sdfgdsgdfgdfgdfg");
        return emps;
    }

    @RequestMapping("/queryCity")
    public City queryCity() {

        City city = cityMapper.selectByPrimaryKey(1L);
        return city;
    }
}
