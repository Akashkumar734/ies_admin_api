package com.akashit.service;

import java.util.List;

import com.akashit.binding.UnlockAccForm;
import com.akashit.binding.UserAccountForm;

public interface AccountService {

	public boolean createUserAccount(UserAccountForm accForm);
	
	public List<UserAccountForm> fetchUserAccounts();
	
	public UserAccountForm getUserAccById(Integer accId);
	
	public String changeAccStatus(Integer accId, String status);
	
	public String unlockUserAccount(UnlockAccForm unlockAccForm);
	
	
	
	
	
	
	
}
