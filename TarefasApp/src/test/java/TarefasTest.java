import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import TarefasApp.App;
import spark.Spark;

public class TarefasTest {
	 	private static final String BASE_URL  = "http://localhost:7777";
	 	@BeforeClass
	    public static void setUp() {
	        App.main(null); 
	    }

	    @AfterClass
	    public static void tearDown() {
	        Spark.stop(); 
	    }
	    @Test
	    public void teste() throws IOException {
	        URL url = new URL(BASE_URL  + "/");
	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        connection.setRequestMethod("GET");

	        assertEquals(200, connection.getResponseCode());
	     
	    }
}
