package RestAssured;


import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class RestAssuredTest {
	
	//@Test
	public void restAssured()
	{
		Response resp = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=Delhi,uk&appid=b6907d289e10d714a6e88b30761fae22");
		//API is up or not for this data set
		System.out.println("Value of Responce-->"+resp.getStatusCode());
		Assert.assertEquals(resp.getStatusCode(), 200);
		//DB
		//ASSERT(API, DB)
	
	}
	
	//@Test
	public void restAssured_String()
	{
		//Response resp = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		Response resp = RestAssured.get("http://restcountries.eu/rest/v1/name/India");
		String  strdata = resp.asString();
		
		//Split string, comma separated
		System.out.println("Value of data Responce(string)-->"+strdata);		
		System.out.println("ResponceTime -->"+resp.getTime());
		//Asset of stringdata
		
	
	}
	
	//@Test	
	public void teststatuscode()
	{
//		 given().
//		    when().
//		        get("http://ergast.com/api/f1/2017/circuits.json").
//		    then().
//		        assertThat().
//		        body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
	}
	
	//@Test
	public void GetWeatherDetails()
	 {
	 
		// Specify the base URL to the RESTful web service
	 RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	 
	 // Get the RequestSpecification of the request that you want to sent
	 // to the server. The server is specified by the BaseURI that we have
	 // specified in the above step.
	 RequestSpecification httpRequest = RestAssured.given();
	 
	 // Make a GET request call directly by using RequestSpecification.get() method.
	 // Make sure you specify the resource name.
	 Response response = httpRequest.get("/Hyderabad");
	 
	 // Response.asString method will directly return the content of the body
	 // as String.
	 System.out.println("Response Body is =>  " + response.asString());
	 }
	
	
	 //@Test
	 public void GetWeatherDetails_Validation()
	 {
	 RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	 RequestSpecification httpRequest = RestAssured.given();
	 Response response = httpRequest.get("/Hyderabad");
	 
	 // Get the status code from the Response. In case of 
	 // a successfull interaction with the web service, we
	 // should get a status code of 200.
	 int statusCode = response.getStatusCode();
	 
	 // Assert that correct status code is returned.
	 Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");
	 }
	 
	 //@Test
	 public void putExample()
	 {
		 RestAssured.baseURI ="http://restapi.demoqa.com/customer";
		 RequestSpecification request = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("FirstName", "Tom"); // Cast
		 requestParams.put("LastName", "Apache");
		 requestParams.put("UserName", "TopApache");
		 requestParams.put("Password", "password123");
		 
		 requestParams.put("Email",  "TopApache@gmail.com");
		 request.body(requestParams.toJSONString());
		 Response response = request.post("/register");
		 
		 int statusCode = response.getStatusCode();
		// Assert.assertEquals(statusCode, "201");
		 String successCode = response.jsonPath().get("SuccessCode");
		 Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
		

	 }
	 
	 //@Test
	 public void updateRecord()
	 {
		 int empid = 15410;
		 
		 RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1";
		 RequestSpecification request = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 
		 //read from pop file- str
		 
		 requestParams.put("name", "TomM"); // Cast
		 requestParams.put("age", 21);
		 requestParams.put("salary", 50000);
		 
		 request.body(requestParams.toJSONString());
		 Response response = request.put("/update/"+ empid);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println(response.asString());
		 Assert.assertEquals(statusCode, 200); 
	 }
	 
	 
	@Test
	 public void deleteEmpRecord() {
	  
	  int empid = 15410;
	  
	  RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
	  RequestSpecification request = RestAssured.given(); 
	  
	  // Add a header stating the Request body is a JSON
	  request.header("Content-Type", "application/json"); 
	  
	        // Delete the request and check the response
	  Response response = request.delete("/delete/"+ empid); 
	  
	  int statusCode = response.getStatusCode();
	  System.out.println(response.asString());
	  Assert.assertEquals(statusCode, 200);
	  
	  String jsonString =response.asString();
	  Assert.assertEquals(jsonString.contains("successfully! deleted Records"), true);
	  
	}

}
