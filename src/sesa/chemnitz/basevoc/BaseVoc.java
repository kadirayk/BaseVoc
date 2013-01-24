package sesa.chemnitz.basevoc;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BaseVoc extends Activity {
	
	Button motherTurkish;
	Button motherEnglish;
	Button motherGerman;
	public int sLanguage;
	TextView display;
	TextView fgh;
		
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_voc);
        sLanguage=0;
        
        
        motherTurkish = (Button) findViewById(R.id.turkce);
        motherEnglish = (Button) findViewById(R.id.english);
        motherGerman = (Button) findViewById(R.id.german);
        
        display = (TextView) findViewById(R.id.language);
        motherTurkish.setOnClickListener(new View.OnClickListener() {
			
        	
        		
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				
				display.setText(R.string.v_colors);
				Intent trMenu = new Intent("sesa.chemnitz.basevoc.MENU");
				
				startActivity(trMenu);
				
			}
		});
        
        motherEnglish.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				display.setText(R.string.v_animals);

				Intent enMenu = new Intent("sesa.chemnitz.basevoc.MENU");
				startActivity(enMenu);
				
			}
		});
        
        
        
        motherGerman.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				display.setText(R.string.v_city);
				Intent deMenu = new Intent("sesa.chemnitz.basevoc.MENU");
				startActivity(deMenu);
				
				
				
			}
		});
     
        
    }

    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_base_voc, menu);
        return true;
    }
}
