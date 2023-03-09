package com.lovenoteservice.lovenoteservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("userinfo")
public class UserInfoController {
    @Autowired(required = false)
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/getAllUserInfo", method = RequestMethod.GET)
    @ResponseBody
    /*
     * List 里的对象是Map对象，而Map对象是
     * 由一个String类型的键和Object类型的值组成
     * */
    public List<Map<String, Object>> getAllUsers() {
        String sql = "select * from userinfo";//SQL查询语句
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }
}
