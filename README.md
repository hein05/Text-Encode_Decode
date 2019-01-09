# Text-Encode_Decode (Huffman Text Compression)
 
**_JAVA Project_**
###### (Fall 2018, Data Structure Course)

## Description

- Compress Text (only ASCII), from **_124 bytes to 91 bytes (Demostration gif below)_** 
- Build frequency list of characters to imported text file.
- Use frequency lists to build Huffman Tree.
- Use Huffman Tree to generate binary strings for each characters of Input.txt file
- Convert Binary Strings to Base64 Characters.
- Write to Encoded File.
- Decode the encoded text back to original text.

## Next (Future implementation)

###### (Comment : Hoping to grow "Old", :wink:, with this project as far as I am interested )

- [x] To implement Encoding process with GUI.
- [ ] To implement Decoding process with GUI.
- [ ] To Export Technical Details with GUI.
- [ ] To Encrypt Encoded Text.
- [ ] To Decrypt Decoding Text.
- [ ] To implement with different Data Structure (Ex: Fibonacci Heap).

## Files

  **_Base64Decode.java_**
  - Hash map for Base64 Characters,Decoding KV pairs
  
  **_Base64Encode.java_**
  - Hash map for Base64 Characters,Encoding KV pairs

  **_FileRW.java_**
  - Handles Read/Write of text files

  **_Hash Index, Huffman Data, Huffman Node, Huffman Tree_**
  - Handles building Huffman tree for Text Compression.
  
  **_Padding.java_**
  - helper Class for padding binary when decoding back (due to loss of data from Decimal to binary String conversion)

  **_EncodeManager.java(Not uploaded)_**
  - Handles encoding processess.
  
  **_DecodeManager.java(Not uploaded)_**
  - Handles decoding processes.
  
  **_Buffered Queue.java(Not uploaded)_**
  - Since I was learning Data Structure, I tried to create Queue to run each characters of encoding to, decoding from process. In fact, it can easily be done with concatenate Java String-Object without creating Queue or Stack.
  
  **_Main.java_**
  - Execution of everything.

## Demostration
  
  #### All Function w/o GUI
![](https://imgur.com/sO0xlQ3.gif)

 #### With GUI (Only Encoding for now)
![](https://imgur.com/z8cz0T3.gif)




