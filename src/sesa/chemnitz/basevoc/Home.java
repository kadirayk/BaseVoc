package sesa.chemnitz.basevoc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends Activity{

	
	
	
	int holder=-1;

	
	String englishWords[]={"table", "chair", "clock", "bed", "lamp", "window", "door", "bedroom", "kitchen", "bathroom", "pencil", "pen", 
			"photograph", "soap", "phone", "computer", "camera", "television", "book", "key", "paint"};
	String turkishWords[]={"masa", "sandalye", "saat", "yatak", "lamba", "pencere", "kapý", "yatak odasý", "mutfak", "banyo", "kurþunkalem", "tükenmez kalem", 
			"fotoðraf", "sabun", "telefon", "bilgisayar", "fotoðraf makinesi", "televizyon", "kitap", "anahtar", "resim"};
	String germanWords[]={"tisch", "stuhl", "uhr", "bett", "lampe", "fenster", "tür", "schlafzimmer", "küche", "badezimmer", "bleistift", "kugelschreiber", 
			"foto", "sabun", "telefon", "computer", "kamera", "fernseher", "buche", "schlüssel", "malen"};
	
	int n = englishWords.length-1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.card);
	
		final boolean calleren = getIntent().getBooleanExtra("calleren", false);
		final boolean callertr = getIntent().getBooleanExtra("callertr", false);
		final boolean callerde = getIntent().getBooleanExtra("callerde", false);
		
		
		Button PrevButton = (Button) findViewById(R.id.prevButton);
		Button NextButton = (Button) findViewById(R.id.nextButton);
		Button studyButton = (Button) findViewById(R.id.studyButton);
		final TextView word = (TextView) findViewById(R.id.word);
		
		word.setText(R.string.home);
		
		PrevButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				holder--;
				
				if(holder<0){
					holder=0;
				}
				if(callertr){
					word.setText(turkishWords[holder]);
					}
				else if(calleren){
					word.setText(englishWords[holder]);
				}
				else if(callerde){
					word.setText(germanWords[holder]);
				}
				
			}
			
			
		});
		
		NextButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				holder++;
				if(holder>n){
					holder=n;
				}
				if(callertr){
					word.setText(turkishWords[holder]);
					}
				else if(calleren){
					word.setText(englishWords[holder]);
				}
				else if(callerde){
					word.setText(germanWords[holder]);
				}
			}
		});
		
		studyButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(holder!=-1){
					
					word.setText(R.string.s_table+holder);
				}
				
				
			}
		});
		
	}
	
}
