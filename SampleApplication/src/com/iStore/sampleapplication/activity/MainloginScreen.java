package com.iStore.sampleapplication.activity;

import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.iStore.sampleapplication.R;
import com.iStore.sampleapplication.activity.manager.AlertDialogManager;
import com.iStore.sampleapplication.activity.manager.SessionManager;

public class MainloginScreen extends Activity {

	AlertDialogManager alert = new AlertDialogManager();

	// Session Manager Class
	SessionManager session;

	// Button Logout
	Button btnLogout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen_login);
		session = new SessionManager(getApplicationContext());
		TextView lblName = (TextView) findViewById(R.id.lblName);
		TextView lblEmail = (TextView) findViewById(R.id.lblEmail);
		btnLogout = (Button) findViewById(R.id.btnLogout);
		Toast.makeText(getApplicationContext(),
				"user login status" + session.isLoggedIn(), Toast.LENGTH_SHORT)
				.show();
		 session.checkLogin();
		 HashMap<String, String> user = session.getUserDetails();
	        
	        // name
	        String name = user.get(SessionManager.KEY_NAME);
	        
	        // email
	        String email = user.get(SessionManager.KEY_EMAIL);
	        
	        // displaying user data
	        lblName.setText(Html.fromHtml("Name: <b>" + name + "</b>"));
	        lblEmail.setText(Html.fromHtml("Email: <b>" + email + "</b>"));
	        
	        
	        /**
	         * Logout button click event
	         * */
	        btnLogout.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// Clear the session data
					// This will clear all session data and 
					// redirect user to LoginActivity
					session.logOutUser();
				}
			});
	    }
	        
	
	}


