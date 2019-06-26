package com.snail.designpatternlearning.InterpreterMethod;

/**
 * @author created by Snail
 * date:2019/6/26
 * email:yuesnail@gmail.com
 */
public class Or implements Expression {

    private Expression left;
    private Expression right;

    public Or(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(InterpreterContext context) {
        return left.interpret(context) || right.interpret(context);
    }

    @Override
    public boolean equals(Object obj) {
        if (null != obj && obj instanceof Or){
            return this.left.equals(((Or)obj).left) || this.right.equals(((Or)obj).right);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.toString()).hashCode();
    }


    @Override
    public String toString() {
        return left.toString() + "  or " + right.toString();
    }
}
