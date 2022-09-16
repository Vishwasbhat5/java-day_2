package com.sonata.Implementation;

import com.sonata.Interface.LoginIntf;
import com.sonata.Interface.UserIntf;

public class LoginImpl implements LoginIntf{
	private UserIntf valUser;

	@Override
	public boolean getValUser(String uname, String pass) {
		if(valUser.validateUser(uname, pass)) {
			return true;
		} else {return false;}
	}

	public void setValUser(UserIntf valUser) {
		this.valUser = valUser;
	}
	
	
}
