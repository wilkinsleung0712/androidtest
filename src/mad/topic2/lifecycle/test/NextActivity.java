package mad.topic2.lifecycle.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import com.example.topic2_test.R;

public class NextActivity extends Activity {
	private String LOG_TAG = this.getClass().getName();
	
	public void onCreate(Bundle savedInstanceState){
		Log.i(LOG_TAG, "onCreate() in NextActivity");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.next);
		View button = this.findViewById(R.id.previousActivityButton);
		button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				previousActivity(v);
			}
			
		});
	}

	protected void previousActivity(View v) {
		// TODO Auto-generated method stub
		Log.i(LOG_TAG, "previousActivity() finish()");
		// only needed for startActivityForResult(...)
		this.setResult(RESULT_OK,null);
		 // finish this activity and remove from back stack
	      //finish();
		  // alternatively we can create a new instance of the previous activity
	      // note that this will cause a different set of transitions
		 Intent myIntent = new Intent(this, LifecycleTestActivity.class);
	       startActivity(myIntent);
	       // or if we want to start a completely different activity to test implicit
	       // filters
	       // this brings up google maps of RMIT location (using explicit lat and
	       // long)
	       // NOTE: Is buggy on the emulator so better to run on real device
//	       String uri = String.format(Locale.getDefault(), "geo:%f,%f", -37.808111,
//	             144.963784);
//	       Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
//	       this.startActivity(intent);
	}
}
