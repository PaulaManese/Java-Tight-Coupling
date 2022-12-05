package com.myfirstproject.spring.myfirstproject;

import com.myfirstproject.spring.myfirstproject.game.GameRunner;
//import com.myfirstproject.spring.myfirstproject.game.MarioGame;
import com.myfirstproject.spring.myfirstproject.game.SuperContraGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstProjectApplication {
	public static void main(String[] args){
//		MarioGame game = new MarioGame();
    	SuperContraGame game = new SuperContraGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}
}

