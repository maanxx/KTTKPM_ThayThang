package iuh.fit.qldh_kttkpm_demo.context;

import iuh.fit.qldh_kttkpm_demo.state.TaxState;

public class TaxContext {
    private TaxState state;

    public TaxContext(TaxState state) {
        this.state = state;
    }

    public double caculateTax(double price) {
        return state.caculate(price);
    }
}
