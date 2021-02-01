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

1. 
