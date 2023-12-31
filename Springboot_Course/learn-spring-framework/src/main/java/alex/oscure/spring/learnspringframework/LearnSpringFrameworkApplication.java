package alex.oscure.spring.learnspringframework;

import alex.oscure.spring.learnspringframework.enterprise.MyWebController;
import alex.oscure.spring.learnspringframework.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =
				SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
