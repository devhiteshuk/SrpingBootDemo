package com.dhl.spring.SpringBootDemo.learn;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LearningConcept {

    public void streamExample(){
        List<String> names = Arrays.asList("Alice", "Bob", "Ankit", "David");

        List<String> result = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result); // Output: [ALICE, ANKIT]
    }


    public Optional<Employee> getUserById(int id) {
        // Simulating DB call
        if (id == 1) return Optional.of(new Employee(2,"hitesh","alice@example.com",3000));
        else return Optional.empty();
    }

    public void testUserById(){
        String email = getUserById(1)
                .map(Employee::getEmail)
                .orElse("unknown@example.com");

        System.out.println(email);
    }

    public void testSortingLambdaFunction(){
        getDummyEmployeeList().sort((u1, u2) -> u2.name.compareTo(u1.name));

        getDummyEmployeeList().forEach(
                employee -> System.out.println(employee.name)
        );
    }

    private List<Employee> getDummyEmployeeList(){
        Employee one = new Employee(1,"Snowflake","snowflake@gmail.com",4000);
        Employee two = new Employee(2,"Dbt","dbt@gmail.com",5000);
        Employee three = new Employee(3,"Airflow","airflow@gmail.com",6000);
        Employee four = new Employee(4,"Athena","Athena@gmail.com",7000);

        return Arrays.asList(one,two,three,four);
    }

    public class Employee{
        Integer id;
        String name;
        String email;
        Integer salary;

        Employee(Integer id,String name,String email, Integer salary){
            this.id = id;
            this.name = name;
            this.email = email;
            this.salary = salary;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Integer getSalary() {
            return salary;
        }

        public void setSalary(Integer salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id='" + id + '\'' +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }
}
