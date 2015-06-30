package com.iStore.sampleapplication.activity.manager;

import java.util.HashMap;

import com.iStore.sampleapplication.activity.MainloginScreen;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SessionManager {

	SharedPreferences pref;
	Editor editor;
	Context _context;
	int PRIVATE_MODE = 0;
	private static final String PREF_NAME = "AndroidHivePref";
	// All Shared Preferences Keys
	private static final String IS_LOGIN = "IsLoggedIn";

	// User name (make variable public to access from outside)
	public static final String KEY_NAME = "name";

	// Email address (make variable public to access from outside)
	public static final String KEY_EMAIL = "email";

	public SessionManager(Context context) {
		this._context = context;
		pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
		editor = pref.edit();

	}

	public void createLoginSession(String name, String email) {
		
		editor.putBoolean(IS_LOGIN, true);
		editor.putString(KEY_NAME, name);
		editor.putString(KEY_EMAIL, email);
		editor.commit();

	}
	
	public void checkLogin()
	{
		if(!this.isLoggedIn())
		{
			Intent intent = new Intent(_context,MainloginScreen.class);
			intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			_context.startActivity(intent);
		}
	}
	
	public HashMap<String, String> getUserDetails()
	{
		
		HashMap<String, String> user = new HashMap<String, String>();
		user.put(KEY_EMAIL,pref.getString(KEY_EMAIL, null));
		user.put(KEY_NAME, pref.getString(KEY_NAME, null));
		
		return null;
		
		
		
	}
	
	public void logOutUser() {
		
		editor.clear();
		editor.commit();
		Intent intent = new Intent(_context,MainloginScreen.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		_context.startActivity(intent);
		
	}

	public boolean isLoggedIn() {
		// TODO Auto-generated method stub
		return pref.getBoolean(IS_LOGIN, false);
	}

}
