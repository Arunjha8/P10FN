package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.BankDTO;

@Repository
public class BankDAOImpl extends BaseDAOImpl<BankDTO> implements BankDAOInt {

	@Override
	protected List<Predicate> getWhereClause(BankDTO dto, CriteriaBuilder builder, Root<BankDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getBankName())) {
			System.out.println(dto.getBankName() + "111111111111");
			whereCondition.add(builder.like(qRoot.get("bankName"), dto.getBankName() + "%"));
		}

		if (!isEmptyString(dto.getAccountType())) {
			System.out.println(dto.getAccountType() + "22222222222");
			whereCondition.add(builder.like(qRoot.get("accountType"), dto.getAccountType() + "%"));
		}

		if (!isEmptyString(dto.getCustomerName())) {
			System.out.println(dto.getCustomerName() + "333333333333");
			whereCondition.add(builder.like(qRoot.get("customerName"), dto.getCustomerName() + "%"));
		}

		if (!isZeroNumber(dto.getAccountNo())) {
			System.out.println(dto.getAccountNo() + "444444444444444444");
			whereCondition.add(builder.equal(qRoot.get("accountNo"), dto.getAccountNo()));
		}

		if (!isZeroNumber(dto.getId())) {
			System.out.println(dto.getId() + "kjhgfhj");
			whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
		}

		return whereCondition;
	}

	public Class<BankDTO> getDTOClass() {
		return BankDTO.class;
	}

}
