package pl.coderslab.oop.attributes;

public class Main02 {

    public static void main(String[] args) {
        AccessModifier testAttr = new AccessModifier();

        testAttr.publicAttribute = "modyf. public";
//        testAttr.privateAttribute = "modyf. private";
        testAttr.protectedAttribute = "modyf. protected";

        System.out.println("public: " + testAttr.publicAttribute);
//        System.out.println("private: " + testAttr.privateAttribute);
        System.out.println("protected: " + testAttr.protectedAttribute);

    }
}
