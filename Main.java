public class Main {
    public static void main(String[] args) {
        OrderFactory orderFactory = new OrderFactory();

  
        Order electronicOrder = orderFactory.createOrder("Electronic");
        electronicOrder.processOrder();

        
        Order consumerProductOrder = orderFactory.createOrder("ConsumerProduct");
        consumerProductOrder.processOrder();

      
        Order foodOrder = orderFactory.createOrder("Food");
        foodOrder.processOrder();
    }
}