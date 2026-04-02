package iuh.fit.qldh_kttkpm_demo.state.stateimpl;

import iuh.fit.qldh_kttkpm_demo.context.OrderContext;
import iuh.fit.qldh_kttkpm_demo.state.OrderState;

public class DeliveredState implements OrderState {

    @Override
    public void handle(OrderContext context) {
        System.out.println("Da giao hang thanh cong");
    }
}
