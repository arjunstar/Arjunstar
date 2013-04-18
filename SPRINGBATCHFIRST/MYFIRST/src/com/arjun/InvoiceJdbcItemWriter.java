package com.arjun;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.batch.item.ItemWriter;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class InvoiceJdbcItemWriter implements ItemWriter<Invoice> {

	private static final String INSERT_INVOICE = "insert into invoice "+
			"(id,customerid,description,issuedate,amount) values(?,?,?,?,?)";
			private static final String UPDATE_INVOICE = "update invoice set "+
			"customerid=?, description=?, issuedate=?, amount=? where id = ?";
			private SimpleJdbcTemplate jdbcTemplate;
			public InvoiceJdbcItemWriter(DataSource ds) {
			this.jdbcTemplate = new SimpleJdbcTemplate(ds);
			}
			public void write(List<? extends Invoice> items) throws Exception {
			for(Invoice item : items) {
			int updated = jdbcTemplate.update(UPDATE_INVOICE,item.getCustomerId(),item.getDescription(),item.getIssueDate(),item.getAmount(),item.getId());
			if(updated == 0) {
			jdbcTemplate.update(INSERT_INVOICE,	item.getId(),item.getCustomerId(),item.getDescription(),item.getIssueDate(),item.getAmount());
			}
			}
			}
}
