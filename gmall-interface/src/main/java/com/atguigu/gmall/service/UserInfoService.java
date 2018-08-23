package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    public List<UserInfo> getUserInfoList();

    public List<UserAddress> getUserAddressList(String userId);
}
