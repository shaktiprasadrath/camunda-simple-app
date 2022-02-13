package com.camunda.power;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("calculation")
public class Calculations implements JavaDelegate {


    @Override
    public void execute(DelegateExecution de) throws Exception {
        System.out.println("Making calculation");
        String finp = de.getVariable("input1").toString();
        String sinp = de.getVariable("input2").toString();
        String opr = de.getVariable("operation").toString();
        System.out.println("First Input: "+finp+" Second Input: "+sinp+" Operation: "+opr);
        if (opr.equals("+")){
            int add = Integer.parseInt(finp)+Integer.parseInt(sinp);
            System.out.println("Addition is: "+ add);
        }else if (opr.equals("*")){
            int mul = Integer.parseInt(finp)*Integer.parseInt(sinp);
            System.out.println("Multplication is: "+ mul);
        }
    }
}
