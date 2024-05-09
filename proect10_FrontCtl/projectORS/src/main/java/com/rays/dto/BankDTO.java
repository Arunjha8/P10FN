package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_BANK")
public class BankDTO extends BaseDTO {

	@Column(name = "BANK_NAME", length = 50)
	private String bankName;

	@Column(name = "CUSTOMER_NAME", length = 50)
	private String customerName;

	@Column(name = "ACCOUNT_NO")
	private Long accountNo;

	@Column(name = "ACCOUNT_TYPE", length = 50)
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


	public String getKey() {
		return id + "";
	}

	@Override
	public String getValue() {
		return bankName;
	}

	@Override
	public String getUniqueKey() {
		return "bankName";
	}

	@Override
	public String getUniqueValue() {
		return bankName;
	}

	@Override
	public String getLabel() {
		return "Bank Name";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("bankName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("bankName", bankName);
		return map;
	}

}
