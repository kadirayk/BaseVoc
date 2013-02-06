package sesa.chemnitz.basevoc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FoodsDrinks extends Activity{

	
	
	
	int holder=-1;

	
	String englishWords[]={"eggs", "cheese", "bread", "soup", "cake", "chicken", "pork", "beef", 
			"apple", "banana", "lemon", "corn", "rice", "oil", "seed", "knife", "spoon", "fork",
			"plate", "cup", "breakfast", "lunch", "dinner","sugar", "coffee", "tea", "wine", "beer",
			"juice", "water", "milk"};
	String turkishWords[]={"yumurta", "peynir", "ekmek", "�orba", "kek", "tavuk", "domuz eti", "s���r eti", 
			"elma", "muz", "limon", "m�s�r", "pirin�", "ya�", "tohum", "b��ak", "ka��k", "�atal",
			"tabak", "bardak", "kahvalt�", "��le yeme�i", "ak�am yeme�i","�eker", "kahve", "�ay", "�arap", "bira",
			"meyve suyu", "su", "s�t"};
	String germanWords[]={"eier", "k�se", "brot", "suppe", "kuchen", "h�hnchen", "schweinefleisch", "rindfleisch", 
			"apfel", "banane", "zitrone", "mais", "reis", "�l", "samen", "messer", "l�ffel", "gabel",
			"platte", "tasse", "fr�hst�ck", "mittagessen", "abendessen","zucker", "kaffee", "tee", "wein", "bier",
			"saft", "wasser", "milch"};
	
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
		
		word.setText(R.string.foods);
		
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
					
					word.setText(R.string.s_eggs+holder);
				}
				
				
			}
		});
		
	}
	
}
