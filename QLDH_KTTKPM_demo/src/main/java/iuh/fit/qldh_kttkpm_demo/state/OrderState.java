package iuh.fit.qldh_kttkpm_demo.state;

import iuh.fit.qldh_kttkpm_demo.context.OrderContext;

public interface OrderState {
    void handle(OrderContext context);
}
