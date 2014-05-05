package com.jimsuplee.femaleastronauts;

//import android.R;
import android.os.Bundle;
//import android.app.Activity;
//import android.view.Menu;
//import android.widget.ImageView;
//import java.util.HashMap;
//import java.util.Map;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
//import android.util.Log;
//import android.widget.Button;
//import android.R;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import android.widget.Toast;
//import android.database.Cursor;
//import android.widget.EditText;
//import java.util.List;
//import java.util.ArrayList;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.app.ListActivity;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
//import android.net.Uri;
import android.widget.LinearLayout;


public class FemaleAstronautsActivity extends ListActivity {
	static final String TAG = "ASTRO";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		//photoMap.put("ACAZ C.2 2 seat fighter",R.drawable.belgium);
		//Shannon_Walker
		//Dorothy_Marie_Dottie_Metcalf_Lindenburger

	    super.onCreate(savedInstanceState);
	    Context ctx = getApplicationContext();
	    setContentView(R.layout.activity_female_astronauts);
	    Resources res = ctx.getResources();
	    String[] options = res.getStringArray(R.array.astronauts);
	    TypedArray icons = res.obtainTypedArray(R.array.astronaut_icons);
	    setListAdapter(new ImageAndTextAdapter(ctx, R.layout.main_list_item, options, icons));
	    ListView listView = getListView();
	    listView.setTextFilterEnabled(true);
		listView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				//Intent i = new Intent("");
				Intent iAstronaut = new Intent("com.jimsuplee.femaleastronauts.Astronaut");
				//NO
				//Intent iAstronaut = new Intent("Astronaut");
				//NO:This item is not a TextView but is a LinearLayout
				//String astronautChoice = ((TextView) view).getText().toString();
				LinearLayout ll = (LinearLayout) view;
				TextView tv = (TextView) ll.findViewById(R.id.option_text);
				String astronautChoice = tv.getText().toString();
				iAstronaut.putExtra("astronautChoice", astronautChoice);
				//startActivityForResult(iAstronaut, 0);
				//Log.w(TAG, "In Astronaut, about to startActivity(iAstronaut)");
				startActivity(iAstronaut);
				//i.setData(Uri.parse(astronautChoice));
				//setResult(RESULT_OK, i);
				//finish();
				
			}
		});
	}
}

/**
package com.jimsuplee.femaleastronauts;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class FemaleAstronautsActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_female_astronauts);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.female_astronauts, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
/**	
public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(
					R.layout.fragment_female_astronauts, container, false);
			return rootView;
		}
	}

}
*/