package se.arbetsformedlingen.mall.data.shared.events;

/**
 * Domain event published when a payment has been handled.
 */
public record PaymentHandledEvent(String paymentId) {
}
