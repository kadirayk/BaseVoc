package sesa.chemnitz.basevoc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AdjectivesAdverbs extends Activity{

	
	
	
	int holder=-1;

	
	String englishWords[]={"long/short", "tall/short", "wide/narrow", "big/small", "slow/fast", 
			"hot/cold", "new/old", "good/bad", "wet/dry", "sick/healthy", "loud/quiet", "happy/sad", 
			"beautiful/ugly", "nice/mean", "rich/poor", "thick/thin", "expensive/cheap", "flat/curved", 
			"male/female", "tight/loose"};
	String turkishWords[]={"uzun/k�sa", "uzun boylu/k�sa boylu", "geni�/dar", "b�y�k/k���k", "yava�/h�zl�", 
			"s�cak/so�uk", "yeni/eski", "iyi/k�t�", "�slak/kuru", "hasta/sa�l�kl�", "g�r�lt�l�/sessiz", "mutlu/�zg�n", 
			"g�zel/�irkin", "ho�/sevimsiz", "zengin/fakir", "kal�n/ince", "pahal�/ucuz", "d�z/kavisli", 
			"erkek/di�i", "s�k�/gev�ek"};
	String germanWords[]={"lange/kurz", "gro�/kurz", "breit/schmal", "gro�/klein", "langsam/schnell", 
			"hei�/kalt", "neu/alt", "gut/schlect", "nass/trocknen", "krank/gesunt", "laut/ruhig", "gl�cklich/traurig", 
			"sch�n/h�sslich", "sch�n/mittlere", "reich/arm", "dick/d�nn", "teuer/billig", "flach/gew�lbt", 
			"m�nnlich/weiblich", "eng/lose"};
	
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
		
		word.setText(R.string.adjectives);
		
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
					
					word.setText(R.string.s_long+holder);
				}
				
				
			}
		});
		
	}
	
}
