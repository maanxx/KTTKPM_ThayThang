package iuh.fit.qldh_kttkpm_demo.state.stateimpl;

import iuh.fit.qldh_kttkpm_demo.context.OrderContext;
import iuh.fit.qldh_kttkpm_demo.state.OrderState;

public class CancelledState implements OrderState {


    @Override
    public void handle(OrderContext context) {
        System.out.println("Huy don hang va hoan tien");
    }
}
