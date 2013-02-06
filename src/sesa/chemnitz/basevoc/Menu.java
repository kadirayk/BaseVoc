package sesa.chemnitz.basevoc;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Menu extends ListActivity{
	
	
	public boolean isMyServiceRunning() {
	    ActivityManager manager = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
	    for (RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
	        if ("sesa.chemnitz.basevoc".equals(service.service.getClassName())) {
	            return true;
	        }
	    }
	    return false;
	}
	
	boolean runrun;
	
	
	int deul=1;
	
	String classes[] = new String[18]; 
	
	String orgMenu[]= {"Animals", "Transport", "City", "Clothes", 
			"Colors", "People", "FoodsDrinks", "Home", "Body", "Nature", 
			"Jobs", "Math", "Numbers", "Months", "Times",
			"Verbs", "AdjectivesAdverbs", "Misc"};
	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     
        runrun=true;
        
        int i;
        for(i=0;i<18;i++){
        	classes[i]=getString(R.string.animals+i);
        	}
    	
        setListAdapter(new ArrayAdapter<String>(Menu.this, R.layout.listen, classes));
    }
	
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
				
		
		
		super.onListItemClick(l, v, position, id);
		String convert = orgMenu[position];
		
		
		
		
		try{
			Class<?> aClass = Class.forName("sesa.chemnitz.basevoc." + convert);
			Intent anIntent = new Intent(Menu.this, aClass);
			anIntent.putExtra("calleren", true);
			startActivity(anIntent);
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		};
	}
	
   
}
