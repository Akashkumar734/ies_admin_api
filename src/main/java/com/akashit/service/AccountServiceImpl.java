package com.akashit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.akashit.binding.UnlockAccForm;
import com.akashit.binding.UserAccountForm;

@Service
public class AccountServiceImpl implements AccountService{

	@Override
	public boolean createUserAccount(UserAccountForm accForm) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<UserAccountForm> fetchUserAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserAccountForm getUserAccById(Integer accId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changeAccStatus(Integer accId, String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String unlockUserAccount(UnlockAccForm unlockAccForm) {
		// TODO Auto-generated method stub
		return null;
	}

}
