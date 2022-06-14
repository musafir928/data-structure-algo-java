package phoneBook;

import lombok.Value;

import java.lang.annotation.Target;
import java.io.*;
import java.nio.charset.Charset;

public class app{


    public static void main(String[] args) throws FileNotFoundException {
        Node newNode = new Node("adil","ablimit", "a@a.a", "1234567890");
        String a = Integer.toHexString(newNode.hashCode());
        PrintStream p = new PrintStream(Integer.toHexString(newNode.hashCode()));
        System.out.println("newNode.hashCode() = " + Integer.toHexString(newNode.hashCode()));
        p.println(newNode);

    }
}
