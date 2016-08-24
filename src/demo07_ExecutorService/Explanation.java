/**
 * 
 */
package demo07_ExecutorService;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

/**
 * @author tijana.pavicic
 *
 */
public @interface Explanation {
	
	/**
	 * 
	 * <!-- https://mvnrepository.com/artifact/com.google.guava/guava -->
		<dependency>
			<groupId>com.google.guava</groupId>
			<artifactId>guava</artifactId>
			<version>r05</version>
		</dependency>
	 * 
	 */
	
	 
	final ThreadFactory threadFactory = new ThreadFactoryBuilder()
	        .setNameFormat("Orders-%d")
	        .setDaemon(true)
	        .build();
	final ExecutorService executorService = Executors.newFixedThreadPool(10, threadFactory);
	
	
	/**
	 * http://www.nurkiewicz.com/2014/11/executorservice-10-tips-and-tricks.html
	 * @param messageId
	 */
	

}
