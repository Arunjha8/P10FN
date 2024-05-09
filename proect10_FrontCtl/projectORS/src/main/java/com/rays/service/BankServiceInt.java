package com.rays.service;

import com.rays.common.BaseServiceInt;
import com.rays.common.UserContext;
import com.rays.dto.BankDTO;

public interface BankServiceInt extends BaseServiceInt<BankDTO> {

	public BankDTO findByCustomerName(String customerName, UserContext context);

}
