package Log4JStudy.log4j2Policies;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.appender.FileAppender;
import org.apache.logging.log4j.core.appender.RollingFileAppender;
import org.apache.logging.log4j.core.appender.rolling.CompositeTriggeringPolicy;
import org.apache.logging.log4j.core.appender.rolling.DefaultRolloverStrategy;
import org.apache.logging.log4j.core.appender.rolling.SizeBasedTriggeringPolicy;
import org.apache.logging.log4j.core.appender.rolling.TimeBasedTriggeringPolicy;
import org.apache.logging.log4j.core.appender.rolling.TriggeringPolicy;
import org.apache.logging.log4j.core.config.AppenderRef;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.apache.logging.log4j.core.layout.PatternLayout;


//construct the loggers programatically at runtime
public class ProgramaticallyLogger {
	public static void main(String[] args) throws InterruptedException {

		configure();
		final Logger logger = LogManager.getLogger("org.apache.logging.log4j");
		logger.debug("Hello Word!");

		//////////////////
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

		///////////////
	}

	public static void configure() {
        final LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
        final Configuration config = ctx.getConfiguration();
        Layout layout = PatternLayout.createLayout(PatternLayout.SIMPLE_CONVERSION_PATTERN, config, null, null, true , true , null, null);
        SizeBasedTriggeringPolicy sizeTrigger = SizeBasedTriggeringPolicy.createPolicy("2KB");
        TimeBasedTriggeringPolicy timeTrigger = TimeBasedTriggeringPolicy.createPolicy(null, null);
        TriggeringPolicy triggerPolicy = CompositeTriggeringPolicy.createPolicy(timeTrigger, sizeTrigger);
        DefaultRolloverStrategy rolloverStrategy = DefaultRolloverStrategy.createStrategy("100", "1", "min", null, config);
        Appender appender = RollingFileAppender.createAppender("C://logs/test.log", "C:/logs/%d{yyyy-MM}/app-%d{yyyy-MM-dd}-%i.log", "true", "FILE", "false","4000", "true", triggerPolicy, rolloverStrategy, layout, null, "true", "false", "", config);
//        													  ("C://logs/test.log", "true", "false", "File", "true", "false", "false", "4000" , layout, null, "false", null , config);
        
        appender.start();
        config.addAppender(appender);

        
        AppenderRef ref = AppenderRef.createAppenderRef("File", null, null);
        AppenderRef[] refs = new AppenderRef[] {ref};
        LoggerConfig loggerConfig = LoggerConfig.createLogger("false", Level.DEBUG, "org.apache.logging.log4j", "true", refs, null, config, null);
        loggerConfig.addAppender(appender, null, null);
        config.addLogger("org.apache.logging.log4j", loggerConfig);
        ctx.updateLoggers();

	}
}
