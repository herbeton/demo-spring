package com.example.demo.dto;

import com.example.demo.entities.Department;
import com.sun.istack.NotNull;
import javax.validation.constraints.NotEmpty;

public class UserDto {
        private Long Id;
        @NotEmpty
        private String name;
        @NotEmpty
        private String email;
        private Department department;

        public Long getId() {
                return Id;
        }

        public void setId(Long id) {
                Id = id;
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

        public Department getDepartment() {
                return department;
        }

        public void setDepartment(Department department) {
                this.department = department;
        }
}