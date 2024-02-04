package com.akashit.service;

import com.akashit.binding.DashboardCards;
import com.akashit.binding.LoginForm;

public interface UserService {

	public String login(LoginForm  loginForm);
	
	public boolean recoverPwd(String email);
	
	public DashboardCards fetchDashboardInfo();
}
