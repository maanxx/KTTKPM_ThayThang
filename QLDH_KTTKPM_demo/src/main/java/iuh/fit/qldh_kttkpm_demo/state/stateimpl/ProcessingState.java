package iuh.fit.qldh_kttkpm_demo.state.stateimpl;

import iuh.fit.qldh_kttkpm_demo.context.OrderContext;
import iuh.fit.qldh_kttkpm_demo.state.OrderState;

public class ProcessingState implements OrderState {

    @Override
    public void handle(OrderContext context) {
        System.out.println("Dong goi va van chuyen don hang.........");
        context.setOrderState(new DeliveredState());
    }
}
