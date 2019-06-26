package com.snail.designpatternlearning.InterpreterMethod;

/**
 * @author created by Snail
 * date:2019/6/26
 * email:yuesnail@gmail.com
 */
public class Variable implements Expression {

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public boolean interpret(InterpreterContext context) {
        try {
            return context.lookup(this);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (null != obj && obj instanceof Variable) {
            return this.name.equals(((Variable) obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.toString()).hashCode();
    }


    @Override
    public String toString() {
        return name;
    }
}
