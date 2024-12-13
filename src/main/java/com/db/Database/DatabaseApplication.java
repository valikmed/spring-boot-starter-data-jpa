package com.db.Database;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
@Log
public class DatabaseApplication implements CommandLineRunner {
    DataSource dataSource;

    public DatabaseApplication(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args){
        SpringApplication.run(DatabaseApplication.class, args );
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Database" + dataSource.toString());
    }
}
