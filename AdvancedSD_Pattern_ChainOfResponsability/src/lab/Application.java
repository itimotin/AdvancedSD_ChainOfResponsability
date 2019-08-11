package lab;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DomesticOrderHandler domesticHandler = new DomesticOrderHandler();
		InternationalOrderHandler interationalHandler = new InternationalOrderHandler();
		LargeOrderHandler largeHandler = new LargeOrderHandler();
		MostFavoredCustomerHandler mostFavoredCustomerHandler = new MostFavoredCustomerHandler();
		
		mostFavoredCustomerHandler.setNextHandler(largeHandler);
		largeHandler.setNextHandler(interationalHandler);
		interationalHandler.setNextHandler(domesticHandler);
		
		OrderClient orderClient = new OrderClient();
		orderClient.setOrderHandler(mostFavoredCustomerHandler);
		
		
		Order orderIonFavoredInternational = new Order("Ion favored and International 00001", 15999, true, new Customer("Ion Timotin"));
		
		Order orderEmmaFavored = new Order("Favored 000002", 35999, false, new Customer("Emma Timotin") );
		
		Order orderCristinaLarge = new Order("Large 000003", 59999, false, new Customer("Cristina Tereburke"));
		
		Order orderCristinaInternational = new Order("International 00004", 199.0, true, new Customer("Cristina Tereburke"));
		
		Order orderIonDomestic = new Order("IonDomestic-000005", 2999.9, false , new Customer("Ion Domestic"));
	
		
		orderClient.receiveOrder(orderIonFavoredInternational);
		orderClient.receiveOrder(orderEmmaFavored);
		orderClient.receiveOrder(orderCristinaLarge);
		orderClient.receiveOrder(orderCristinaInternational);
		orderClient.receiveOrder(orderIonDomestic);
	}

}
