package com.iStore.sampleapplication.activity;

import com.iStore.sampleapplication.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {
	
	private static int SPLASH_TIME_OUT = 3000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);
		
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent intent = new Intent(SplashScreen.this, MainScreen.class);
				startActivity(intent);
			}
		},SPLASH_TIME_OUT);
	}

}
