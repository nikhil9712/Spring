package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Pack2.Game;

public class GameMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Game.xml");
	    Game game1=applicationContext.getBean("game",Game.class);
	    game1.Buy();
	    
	    Pack1.Game game2=applicationContext.getBean("game",Pack1.Game.class);
	    game2.play();
	}
}
