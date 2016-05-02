package Log4JStudy.log4j2Policies;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello World!");
		//get the root logger


		final Logger logger = LogManager.getLogger("Log4JStudy.log4j2Policies.App2");
		for (int i = 0; i < 1000; i++) {
			logger.debug("inside the controller debug :D"+i);
		}
		Thread th2 = new Thread(new Runnable() {
			public void run() {
				
				for (int i = 0; i < 1000; i++) {
					logger.debug("inside the controller debug :D"+i);
				}
			}
		});
		Thread.sleep(10000L);	
		th2.start();
	}
}
