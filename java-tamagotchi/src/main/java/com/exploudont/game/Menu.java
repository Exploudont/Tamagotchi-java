package com.exploudont.game;

import com.exploudont.tamagotchi.Tamagotchi;

public class Menu {
	
	public static void startMenu(Tamagotchi tama) {
		while(true) {
		
			showMenu();
			int option = readOption();
			exec(tama, option);
		}
	}
	
	private static int readOption() {
		System.out.print("\nSelect an option> ");
		
		try {
			return Integer.parseInt(System.console().readLine());
		} catch(Exception e) {}
		
		return -1;
	}
	
	private static void exec(Tamagotchi tama, int option) {
		
		switch(option)
		{
			case 1: tama.feed();
					break;
					
			case 2: tama.play();
					break;

			case 3: System.out.println(tama.talk());
					break;

			case 4: tama.clean();
					break;
					
			case 5: System.out.println(tama.toString());
					break;
			
			default: System.out.println("invalid option");
					break;
		}
		
	}
	
	private static void showMenu() {
		System.out.println("======== Menu ========");
		System.out.println("1 - feed");
		System.out.println("2 - play");
		System.out.println("3 - talk");
		System.out.println("4 - clean");
		System.out.println("5 - print statistics");
	}
}