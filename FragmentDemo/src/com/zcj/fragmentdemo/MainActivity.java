package com.zcj.fragmentdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;

/**
 * 该Demo参考：http://blog.csdn.net/guolin_blog/article/details/8744943
 * 參考：http://blog.csdn.net/guolin_blog/article/details/13171191
 * 
 * @author zcj
 * 
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Display display = getWindowManager().getDefaultDisplay();
		setContentView(R.layout.activity_main);
		// setContentView(R.layout.activity_main_large);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
}
