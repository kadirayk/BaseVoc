package sesa.chemnitz.basevoc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Body extends Activity{

	
	
	
	int holder=-1;

	
	String englishWords[]={"head", "face", "hair", "eye", "mouth", "nose", "ear", "tongue", "back", 
			"finger", "toe", "leg", "foot", "heart", "blood", "brain", "tooth", "knee", "sweat", 
			"disease", "bone", "beard", "tear"};
	String turkishWords[]={"baþ", "yüz", "saç", "göz", "aðýz", "burun", "kulak", "dil", "sýrt", 
			"parmak", "ayak parmaðý", "bacak", "ayak", "kalp", "kan", "beyin", "diþ", "diz", "ter", 
			"hastalýk", "kemik", "sakal", "gözyaþý"};
	String germanWords[]={"kopf", "gesicht", "haar", "auge", "mund", "nase", "ohr", "zunge", "zurück", 
			"finger", "zeh", "bein", "fuß", "herz", "blut", "gehirn", "zahn", "knie", "schwitzen", 
			"krankheit", "knochen", "bart", "reißen"};
	
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
		
		word.setText(R.string.body);
		
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
					
					word.setText(R.string.s_head+holder);
				}
				
				
			}
		});
		
	}
	
}
