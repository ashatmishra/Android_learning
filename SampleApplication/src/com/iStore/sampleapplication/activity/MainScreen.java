package com.iStore.sampleapplication.activity;

import com.iStore.sampleapplication.R;
import com.iStore.sampleapplication.adapter.GridViewAdapter;

import android.R.integer;
import android.R.string;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainScreen extends Activity {

	GridView grid;
	public int[] imageId = { R.drawable.image1, R.drawable.image2,
			R.drawable.image3, R.drawable.image4, R.drawable.image5,
			R.drawable.image6, R.drawable.image7, R.drawable.image8,
			R.drawable.image9, R.drawable.image10, R.drawable.image11,
			R.drawable.image12, R.drawable.image13, R.drawable.image14,
			R.drawable.image15

	};

	String[] web = { "SignIn", "Github", "Instagram", "Facebook", "Flickr",
			"Pinterest", "Quora", "Twitter", "Vimeo", "WordPress", "Youtube",
			"Stumbleupon", "SoundCloud", "Reddit", "Blogger"

	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_screen);

		GridViewAdapter adapter = new GridViewAdapter(MainScreen.this, web,
				imageId);

		GridView grid = (GridView) findViewById(R.id.grid_view);

		grid.setAdapter(adapter);

		grid.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub

				Intent intent;
				if (position== 0) {
					intent = new Intent(MainScreen.this, MainloginScreen.class);
					intent.putExtra("id", position);
					startActivity(intent);
				} else {
					Intent i = new Intent(MainScreen.this,
							FullImageActivity.class);
					i.putExtra("id", position);
					startActivity(i);

				}

			}
		});
	}

}
