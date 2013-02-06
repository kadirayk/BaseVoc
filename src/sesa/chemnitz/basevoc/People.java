package sesa.chemnitz.basevoc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class People extends Activity{

	
	
	
	int holder=-1;

	
	String englishWords[]={"son", "daughter", "mother", "father", "man", "woman", "brother", "sister", 
			"family", "grandfather", "grandmother", "husband", "wife", "king", "queen", "neighboor", 
			"boy", "girl", "religion", "death", "money"};
	String turkishWords[]={"erkek evlat", "kýz evlat", "anne", "baba", "adam", "kadýn", "erkek kardeþ", "kýz kardeþ", 
			"aile", "büyükbaba", "büyükanne", "koca (eþ)", "karý (eþ)", "kral", "kraliçe", "komþu", 
			"erkek", "kýz", "din", "ölüm", "para"};
	String germanWords[]={"sohn", "tochter", "mutter", "vater", "mann", "frau", "bruder", "schwester", 
			"familie", "großvater", "großmutter", "mann", "frau", "könig", "königin", "nachbar", 
			"junge", "mädchen", "religion", "tod", "geld"};
	
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
		
		word.setText(R.string.people);
		
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
					
					word.setText(R.string.s_son+holder);
				}
				
				
			}
		});
		
	}
	
}
