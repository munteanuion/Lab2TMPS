package com.tmps.Adapter;

public class Adapter {
    SendMessage sendClass = new SendMessage();
    public void Send(String message){
        sendClass.SendMess(message);
    }
}
