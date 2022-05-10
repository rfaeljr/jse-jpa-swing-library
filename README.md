**Domain of Application** 
The Simple Library at High School in Brazil 
 
**Given**
A high school in Brazil wants to wish a library system for control , management of book loan 
- Student can take a loan three books 
- The loan has duration of seven days 
- At library having books and books are in sections of library 
- Each book can to have multiples authors 
 
**Entities of real world**
- Library (describe, address, phone number) 
- Section(describe) 
- Book (isbn, describe) 
- Author (name, lastname, document number) 
- Student(id, name, lastname, born in, status with library, adress) 
 
**Details of entities**
- **Library** 
describe is the the information about name of the library example: "Library Descartes" 
- **Book** 
isbn is the information about identifier brazilian of books it's unique in Brazil 
 
**Tecnologies useds on project** 
- Program Language: Java 
- JPA - Java Persistence API 
- Database: Mysql 
- Interface Swing drawing with netbeans IDE used standard MDI window
- Tool of compiler automation: Maven 
**Notice 1:** The part of program about login and security was not developing, adopt login without access the database, that is login static 
**Notice 2:** In files *.java of the package br.com.rafaelcosta.library.view that is about graphic visual interface wasn't inserting comment in code 
**Notice 3:** About features, only crud of Author was developing
