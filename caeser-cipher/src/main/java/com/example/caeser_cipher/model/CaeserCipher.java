package com.example.caeser_cipher.model;

public class CaeserCipher {
    private  final String input;
    private  final int shift;

    public CaeserCipher(String input,int shift){
        if(input == null || input.isEmpty()){
            throw new IllegalArgumentException("\nInput string cannot be empty.");
        }
        if(shift < 0 || shift > 25){
            shift = (shift % 26 + 26) % 26;
        }

        this.input = input;
        this.shift = shift;
    }

    public final String encryption(){
        return process(this.shift);
    }

    public final String decryption(){
        return process(this.shift*-1);
    }


    private String process(int k){

        char ch;
        StringBuilder output = new StringBuilder();

        for(int i  = 0;i < input.length();i++){
            ch = this.input.charAt(i);
            

            if(Character.isLetter(ch)) {
                boolean isLower = Character.isLowerCase(ch);
                char base = isLower ? 'a' : 'A';
                output.append((char) ((ch - base + 26 + k) % 26 + base));
            }

            else{
                output.append(ch);
            }
        }
        return output.toString();
    }
}
