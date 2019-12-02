package com.liuchang.activeproducer.controller;

import com.liuchang.activeproducer.service.Producer;
import com.liuchang.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：liuchang
 * @ Date       ：Created in 14:13 2019/11/29
 * @ Description：
 * @ Modified By：
 */
@RestController
public class ActiveController {
    @Autowired
    private Producer producer;
    @GetMapping("/stringQueue")
    public void sendStrMessage(){
       // producer.sendStringQueue("stringQueue","I am a String");
        producer.sendStringTopic("stringTopic","I am a String");
    }

    @GetMapping("/stringListQueue")
    public void sendStringListQueue(){
        List list = new ArrayList();
        list.add("asd");
        list.add("zxc");
        list.add("qwe");
        producer.sendStringListQueue("stringListQueue",list);
    }

    @GetMapping("/objQueue")
    public void sendObjQueue(){
        User user = new User();
        user.setId("123");
        user.setName("123");
        user.setAge(23);
        producer.sendObjQueue("stringListQueue",user);
    }

}
