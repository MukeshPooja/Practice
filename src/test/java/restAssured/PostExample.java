package restAssured;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class PostExample {
@Test
public void test() {
	
	JsonObject json = new JsonObject();
	
	json.addProperty("city", "nykjaN'OSU	Jioqjs	oIOQ");
	
	RequestSpecification request = RestAssured.given();
	request.header("Content-type","application/json");
	
	request.body(json.toString());
	//Response response =request.post("http://localhost:300/post");

	
}
}






