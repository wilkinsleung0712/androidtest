package mad.topic2.lifecycle.test.fragment;

import com.example.topic2_test.R;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

public class LifecycleTestActivity extends FragmentActivity {
	private String LOG_TAG = this.getClass().getName();
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState){
		Log.i(LOG_TAG,"onCreate() in Fragment mode");
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.life_cycle_test_activity);
	}
}
