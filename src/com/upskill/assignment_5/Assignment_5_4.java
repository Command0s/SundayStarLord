package com.upskill.assignment_5;

public class Assignment_5_4{

public static String decodeCaesarCipher(String code, int rotation) {
    char[] characters = code.toCharArray();
    
    for (int i = 0; i < characters.length; i++) {
        if (Character.isLetter(characters[i])) {
            char base = Character.isUpperCase(characters[i]) ? 'A' : 'a';
            
            characters[i] = (char) ((characters[i] - base - rotation + 26) % 26 + base);
        }
    }
    
    return new String(characters);
}

public static void main(String[] args) {
    String encodedMessage = "Mjqqt Btwqi"; 
    
    String decodedMessage = decodeCaesarCipher(encodedMessage, 5);
    
    System.out.println("Decoded Message: " + decodedMessage); 
}
}