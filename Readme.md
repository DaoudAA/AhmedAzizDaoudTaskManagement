## For part 1:
 i have written a code for palindrome which get as in standard input the string to check on if its palindrme or no 
 and in the output user will get "true" or "false" in the standard output 
 we can run the code by executing these following steps : 
 cd Part1
 //to compile the file 
 g++ Palindrome.cpp -o Palindrome  
 //to run the output file 
 ./Palindrome



## For part 2  & 3 :
    i have worked in a spring boot project in order to implement the logic and busineess layer as well as finalize the project by exposing an API
     soo we have as an architecture in terms of packages: 
     -model : contain the entities
     -controller : for exposure of endpoints 
     -service : which handles the business layer 
     -repository : playing the role of model in terms of communicating between the business layer ( service )  and the database 
    - infrastructure : added to add abstraction for repository methods and handles the code independently of the repo 



    For dependency injection 
    I have injected for exemple the repository interface into the service layer and the service

    for Modularity and Entitites : 
    The prority was a an enumeration
    the task entity has all fields as well as mapped many to many with the taskcategory because  one task can have one or more several categories 
    for categories : i have designed the entity to be handling only the name of the category
