# ER DIAGRAM JOURNEY
---

<br>
In this repository we are going to make a conceptual model of social media website and try to convert it into relational diagram.
<br>

## Procedure

- ### Requiring features and usecases.
- ### Idenify Entity Sets.
- ### Identify attributes and their types.
- ### Identify relationships and constraints.


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
  
- user-post
  - postId
  - text
  - images **(multivalued)**
  - video **(multivalued)**
  - createdTimestamp
  - lastModifiedTimestamp
  
- post-comment-id
  - postCommentId
  - text
  - createdTimestamp
  - lastModifiedTimestamp
  
- post-like-id
  - postLikeId
  - likeTimestamp

> ## Identifying relationships and constraints

- user-profile **friendship** user-profile  
- user-profile **has-posts** *[Total Participation(==)]* user-post
- user-profile **has-likes** *[Total Participation(==)]* post-like
- user-profile **has-comments** *[Total Participation(==)]* post-comment
- user-post **has-likes** *[Total Participation(==)]* post-like
- user-post **has-comments** *[Total Participation(==)]* post-comment



