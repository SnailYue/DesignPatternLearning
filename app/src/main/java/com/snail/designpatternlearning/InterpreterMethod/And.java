package com.snail.designpatternlearning.InterpreterMethod;

/**
 * @author created by Snail
 * date:2019/6/26
 * email:yuesnail@gmail.com
 */
public class And implements Expression {

    private Expression left;
    private Expression right;

    public And(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(InterpreterContext context) {
        return left.interpret(context) && right.interpret(context);
    }

    @Override
    public boolean equals(Object obj) {
        if (null != obj && obj instanceof And){
            return this.left.equals(((And)obj).left) && this.right.equals(((And)obj).right);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.toString()).hashCode();
    }


    @Override
    public String toString() {
        return left.toString() + "  and " + right.toString();
    }
}
