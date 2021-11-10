package com.example.entity;

public class Loan {

    /*
    The goal is to refactor from constants into enum, because enum is a cleaner solution

    1.
    Duplicate the constants. Wrap constants in `public enum Type {`
    Highlight first `public` and press `ctrl + G` twice. Now you have multiple cursors.
    Using multiple cursors, make the enum compile

    2.
    Change the constructor to work with enum instead of constants.
    Use `option + enter` to fix the problems.

    3. In the `getInterest` method, highlight the word `case` press `ctrl + G` twice to get multiple cursors and fix the code.

    4. Fix the remaining problems by pressing on the `related problem` hint.

    5. Notice that `setType` method is not used, put cursor on it, use `option + enter` to remove the method.
    Notice, that field `type` is now highlighted. Put cursor on it, use `option + enter` to fix the problem.

    Things highlighted in gray or yellow box or wavy underline offer fixes from IntelliJ side by pressing `option + enter`
    */

    public static final int TYPE_REGULAR = 0;
    public static final int TYPE_BALLOON = 1;
    public static final int TYPE_LEASING = 2;

    private double amount;
    private int type;

    public Loan(double amount, int type) {
        this.amount = amount;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public static double getInterest(Loan loan) {
        switch (loan.getType()) {
            case Loan.TYPE_REGULAR:
                return loan.getAmount() * 0.01;
            case Loan.TYPE_BALLOON:
                return loan.getAmount() * 0.02;
            case Loan.TYPE_LEASING:
                return loan.getAmount() * 0.03;
        }

        return 0;
    }
}
