package jalesson20.domain;

import javax.persistence.*;

import java.io.Serializable;
    @Entity
    @Table(name = "users")
    public class User implements Serializable {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "userid")
        private Long userId;
        @Column(name = "username")
        private String userName;
        @Column(name = "password")
        private String password;
        @Column(name = "email")
        private String email;
        @Column(name = "enabled")
        private int enabled;

        public User(User user) {
        }

        public User(String userName, String password, String email, int enabled) {
            this.userName = userName;
            this.password = password;
            this.email = email;
            this.enabled = enabled;
        }

        public User() {

        }

        public Long getUserId() {
            return userId;
        }

        public void setUserId(Long userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getEnabled() {
            return enabled;
        }

        public void setEnabled(int enabled) {
            this.enabled = enabled;
        }


        @Override
        public String toString() {
            return "User{" +
                    "userId=" + userId +
                    ", userName='" + userName + '\'' +
                    ", password='" + password + '\'' +
                    ", email='" + email + '\'' +
                    ", enabled=" + enabled +
                    '}';
        }
    }
