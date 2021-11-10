package com.example.service;

import com.example.entity.Loan;

public class LoanHelper {

    /*
    1.
    Lets imagine we want to switch from regular loan to balloon loan in the setup method.
    Lets put cursor after the word `create` in the setup method. Press `ctrl + space`.
    Press enter to change method to balloon loan.

    Now revert what you have done and instead of pressing enter, press `Tab`
    Tab does not overwrite, but instead replaces the method call.

    2.
    Now instead of outputting amount to the console, you want to output regular loan for that amount.
    Put cursor before amount, type `cbl` and press `ctrl + shift + enter`

    3. Live templates. At the bottom of the setup method:
    Type `sout` and press enter.
    Type `interest.sout` and press enter.
    */

    public void setup(Loan currentLoan) {
        double amount = 500;
        Loan loan = createBalloonLoan(amount);

        double interest = Loan.getInterest(loan);

        System.out.println(amount);
        System.out.println(interest);
    }

    public Loan createRegularLoan(double amount) {
        return new Loan(amount, Loan.TYPE_REGULAR);
    }

    public Loan createBalloonLoan(double amount) {
        return new Loan(amount, Loan.TYPE_LEASING);
    }
}
