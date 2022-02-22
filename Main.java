package com.company;

public class Main {

    public static void main(String[] args) {
      ITelephone gauravPhone;
      gauravPhone=new DeskPhone(987654321);
      gauravPhone.powerOn();
      gauravPhone.callPhone(987654321);
      gauravPhone.answer();

      gauravPhone=new MobilePhone(23456);
      gauravPhone.callPhone(24365);
      gauravPhone.answer();
      gauravPhone.powerOn();
    }
}
