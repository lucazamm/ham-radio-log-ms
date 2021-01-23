package net.zammarchi.hamradiolog;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootTest
class HamRadioLogApplicationTests {

	private static final Logger logger = LogManager.getLogger(HamRadioLogApplicationTests.class);

	@Test
	void contextLoads() throws Exception {
		System.out.println("contextLoads!!");

		//AuthResponse response = bridge.get("4KRC6XUT58");
		//System.out.println(response);

		//EventsListResponse eventList = eventBridge.get(); 
		//String response=eventBridge.getString();
		//System.out.println(eventList);
		

		/*XmlMapper xmlMapper = new XmlMapper();
		xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		EventsListResponse poppy = xmlMapper.readValue(response, EventsListResponse.class);*/

		//System.out.println(poppy);

		
		
	}

}
