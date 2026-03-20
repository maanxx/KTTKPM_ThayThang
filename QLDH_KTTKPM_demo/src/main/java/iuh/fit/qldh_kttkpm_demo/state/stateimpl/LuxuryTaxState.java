package iuh.fit.qldh_kttkpm_demo.state.stateimpl;

import iuh.fit.qldh_kttkpm_demo.state.TaxState;

public class LuxuryTaxState implements TaxState {
    @Override
    public double caculate(double price) {
        return price * 0.2;
    }
}
