package se.arbetsformedlingen.mall.data.shared.events;

/**
 * Domain event published when an order has been created.
 */
public record OrderCreatedEvent(String orderId, String customerId) {

}
