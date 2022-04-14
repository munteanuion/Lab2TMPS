package com.tmps.Bridge;

public class ProgramCreator {
    public static void main(String[] args){
        Program program1 = new BankSystem(new JavaDeveloper());
        Program program2 = new StockExchange(new PhpDeveloper());

        program1.developProgram();
        program2.developProgram();
    }

}
