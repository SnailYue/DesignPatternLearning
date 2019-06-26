package com.snail.designpatternlearning.InterpreterMethod;

/**
 * @author created by Snail
 * date:2019/6/26
 * email:yuesnail@gmail.com
 */
public class Constant implements Expression {

    private boolean value;

    public Constant(boolean value) {
        this.value = value;
    }

    @Override
    public boolean interpret(InterpreterContext context) {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (null != obj && obj instanceof Constant){
            return this.value == ((Constant)obj).value;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.toString()).hashCode();
    }


    @Override
    public String toString() {
        return new Boolean(value).toString();
    }
}
