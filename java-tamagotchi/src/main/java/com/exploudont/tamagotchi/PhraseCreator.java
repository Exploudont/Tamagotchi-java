package com.exploudont.tamagotchi;

import java.util.Random;


public class PhraseCreator {
	
	
	public static String getPhrase() {
		int pos_verb = rand.nextInt(verbs.length);
		int pos_noun = rand.nextInt(nouns.length);
		
		return verbs[pos_verb] + " " + nouns[pos_noun];
	}
	

	static {
		verbs = new String[] {
			"Ask", "Ban", "Bash", "Bite", "Break", "Build",
			"Cut", "Dig", "Drag", "Drop", "Drink", "Enjoy",
			"Eat", "End", "Feed", "Fill", "Force", "Grasp",
			"Gas", "Get", "Grab", "Grip", "Hoist", "House",
			"Ice", "Ink", "Join", "Kick", "Leave", "Marry",
			"Mix", "Nab", "Nail", "Open", "Press", "Quash",
			"Rub", "Run", "Save", "Snap", "Taste", "Touch",
			"Use", "Vet", "View", "Wash", "Xerox", "Yield"
		};
	
		nouns = new String[] {
			"arms", "bugs", "boots", "bowls", "cabins", "cigars",
		    "dogs", "eggs", "fakes", "flags", "greens", "guests",
		    "hens", "hogs", "items", "jowls", "jewels", "juices",
		    "kits", "logs", "lamps", "lions", "levers", "lemons",
		    "maps", "mugs", "names", "nests", "nights", "nurses",
		    "orbs", "owls", "pages", "posts", "quests", "quotas",
		    "rats", "ribs", "roots", "rules", "salads", "sauces",
		    "toys", "urns", "vines", "words", "waters", "zebras"
		};
		
		rand = new Random();
	}
	
	private static Random rand;
	private static final String[] verbs;
	private static final String[] nouns;
}