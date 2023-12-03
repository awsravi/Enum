package com.awsravi.enume;
//Define an enum for different user roles
enum UserRole {
 ADMIN,
 MODERATOR,
 USER,
 GUEST
}

//A class representing a user with a role
class User {
 private String username;
 private UserRole role;

 public User(String username, UserRole role) {
     this.username = username;
     this.role = role;
 }

 public String getUsername() {
     return username;
 }

 public UserRole getRole() {
     return role;
 }
}

public class Enum_ExC {
 public static void main(String[] args) {
     // Create users with different roles
     User adminUser = new User("admin123", UserRole.ADMIN);
     User moderatorUser = new User("moderator456", UserRole.MODERATOR);
     User regularUser = new User("user789", UserRole.USER);
     User guestUser = new User("guest001", UserRole.GUEST);

     // Print information about each user
     System.out.println("Admin: " + adminUser.getUsername() + ", Role: " + adminUser.getRole());
     System.out.println("Moderator: " + moderatorUser.getUsername() + ", Role: " + moderatorUser.getRole());
     System.out.println("Regular User: " + regularUser.getUsername() + ", Role: " + regularUser.getRole());
     System.out.println("Guest User: " + guestUser.getUsername() + ", Role: " + guestUser.getRole());
 }
}
