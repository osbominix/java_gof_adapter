package com.gof.designpattern;

import com.gof.designpattern.adapter.HdmiAdapter;
import com.gof.designpattern.adapter.basis.MacBook;
import com.gof.designpattern.adapter.basis.SamsungTV;
import com.gof.designpattern.adapter.basis.ThinkPad;

import javax.crypto.Mac;

/**
 * Created by yl3 on 24.11.15.
 */
public class CommandCenter {

    public static void main( String[] args ) {
        SamsungTV samsungTV = new SamsungTV("Samsung TV S001");
        MacBook macBook = new MacBook("MacBook M0001");
        ThinkPad thinkPad = new ThinkPad("Thinkpad T001");

        HdmiAdapter hdmiAdapterSamsungMacBook = new HdmiAdapter(samsungTV, macBook, null);
        hdmiAdapterSamsungMacBook.connectMacBookAndSamsungTV();

        HdmiAdapter hdmiAdapterSamsungThinkPad = new HdmiAdapter(samsungTV, null, thinkPad);
        hdmiAdapterSamsungThinkPad.connectThinkPadAndSamsungTV();

        hdmiAdapterSamsungMacBook.connectThinkPadAndSamsungTV();
        hdmiAdapterSamsungThinkPad.connectMacBookAndSamsungTV();
    }



}
