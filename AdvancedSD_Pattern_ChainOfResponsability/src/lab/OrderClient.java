package lab;

public class OrderClient {
	OrderHandler orderHandler;

	public void setOrderHandler(OrderHandler orderHandler) {
		this.orderHandler = orderHandler;
	}
	
	public void receiveOrder(Order order) {
		orderHandler.handlerOrder(order);
	}
	
}
