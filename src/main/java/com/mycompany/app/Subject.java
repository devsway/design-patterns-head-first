package com.mycompany.app;

/**
 * オブサーバーへのインターフェイス
 * データの管理を行います
 */
public interface Subject {

    /**
     *登録されるオブサーバー
     *
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * 削除するオブサーバー
     *
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * subjectの状態が変わったときの呼び出される。
     */
    public void notifyObserver();
}
