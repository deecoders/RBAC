# RBAC
## Introduction/Description
1. This project is a POC for Role Based Access Control system. It is designed in JAVA using OOPS concepts and design patterns like factory pattern, interceptor pattern


## Design and Flow

### Client Side
1. There are two main scenarios considered while running this project 
* Admin Login
* Normal user Login

2. Admin and User will have the differnet set of options available to them after they log in. **Factory Pattern** is used to facilitate this(), so this is extendable
to any other type of welcome interface in future if required.(DisplayControlAdmin.java && DisplayControlUser.java)

3. The admin's option includes adding a user, edit roles of a user, view all the users, deleting a user, viewing all the roles of a user which gets displayed on 
home screen of admin.

4. A user's options include viewing its roles, viewing its action types corresponding to a resource.

### Core design/RABC design

1. There are four main entities/model considered for the project
 * User
 * Role
 * Resource
 * ActionTypes
 
 2. UserRole and RoleResourceAccess models are created to create a dependency between entities.
 3. UserRole acts as linking of user to role, thus having zero redundancy in case a role needs to be deleted or added to a particular user.
 4. RoleResource acts as storage of all the access types of a particular resource to particular roles.
 4. Dao are created to act as access point and to all the models. **Data Access Object design pattern** is used here.
 

## Assumptions

1. There is only one admin user on client side that can exist with "admin" as username and password as "123". Only admin can add or delete entities.
2. Entity name IDs will be unique like userName, roleName, resourceName, actionTypeName. Currently this scenario is not handled in code for duplicate entries but code design will allow this to be done easily.
3. Exceptions might comes at some places regarding memory access if input is given in such a way. Code does not handle corenr cases completely(due to lack of time)


## Initilaizations
1. User
* username="anksh", password="123", normal user
* username="shkaya" password="123", normal user
* username="admin" password="123", admin

2. Roles
* roleName="Admin"
* roleName="Accountant"
* roleName="Developer"

3. Resources
* resourceName="Payroll"
* resourceName="Production"

4. Roles are assigned to users anksh, shkaya and appropriate access is given to resources

## How to Run
1. Run main() method in "App.java" to launch the application

## ScreenShots
1. Admin Welcome Screen
 ![Alt](https://github.com/deecoders/RBAC/blob/master/screenshots/AdminWelcome.png)
 
 2. Adding User
 ![Alt](https://github.com/deecoders/RBAC/blob/master/screenshots/AddUser.png)
 
 3. Deleting a User
 ![Alt](https://github.com/deecoders/RBAC/blob/master/screenshots/deleteUser.png)
 
 4. Edit Role of a User
 ![Alt](https://github.com/deecoders/RBAC/blob/master/screenshots/editRole.png)
 
 5. User Welcome Screen
 ![Alt](https://github.com/deecoders/RBAC/blob/master/screenshots/userWelcome.png)
 
 6. View roles of the user logged in
 ![Alt](https://github.com/deecoders/RBAC/blob/master/screenshots/userRoleView.png)
 
 7. View access types for a particular resource of the looged in user
 ![Alt](https://github.com/deecoders/RBAC/blob/master/screenshots/resouceAccessView.png)
