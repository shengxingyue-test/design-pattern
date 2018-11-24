package org.sheng.designpattern.strategy;

/**
 * @author sheng 2018/11/24
 * @desc 策略模式，动态选择具体操作
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AddOperation());
        Calculator calculator1 = new Calculator(new SubOperation());
        System.out.println(calculator.executeOperation(2, 3));
        System.out.println(calculator1.executeOperation(2, 3));
    }
}
