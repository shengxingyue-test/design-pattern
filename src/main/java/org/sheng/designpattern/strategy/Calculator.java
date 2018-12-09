package org.sheng.designpattern.strategy;

/**
 * @author sheng 2018/11/24
 * @desc 调用操作的地方，可以动态选择具体操作进行注入
 */
public class Calculator {
    private Operation operation;

    Calculator(Operation operation) {
        this.operation = operation;
    }

    public int executeOperation(int num1, int num2) {
        // todo 你在这里应该多加些东西
        return operation.doOperation(num1, num2);
    }
    
    public void hello(String somebody) {
        System.out.println("hello, " + somebody);
    }

}
