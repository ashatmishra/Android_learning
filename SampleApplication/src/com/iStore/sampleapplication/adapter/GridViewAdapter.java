package com.iStore.sampleapplication.adapter;

import java.util.zip.Inflater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.iStore.sampleapplication.R;

public class GridViewAdapter extends BaseAdapter {
	public Context mContext;
	
	

	public int[] imageId = { R.drawable.image1, R.drawable.image2, R.drawable.image3,
			R.drawable.image4, R.drawable.image5, R.drawable.image6,
			R.drawable.image7, R.drawable.image8, R.drawable.image9,
			R.drawable.image10, R.drawable.image11, R.drawable.image12,
			R.drawable.image13, R.drawable.image14, R.drawable.image15

	};
	
	String[] web = { "Google", "Github", "Instagram", "Facebook", "Flickr",
			"Pinterest", "Quora", "Twitter", "Vimeo", "WordPress", "Youtube",
			"Stumbleupon", "SoundCloud", "Reddit", "Blogger"

	};

	public GridViewAdapter(Context c)
	{
		mContext = c;
	}
	
	// Constructor
	public GridViewAdapter(Context c, String[] web,int[] imageId) {
		mContext = c;
		this.web = web;
		this.imageId = imageId;
		
	}


	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return web.length;
	}


	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View grid;
		LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		if(convertView == null)
		{
			grid = new View(mContext);
			grid = inflater.inflate(R.layout.grid_content, null);
			TextView gridText = (TextView)grid.findViewById(R.id.grid_text);
			ImageView gridImage = (ImageView)grid.findViewById(R.id.grid_image);
			gridText.setText(web[position]);
			gridImage.setImageResource(imageId[position]);
		}
		
		else
		{
			grid = (View)convertView;
		}
		return grid;
	}

}