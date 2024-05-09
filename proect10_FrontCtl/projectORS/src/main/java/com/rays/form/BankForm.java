package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BankDTO;

public class BankForm extends BaseForm {

	@NotEmpty(message = "please enter bank name")
	private String bankName;

	@NotEmpty(message = "please enter customer name")
	private String customerName;

	@NotNull(message = "please enter account no")
	private Long accountNo;

	@NotEmpty(message = "please enter account type")
	private String accountType;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public BaseDTO getDto() {
		BankDTO dto = initDTO(new BankDTO());
		dto.setBankName(bankName);
		dto.setAccountNo(accountNo);
		dto.setAccountType(accountType);
		dto.setCustomerName(customerName);
		return dto;
	}

}
