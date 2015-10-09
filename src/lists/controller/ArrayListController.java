package lists.controller;

import java.util.ArrayList;
import lists.view.ListView;
public class ArrayListController
{
	private ArrayList<String> firstWords;
	private ListView popupDisplay;
	
	
	public ArrayListController()
	{
		firstWords = new ArrayList<String>();
		popupDisplay = new ListView();
	}
	/**
	 * Displays a window that shows what the contents are at 0 and what the contents are when increased by 1, or each time okay is pressed in this case.
	 */
	
	public void start()
	{
		firstWords.add("hsadusaioh");
		firstWords.add("baaaaaaaahhhhhhbaaaaaahhhhbaaahhhhbwaaaahh");
		firstWords.add(1, "Crying Insanely");
		displayList();
		firstWords.set(2, "Meme");
		displayList();
		firstWords.remove(0);
		displayList();
		showOtherLoop();
	}
	/**
	 * Uses a loop for contents that increase by 1.
	 */
	private void displayList()
	{
		popupDisplay.showList("The size of the list is " + firstWords.size());
		for(int spot = 0; spot < firstWords.size(); spot++)
		{
			popupDisplay.showList("The contents at " + spot + " are " + firstWords.get(spot));
		}
	}
	
	private void showOtherLoop()
	{
		for(String words : firstWords)
		{
			popupDisplay.showList(words);
		}
	}
}
