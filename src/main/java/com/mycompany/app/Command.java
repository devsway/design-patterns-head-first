package com.mycompany.app;

/**
 * コマンドパターンの肝
 */
public interface Command {
    public void execute();
    public void undo();
}
