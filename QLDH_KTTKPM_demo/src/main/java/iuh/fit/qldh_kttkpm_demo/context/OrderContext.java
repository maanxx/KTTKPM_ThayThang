package iuh.fit.qldh_kttkpm_demo.context;

import iuh.fit.qldh_kttkpm_demo.state.OrderState;

public class OrderContext {
    private OrderState orderState;

    public OrderContext(OrderState orderState) {
        this.orderState = orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public void process() {
        orderState.handle(this);
    }
}
