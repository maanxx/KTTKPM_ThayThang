package iuh.fit.qldh_kttkpm_demo;

import iuh.fit.qldh_kttkpm_demo.context.OrderContext;
import iuh.fit.qldh_kttkpm_demo.state.stateimpl.NewState;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QldhKttkpmDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(QldhKttkpmDemoApplication.class, args);


        OrderContext order = new OrderContext(new NewState());

        order.process();
        order.process();
        order.process();
    }

}
