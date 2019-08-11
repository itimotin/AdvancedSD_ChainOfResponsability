# AdvancedSD_ChainOfResponsability
 
Suppose we have an order processing application that receives orders. In our application we
have special logic for our most favored customers, because their orders are handled
differently than other orders.
Also large orders with an amount larger than $30000 are handeled differently than the
smaller orders.
For small orders we handle international orders differently than domestic orders.
Our current application has the following design:

![ChainOfResponsability Lab](https://github.com/itimotin/AdvancedSD_ChainOfResponsability/blob/master/task.png)

Redesign this application and implement it with the Chain of Responsibility pattern.

Markup : a. Draw the modified class diagram with the Chain of Responsibility pattern applied.
       b. Draw a sequence diagram that shows how your new design works. On the sequence
diagram you should show how the Chain of Responsibility pattern works.
       c. Implement your design in Java. 


![ChainOfResponsability ClassDiagram](https://github.com/itimotin/AdvancedSD_ChainOfResponsability/blob/master/classDiagram.png)

![ChainOfResponsability SequenceDiagram](https://github.com/itimotin/AdvancedSD_ChainOfResponsability/blob/master/sequence.png)
