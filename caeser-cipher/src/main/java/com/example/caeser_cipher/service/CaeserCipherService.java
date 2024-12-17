package com.example.caeser_cipher.service;

import org.springframework.stereotype.Service;

import com.example.caeser_cipher.model.CaeserCipher;

@Service
public class CaeserCipherService {
    public String encrypt(String input, int shift) {
        CaeserCipher cipher = new CaeserCipher(input, shift);
        return cipher.encryption();
    }

    public String decrypt(String input, int shift) {
        CaeserCipher cipher = new CaeserCipher(input, shift);
        return cipher.decryption();
    }
}
