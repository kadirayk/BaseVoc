package sesa.chemnitz.basevoc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Verbs extends Activity{

	
	
	
	int holder=-1;

	
	String englishWords[]={"to work", "to play", "to go", "to walk", "to run", "to drive", "to follow",
			"to think", "to speak", "to eat", "to drink", "to kill", "to die", "to smile", "to laugh", 
			"to cry", "to buy", "to jump", "to smell", "to see", "to taste", "to touch", "to hear", 
			"to kiss", "to burn", "to melt", "to dig", "to explode", "to sit", "to stand", "to love", 
			"to pass", "to cut", "to fight", "to dance", "to sleep", "to wake up", "to sing", 
			"to count", "to marry", "to pray", "to win", "to lose", "to mix", "to bend", "to wash", 
			"to cook", "to open", "to close"};
	
	String turkishWords[]={"çalýþmak", "oynamak", "gitmek", "yürümek", "koþmak", "sürmek", "takip etmek",
			"düþünmek", "konuþmak", "yemek", "içmek", "öldürmek", "ölmek", "gülümsemek", "gülmek", 
			"aðlamak", "satýn almak", "zýplamak", "koklamak", "görmek", "koklamak", "dokunmak", "duymak", 
			"öpmek", "yanmak", "erimek", "kazmak", "patlamak", "oturmak", "durmak", "sevmek", 
			"geçmek", "kesmek", "kavga etmek", "dans etmek", "uyumak", "uyanmak", "þarký söylemek", 
			"saymak", "evlenmek", "dua etmek", "kazanmak", "kaybetmek", "karýþtýrmak", "bükmek", "yýkamak", 
			"piþirmek", "açmak", "kapatmak"};
	
	String germanWords[]={"zu arbeiten", "zu spielen", "zu gehen", "zu fuß", "laufen", "zu fahren", "zu folgen",
			"zu denken", "zu sprechen", "zu essen", "zu trinken", "zu töten", "zu sterben", "zu lächeln", "zu lachen", 
			"zu weinen", "kaufen", "zu springen", "zu riechen", "zu sehen", "zu schmechen", "zu berühren", "zu hören", 
			"zu küssen", "zu brennen", "zu schmelzen", "zu graben", "zu explodieren", "zu sitzen", "zu stehen", "zu lieben", 
			"zu passieren", "zu schneiden", "zu kämpfen", "zu tanzen", "schlafen", "zu wecken", "zu singen", 
			"zu zählen", "zu heiraten", "zu beten", "zu gewinnen", "zu verlieren", "zu mischen", "zu biegen", "zu waschen", 
			"zu kochen", "zu öffnen", "zu schließen"};
	
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
		
		word.setText(R.string.verbs);
		
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
					
					word.setText(R.string.s_towork+holder);
				}
				
				
			}
		});
		
	}
	
}
