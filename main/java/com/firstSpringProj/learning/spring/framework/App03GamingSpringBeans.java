package com.firstSpringProj.learning.spring.framework;

import com.firstSpringProj.learning.spring.framework.game.GameRunner;
import com.firstSpringProj.learning.spring.framework.game.GamingConsole;
import com.firstSpringProj.learning.spring.framework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {

            context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
        }
    }
}