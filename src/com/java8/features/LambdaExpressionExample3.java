package com.java8.features;

//Java Lambda Expression Example: No Parameter
//A lambda expression can have zero or any number of arguments. Let's see the examples:
public class LambdaExpressionExample3{  
public static void main(String[] args) {  
    Sayable s=()->{  
        return "I have nothing to say.";  
    };  
    System.out.println(s.say());  
}  
}