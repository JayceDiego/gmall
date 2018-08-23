package com.atguigu.gmall.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {
    @Reference
    private UserInfoService userInfoService;

    @ResponseBody
    @RequestMapping("trade")
    public List<UserAddress> trade(String userId){
        List<UserAddress> userAddressList = userInfoService.getUserAddressList(userId);
        return  userAddressList;
    }

}