package com.example.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ExampleDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void updateData(String data) {
        jdbcTemplate.update("UPDATE example_table SET data = ?", data);
        throw new RuntimeException("Error occurred while updating data");
    }

    public void doSomething() {
        updateData("new data"); // This method call will be intercepted by the transactional proxy
    }

    @Transactional
    public void doSomethingTransactional() {
        updateData("new data"); // This method call will be intercepted by the transactional proxy
        throw new RuntimeException("Error occurred while doing something transactional");
    }

    public void doSomethingInternal() {
        // This method is called internally by the class, and it's not part of the proxy
        // So any transactional behavior added by the proxy won't be applied to this method
        jdbcTemplate.update("INSERT INTO example_table (data) VALUES ('internal data')");
    }

}

