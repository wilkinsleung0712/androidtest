package mad.topic2.lifecycle.test.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.example.topic2_test.R;

public class LifecycleTestFragment extends Fragment{
	private String LOG_TAG = this.getClass().getName();
	public void onCreate(Bundle savedInstanceState){
		Log.i(LOG_TAG, "onCreate() in LifecycleTestFragment");
		super.onCreate(savedInstanceState);
	}
	/** Called when the fragment is first created. */
	public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
		Log.i(LOG_TAG, "onCreateView() in LifecycleTestFragment");
		//init the view to the first GUI file.
		View view = inflater.inflate(R.layout.life_cycle_test_fragment, container, false);
		
		View button = view.findViewById(R.id.nextActivityButton);
		button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				nextActivity(v);
			}
			
		});
		return view;
	}
	protected void nextActivity(View v) {
		// TODO Auto-generated method stub
		 Log.i(LOG_TAG, "nextActivity()  in LifecycleTestFragment");
		 Intent intent = new Intent(getActivity(),NextActivity.class);	
		 this.startActivity(intent);
	}
	
}
