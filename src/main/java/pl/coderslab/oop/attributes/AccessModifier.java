package pl.coderslab.oop.attributes;

public class AccessModifier {

    public String publicAttribute;
    protected String protectedAttribute;
    private String privateAttribute;

    public static void main(String[] args) {

        AccessModifier testAttribute = new AccessModifier();

        System.out.println("private: " + testAttribute.privateAttribute);
        System.out.println("protected: " + testAttribute.protectedAttribute);
        System.out.println("public: " + testAttribute.publicAttribute);



//        testAttribute.publicAttribute = "test 1";
//
//
//
//        String checkPublic;
//        String checkPrivate;
//        String checkProtected;

    }

}
