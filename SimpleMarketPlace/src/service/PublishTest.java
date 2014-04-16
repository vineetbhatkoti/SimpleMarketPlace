package service;

import javax.xml.ws.Endpoint;

public class PublishTest {
	public static void main(String[] args) {
		Endpoint endPoint = Endpoint.create(new AdvertisementImpl());
		endPoint.publish("http://localhost:8081/SimpleMarketPlace/services/Advertisement");
	}
}
