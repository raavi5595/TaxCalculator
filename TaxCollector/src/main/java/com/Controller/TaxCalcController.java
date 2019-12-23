package com.Controller;

import com.Data.TaxObject;
import com.Manager.TaxCalcManager;


public class TaxCalcController {

    public void submit(TaxObject taxObject) {
        TaxCalcManager mngr = new TaxCalcManager();
        mngr.calculateTax(taxObject);
    }
}
