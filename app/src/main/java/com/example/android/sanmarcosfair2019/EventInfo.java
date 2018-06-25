package com.example.android.sanmarcosfair2019;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;


public class EventInfo{

    private String[] letters = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    private String mEventName;
    private String mEventMonth;
    private int mEventDay;
    private String mEventDayLetters;
    private int mImageResourceId;

    public EventInfo(String name, String month, int day, int i, int imageResource)
    {
        mEventName = name;
        mEventMonth = month;
        mEventDay = day;
        mEventDayLetters = letters[i];
        mImageResourceId = imageResource;
    }

    public String getmEventName() {
        return mEventName;
    }

    public void setmEventName(String mEventName) {
        this.mEventName = mEventName;
    }

    public String getmEventMonth() {
        return mEventMonth;
    }

    public void setmEventMonth(String month) {
        this.mEventMonth = month;
    }

    public int getmEventDay() {
        return mEventDay;
    }

    public void setmEventDay(int mEventDay) {
        this.mEventDay = mEventDay;
    }

    public String getmEventDayLetters() {
        return mEventDayLetters;
    }

    public void setmEventDayLetters(String mEventDayLetters) {
        this.mEventDayLetters = mEventDayLetters;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

}
