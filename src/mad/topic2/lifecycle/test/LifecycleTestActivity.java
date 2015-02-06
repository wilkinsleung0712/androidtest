package mad.topic2.lifecycle.test;


import com.example.topic2_test.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class LifecycleTestActivity extends Activity {
	private String LOG_TAG=this.getClass().getName();
	/*Called when the activity is first created.*/
	public void onCreate(Bundle savedInstanceState){
		Log.i(LOG_TAG, "onCreate()");
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.life_cycle_test);
		
		View button=this.findViewById(R.id.nextActivityButton);
		button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				nextActivity(v);
			}
			
		});
	}
	protected void nextActivity(View v) {
		// TODO Auto-generated method stub
		Log.i(LOG_TAG, "clicked on next activity button");
		//An intent is an abstract description of an operation to be performed
		Intent myIntent = new Intent(this,NextActivity.class);
		//same as startActivity but it return the result so we can valudate the result code
		this.startActivityForResult(myIntent,1);
		
	}
	
	protected void onActivityResult(int requestCode,int resultCode,Intent data){
		Log.i(LOG_TAG, "on ActivityResult():"+resultCode);
		super.onActivityResult(requestCode, resultCode, data);
	}
	
}
