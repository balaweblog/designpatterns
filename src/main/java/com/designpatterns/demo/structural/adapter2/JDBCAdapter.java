package com.designpatterns.demo.structural.adapter2;

// 1. this is implemeting the new one IJPA 
public class JDBCAdapter implements IJPA {

    // 2. old object jdbc
    IJDBC jdbc;
    // 3. pass through all your old one in adapter constructor 
    public JDBCAdapter(IJDBC jdbc) {
        this.jdbc = jdbc;
    }
    @Override
    public void executeJPAQuery(String jpaquery) {
        // 4. do all your work here and pass to jdbc 
        String jdbcquery = convertjpaquerytojdbcquery(jpaquery);
       jdbc.executeJDBCQuery(jdbcquery);
    }
    private String convertjpaquerytojdbcquery(String jpaquery) {
        String jdbcquery = jpaquery;
        System.out.println("converting jpa query to jdbc query");
        return jdbcquery;
    }
    
}
