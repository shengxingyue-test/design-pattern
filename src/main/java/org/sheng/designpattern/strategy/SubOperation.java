package org.sheng.designpattern.strategy;

/**
 * @author sheng 2018/11/24
 * @desc 减法操作
 */
public class SubOperation implements Operation{
    @Override
    public int doOperation(int num1, int num2) {
        System.out.println("减法策略: " + num1 + " - " + num2);
        return num1 - num2;
    }
}
