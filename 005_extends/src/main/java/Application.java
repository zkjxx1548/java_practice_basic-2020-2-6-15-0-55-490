import module.Eagles;

public class Application {

    /**
     * 运用之前写的类在Application中用代码描述一下场景：
     * 一只4岁的老鹰，体重5Kg，这只老鹰生活在兔子窝所以它只捕食兔子。
     * 某天它先翱翔天空，在饥肠辘辘之际捕食了一只兔子，然后饱餐一顿，
     * 心满意足之后就睡觉了。
     */
    public static void main(String[] args) {
        Eagles eagles = new Eagles(4, 5, new String[]{"兔子"});
        System.out.printf(String.format("一只%d岁的老鹰，体重%dKg，这只老鹰生活在%s窝所以它只捕食%s。",
                eagles.getAge(), eagles.getWeight(), eagles.getPrey()[0], eagles.getPrey()[0] ));
        System.out.printf("某天它先%s，在饥肠辘辘之际%s了一只%s，然后%s一顿，", eagles.fly(), eagles.hunt(), eagles.getPrey()[0], eagles.eat());
        System.out.printf("心满意足之后就%s了。", eagles.sleep());
    }
}
