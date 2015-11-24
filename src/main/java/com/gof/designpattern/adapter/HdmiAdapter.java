package com.gof.designpattern.adapter;

import com.gof.designpattern.adapter.basis.MacBook;
import com.gof.designpattern.adapter.basis.SamsungTV;
import com.gof.designpattern.adapter.basis.ThinkPad;

/**
 * Created by yl3 on 24.11.15.
 */
public class HdmiAdapter {

    private SamsungTV samsungTV;
    private MacBook macBook;
    private ThinkPad thinkPad;

    public HdmiAdapter(SamsungTV samsungTV, MacBook macBook, ThinkPad thinkPad) {
        this.samsungTV = samsungTV;
        this.macBook = macBook;
        this.thinkPad = thinkPad;
    }


    public void connectMacBookAndSamsungTV() {
        if ((samsungTV != null) && (macBook != null)) {
            System.out.println(samsungTV.getName() + " has been connected with " + macBook.getName() + " successfully.");
        } else {
            System.out.println("Connection failed. Please bring your SamsungTV and MacBook here at first.");
        }
        System.out.println("");
    }

    public void connectThinkPadAndSamsungTV() {
        if ((samsungTV != null) && (thinkPad != null)) {
            System.out.println(samsungTV.getName() + " has been connected with " + thinkPad.getName() + " successfully.");
        } else {
            System.out.println("Connection failed. Please bring your SamsungTV and ThinkPad here at first.");
        }
        System.out.println();
    }
}
