# Caesar Cipher Program

This repository contains a Java implementation of the **Caesar Cipher** encryption and decryption technique. The Caesar Cipher is a type of substitution cipher where each letter in the plaintext is shifted a fixed number of places down or up the alphabet.

## Features

- **Encryption**: Encrypts a message by shifting each letter by a fixed number of positions.
- **Decryption**: Decrypts a message by reversing the shift.
- **User Interaction**: Allows users to input a message, specify a shift value, and choose between encryption and decryption.
- **Input Validation**: Checks for valid inputs, including shift values and non-empty strings.

## Project Structure

The project includes two classes:

1. **CaeserCipher**: Handles the encryption and decryption logic.
2. **CipherChild**: Provides a user interface via the console to interact with the Caesar Cipher.

## Code Explanation

### `CaeserCipher` Class

This class is responsible for the encryption and decryption logic.

- **Constructor**:
  ```java
  public CaeserCipher(String input, int shift)
  ```
  - Validates the input string and shift value.
  - If the shift value is negative or larger than 25, it is normalized to fall within the range [0, 25].

- **Methods**:
  - **`encryption()`**: Returns the encrypted version of the input string.
  - **`decryption()`**: Returns the decrypted version of the input string.
  - **`process(int k)`**: Core method used for both encryption and decryption. Shifts each letter by `k` positions.

### `CipherChild` Class

This class provides a console-based interface for the user to interact with the Caesar Cipher.

- **Workflow**:
  1. Prompts the user to input a message.
  2. Prompts for the shift value.
  3. Allows the user to select either encryption or decryption.
  4. Displays the resulting message based on the chosen operation.

## Usage

### Steps to Run the Program

1. **Compile the Code**:
   ```bash
   javac CaeserCipher.java CipherChild.java
   ```

2. **Run the Program**:
   ```bash
   java CipherChild
   ```

### Example Interaction

```
!!!!    Welcome to Ceaser Cipher Game   !!!!
Enter your String:
Hello World

Enter the shift value:
3

Enter Your Process:
1. Encryption
2. Decryption

1

The Encrypted message is: Khoor Zruog
```

## How the Caesar Cipher Works

The Caesar Cipher works by shifting each letter of the input string by a fixed number of positions in the alphabet. For example, with a shift of `3`:

- `A` becomes `D`
- `B` becomes `E`
- `Z` wraps around and becomes `C`

For decryption, the shift is reversed.

## Edge Cases Handled

- **Non-letters**: Characters like spaces, numbers, and punctuation are not changed.
- **Shift Values**: Any shift value (positive or negative) is normalized to the range `[0, 25]`.
- **Empty Input**: Throws an exception if the input string is empty.

## Limitations

- This implementation works only with the English alphabet (uppercase and lowercase letters).

## License

This project is licensed under the MIT License.

---

**Enjoy encrypting and decrypting messages with the Caesar Cipher!**
