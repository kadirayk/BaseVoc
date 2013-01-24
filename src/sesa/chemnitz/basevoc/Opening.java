package sesa.chemnitz.basevoc;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Opening extends Activity{
	
	MediaPlayer welcome;
	
	@Override
	protected void onCreate(Bundle sweetBundle) {
		// TODO Auto-generated method stub
		super.onCreate(sweetBundle);
		
		setContentView(R.layout.opening);
		welcome = MediaPlayer.create(Opening.this, R.raw.welcome);
		welcome.start();		
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(3000);
				}
				catch (InterruptedException e){
					e.printStackTrace();
				}
				finally{
					Intent openMenu = new Intent("sesa.chemnitz.basevoc.BASEVOC");
					startActivity(openMenu);
				}
			}
		};
		
		timer.start();
		
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

	
	
}
