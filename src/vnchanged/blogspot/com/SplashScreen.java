package vnchanged.blogspot.com;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class SplashScreen extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
		Thread splashThread = new Thread() {
			@Override
			public void run() {
				try {
					int waited = 0;
					while (waited < 1500) {
						sleep(100);
						waited += 100;
					}
				} catch (InterruptedException e) {
					// do nothing
				} finally {

					Intent i = new Intent(SplashScreen.this, MainActivity.class);
					startActivity(i);
					overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
					finish();
				}
			}
		};
		splashThread.start();
	}
}
