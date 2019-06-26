package com.snail.designpatternlearning.InterpreterMethod;

/**
 * @author created by Snail
 * date:2019/6/26
 * email:yuesnail@gmail.com
 */
public class Not implements Expression {

    private Variable variable;

    public Not(Variable variable) {
        this.variable = variable;
    }

    @Override
    public boolean interpret(InterpreterContext context) {
        return !variable.interpret(context);
    }

    @Override
    public boolean equals(Object obj) {
        if (null != obj && obj instanceof Not) {
            return this.variable == ((Not) obj).variable;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.toString()).hashCode();
    }


    @Override
    public String toString() {
        return variable.toString();
    }
}
