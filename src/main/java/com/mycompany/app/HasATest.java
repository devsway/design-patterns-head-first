package com.mycompany.app;

/**
 * Has-aの関係の説明用
 */
public class HasATest {

    static public void main(String arg[]) {
        System.out.println("メインを呼ぶ");
        Human foo = new Human();
        foo.twitter(new Mouse());
    }


}

class Mouse {

    //public にすると null pointer Exceptionになる

    public String rip = "赤色";

    public void say() {
        System.out.println("ハロー！");
    }

}

/**
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */
class Human {
    /**
     * Human has mouse = has-a の関係
     */
    Mouse mouse;//ここが肝！！！！

    /**
     * フィールドを持つことでこの関数が終わってもmouseの値は保持される(参照を得る)。
     *
     * @param mouse
     */
    public void twitter(Mouse mouse) {
        this.mouse = mouse;
        this.mouse.say();
    }

    /**
     * 保持されない場合
     *
     * @param mouse
     */
    public void instagram(Mouse mouse) {
        //ここ関数を実行して消える。
        mouse.say();
    }
}