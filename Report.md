 # Homework Aloha World Report

The following report contains questions you need to answer as part of your submission for the homework assignment. 


## Design Doc
Please link your UML design file here. See resources in the assignment on how to
link an image in markdown. You may also use [mermaid] class diagrams if you prefer, if so, include the mermaid code here.  You DO NOT have to include Greeting.java as part of the diagram, just the AlohaWorld application that includes: [AlohaWorld.java], [Greeter.java], and [ConsoleView.java].
---
title: Aloha World UML
``` mermaid 
classDiagram
direction LR
AlohaWorld --> Greeter
AlohaWorld --> ConsoleView : uses
ConsoleView --> Greeter : uses
class AlohaWorld {
      + main(String[] args): void 
    }
    class Greeter {
        - name: String
        - locality: int
        + Greeter(String name)
        + getName(): String 
    }
    class ConsoleView {
    }
```

### Program Flow
Write a short paragraph detailing the flow of the program in your own words. This is to help you understand / trace the code (and give you practice of something called a code walk that will be required in this course).

the program starts at alohaworld, asking the name of the user. then ask the user to pick pu a locality from the 4, if index out
of the range, the program will ask user to pick again. finally it will print the greeting based on users locality to the console
then the program asks whether to continue and loops until user put no.

## Assignment Questions

1. List three additional java syntax items you didn't know when reading the code.  (make sure to use * for the list items, see example below, the backtick marks are used to write code inline with markdown)
   
   * (example) `final class`
   * `List.copyOf`
   * `this()`
   * `scanner class`

2. For each syntax additional item listed above, explain what it does in your own words and then link a resource where you figured out what it does in the references section. 

    * (example) The `final` keyword when used on a class prevents the class from being subclassed. This means that the class cannot be extended by another class. This is useful when you want to prevent a class from being modified or extended[^1] . It is often the standard to do this when a class only contains static methods such as driver or utility classes. Math in Java is an example of a final class[^2] .
    * `List.copyOf` returns a read only list https://stackoverflow.com/questions/54851349/java-how-can-i-use-correctly-list-copyof
    * `this()` calls another constructor within a constructor https://www.youtube.com/watch?v=ETLHbHenW44&t=137s
    * `scanner` kind like a input() function in python but it is a object https://www.w3schools.com/java/java_user_input.asp

3. What does `main` do in Java? 

    main method is where program gets executed it calls other methods, create objects.

4. What does `toString()` do in Java? Why should any object class you create have a `toString()` method?
it overrides how objects are printed, we can set how we want objects are printed. 
    Same as above - short answer
   without it, if I do System.out.println(object), it will give me a memory location where the obj is stored.
5. What is javadoc style commenting? What is it used for? 
a description of a method or a class or a constructor or a variable. and @param @return type
    Same as above - short answer
it can tell the users how to use the methods, and it can be generate html doc

6. Describe Test Driving Development (TDD) in your own words. 
write test first then write actual methods to pass the test
    Same as above - short answer    

7. Go to the [Markdown Playground](MarkdownPlayground.md) and add at least 3 different markdown elements you learned about by reading the markdown resources listed in the document. Additionally you need to add a mermaid class diagram (of your choice does not have to follow the assignment. However, if you did use mermaid for the assignment, you can just copy that there). Add the elements into the markdown file, so that the formatting changes are reserved to that file. 


## Deeper Thinking Questions

These questions require deeper thinking of the topic. We don't expect 100% correct answers, but we encourage you to think deeply and come up with a reasonable answer. 


1. Why would we want to keep interaction with the client contained to ConsoleView?
make the program modular, and it is easy to write test.

2. Right now, the application isn't very dynamic in that it can be difficult to add new languages and greetings without modifying the code every time. Just thinking programmatically,  how could you make the application more dynamic? You are free to reference Geeting.java and how that could be used in your design.
we can add a file which contains most of the localities and corresponding greeting languages, and do a file IO to have more options for the locality.


> [!IMPORTANT]
>  After you upload the files to your github (ideally you have been committing throughout this progress / after you answer every question) - make sure to look at your completed assignment on github/in the browser! You can make sure images are showing up/formatting is correct, etc. The TAs will actually look at your assignment on github, so it is important that it is formatted correctly.


## References

[^1]: Final keyword in Java: 2024. https://www.geeksforgeeks.org/final-keyword-in-java/. Accessed: 2024-03-30. 

[^2]: Math (Java Platform SE 17). https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html. Accessed: 2024-03-30.


<!-- This is a comment, below this link the links in the document are placed here to make ti easier to read. This is an optional style for markdown, and often as a student you will include the links inline. for example [mermaid](https://mermaid.js.org/intro/syntax-reference.html) -->
[mermaid]: https://mermaid.js.org/intro/syntax-reference.html
[AlohaWorld.java]: src/main/java/student/AlohaWorld.java
[Greeter.java]: src/main/java/student/Greeter.java
[ConsoleView.java]: src/main/java/student/ConsoleView.java