package com.mycompany.app;

/**
 * コマンドパターンにおけるクライアントのテストです
 */
public class RemoteControlTest {
    public static void main (String[] args){
        /**
         * リモコンはインボーカです
         */
        SimpleRemoteControl remote = new SimpleRemoteControl();
        LightOnCommand lightOn = new LightOnCommand(new Light());

        /**
         * ここでインボーカ(=リモコン)にコマンドを渡します(セットします)
         */
        remote.setCommand(lightOn);
        /**
         * インボーカを起動！
         */
        remote.buttonWasPressed();
    }
}
