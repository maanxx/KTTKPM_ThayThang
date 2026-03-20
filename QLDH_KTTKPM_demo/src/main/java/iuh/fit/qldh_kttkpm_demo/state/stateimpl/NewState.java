package iuh.fit.qldh_kttkpm_demo.state.stateimpl;

import iuh.fit.qldh_kttkpm_demo.context.OrderContext;
import iuh.fit.qldh_kttkpm_demo.state.OrderState;

public class NewState implements OrderState {

    @Override
    public void handle(OrderContext context) {
        System.out.println("Kiem tra thong tin don hang bay gio..........");
        context.setOrderState(new ProcessingState());
    }
}
