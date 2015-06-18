package com.iStore.sampleapplication.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.iStore.sampleapplication.R;
import com.iStore.sampleapplication.adapter.GridViewAdapter;

public class FullImageActivity extends Activity {
	
	
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.full_image);
		
		Intent intent = getIntent();
		int position = intent.getExtras().getInt("id");
		GridViewAdapter adapter = new GridViewAdapter(FullImageActivity.this);
		
		ImageView fullImageView = (ImageView)findViewById(R.id.full_image_view);
		fullImageView.setImageResource(adapter.imageId[position]);
		Toast.makeText(getApplicationContext(), "the position is" +position, Toast.LENGTH_SHORT).show();
		
		
	}

}
