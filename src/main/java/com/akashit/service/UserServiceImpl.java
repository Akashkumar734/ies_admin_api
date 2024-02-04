package com.akashit.service;

import org.springframework.stereotype.Service;

import com.akashit.binding.DashboardCards;
import com.akashit.binding.LoginForm;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public String login(LoginForm loginForm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean recoverPwd(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DashboardCards fetchDashboardInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
