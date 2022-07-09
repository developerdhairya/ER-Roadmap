# ER DIAGRAM JOURNEY
---

<br>
In this repository we are going to make a conceptual model of social media website and try to convert it into relational diagram.
<br>

## Procedure

- ### Requiring features and usecases.
- ### Idenify Entity Sets.
- ### Identify attributes and their types.
- ### Identify relations and constraints.


<br><br>



> ## Requiring features & usecases

- profile ➙ userProfile ➙ friends
- User can post
- Post ➙ contains ➙ text Content,images
- Post ➙ like,comment


> ## Identifying entity sets

- user-profile
- user-post
- post-comment
- post-like

> ## Identifying atributes and their types

- user-profile
  - name **(composite)**
  - username
  - email 
  - password
  - contactNo **(multivalued)**
  - dob
  - age **(derieved)**



