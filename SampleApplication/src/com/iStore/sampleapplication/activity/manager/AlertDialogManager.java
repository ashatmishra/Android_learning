package com.iStore.sampleapplication.activity.manager;

import com.iStore.sampleapplication.R;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class AlertDialogManager {
	
	@SuppressWarnings("deprecation")
	public void showAlertDialog(Context context,String title,String message,Boolean status)
	{
		AlertDialog alertDialog = new AlertDialog.Builder(context).create();
		alertDialog.setMessage(message);
		alertDialog.setTitle(title);
		if(status != null)
		{
			alertDialog.setIcon((status)? (R.drawable.success) :(R.drawable.fail) );
		}
		
		alertDialog.setButton("ok", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				
				
			}
			
		});
		alertDialog.show();
		
	}

}
