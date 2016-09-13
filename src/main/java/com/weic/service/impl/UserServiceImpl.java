package com.weic.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.weic.dao.UserMapper;
import com.weic.pojo.User;
import com.weic.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userDao;

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}
}
