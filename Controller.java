package edu.tridenttech.cpt237.williams;

import java.util.ArrayList;
import java.util.Collections;
/**
 * 
 * @author Alexis Williams
 *
 */

public class Controller implements CabLoader
{	
	private ArrayList<ExtendedCab>cabList = new ArrayList<ExtendedCab>(4);
	private ArrayList<String> cabName = new ArrayList<String>(4);
		
	private MultiCabUI cabUI;
	
	private ExtendedCab cab1 = new ExtendedCab("Taxi 18", 17.9, 22.9);
	private ExtendedCab cab2 = new ExtendedCab("Taxi 12", 25.5, 32.6);
	private ExtendedCab cab3 = new ExtendedCab("Taxi 16", 45.5, 55.5);
	private ExtendedCab cab4 = new ExtendedCab("Taxi 20", 50.7, 60.0);
	private ExtendedCab cab5 = new ExtendedCab("Taxi 14", 17.9, 22.9);
	
	/**
	 * setUI: accepts a UI and sets it for use inside the class.
	 * @param ui: the UI parameter value
	 */
	public void setUI(MultiCabUI ui)
	{
		cabUI = ui;
	}
	
	/**
	 * addCabs: adds all the ExtendedCab objects to the ArrayList and sorts them.
	 */
	public void addCabs()
	{
		cabList.add(cab1);
		cabList.add(cab2);
		cabList.add(cab3);
		cabList.add(cab4);
		cabList.add(cab5);	
		
		Collections.sort(getCabList(), ExtendedCab.NameSorter);		
	}
	
	public ArrayList<ExtendedCab> getCabList() 
	{
		return cabList;
	}

	public ArrayList<String> getCabName() 
	{
		return cabName;
	}


	/**
	 * loadCab: accepts the name of the Cab and goes through the arraylist of cabs to find the object the name matches with
	 * @param name: the name of the cab to be switched to.
	 */
	public void loadCab(String name) 
	{
		ExtendedCab wantedCab = null;
			
		for(ExtendedCab i : getCabList())
		{
			if(name.equals(i.getName()))
			{
				wantedCab = i;
			}
		}//end for loop
			
		cabUI.setCab(wantedCab);
	}
	
}
