package com.Impl;

import com.Data.FederalTax;
import com.Data.FederalTaxData;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FederalTax")
public class FederalTaxImpl extends FederalTaxData implements FederalTax {

}
