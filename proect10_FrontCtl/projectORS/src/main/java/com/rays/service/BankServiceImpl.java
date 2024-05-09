package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.common.UserContext;
import com.rays.dao.BankDAOInt;
import com.rays.dto.BankDTO;

@Service
@Transactional
public class BankServiceImpl extends BaseServiceImpl<BankDTO, BankDAOInt> implements BankServiceInt {

	@Transactional(readOnly = true)
	public BankDTO findByCustomerName(String bankName, UserContext context) {
		BankDTO dto = baseDao.findByUniqueKey("bankName", bankName, context);

		return dto;
	}

}
