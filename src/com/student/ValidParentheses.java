package com.student;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> finalstack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                finalstack.push(s.charAt(i));
            else if(!finalstack.isEmpty()){
                char ch = finalstack.pop();
                if(ch=='(' && s.charAt(i)!=')'){
                    return false;
                }
                else if(ch=='{' && s.charAt(i)!='}'){
                    return false;
                }
                else if( ch=='[' && s.charAt(i)!=']') {
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return finalstack.isEmpty()?true:false;
    }
    public static void main(String ... a) {
        ValidParentheses obj = new ValidParentheses();
        boolean result = obj.isValid("()[]{}");
        System.out.println(result);
    }
}
