/*
    Programmer : Nghia Nguyen
    Description : This is the first android project that I built to learn and practice Java. this project
                    is simple an quiz activity.
    First version   : 2021/02/10
*/

package com.michaelwoan.quizactivity;

public class Question {
    private int mTestRestId;
    private boolean mAnswerTrue;

    public Question(int testResId, boolean answerTrue){
        mTestRestId = testResId;
        mAnswerTrue = answerTrue;
    }

    public int getTestRestId() {
        return mTestRestId;
    }

    public void setTestRestId(int testRestId) {
        mTestRestId = testRestId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
