package sesa.chemnitz.basevoc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Nature extends Activity{

	
	
	
	int holder=-1;

	
	String englishWords[]={"sea", "river", "mountain", "rain", "snow", "tree", "sun", "moon", 
			"forest", "plant", "wind", "earth", "flower", "valley", "root", "lake", "star", 
			"grass", "leaf", "air", "sand", "beach", "ocean", "wave", "morning", "evening", "night"};
	String turkishWords[]={"deniz", "nehir", "dað", "yaðmur", "kar", "aðaç", "güneþ", "ay", 
			"orman", "bitki", "rüzgar", "toprak", "çiçek", "vadi", "kök", "göl", "yýldýz", 
			"çimen", "yaprak", "hava", "kum", "kumsal", "okyanus", "dalga", "sabah", "akþam", "gece"};
	String germanWords[]={"meer", "fluss", "berg", "regen", "schnee", "baum", "sonne", "mond", 
			"wald", "anlage", "wind", "erde", "blume", "tal", "wurzel", "see", "stern", 
			"gras", "blatt", "luft", "sand", "strand", "ozean", "welle", "morgen", "abend", "nacht"};
	
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
		
		word.setText(R.string.nature);
		
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
					
					word.setText(R.string.s_sea+holder);
				}
				
				
			}
		});
		
	}
	
}
