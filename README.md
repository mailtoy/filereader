# Input-Output Tasks
by Kanchanok Kannee

I ran the tasks on a MacBook Pro (Retina, 13-inch, Early 2015) with 2.7 GHz Intel Core i5, and got these results:

Task                                          | Time
----------------------------------------------|-------:
Read file 1-char at a time to String          |  1.113333 sec
Read file 1-char at a time to StringBuilder   |  0.039311 sec
Read file line at a time using BufferedReader |  0.036272 sec                                  

## Explanation of Results

**explain why some tasks are slower than others.  what are the factors?**

Appending char to String will use memory to keep a new result String and still keep the old String, ``so every time a String is created, it takes time and use more memories.``


StringBuilder has a attribute char[] value. StringBuilder able to add String or char into this StringBuilder will just update the value inside the char[] value. Finally,it has only one String .

BufferedReader reads a line of characters from the specified stream and stores it in a buffer. This makes input faster.
InputStreamReader reads only one character from specified stream and remaining characters still remain in the stream.

### Conclusion
 
BufferedReader is fast because it maintains a buffer and retrieving data from buffer is always fast as compared to retrieving data from disk/stdin.

**use time :**
``` 
BufferedReader  < StringBuilder < String
```

But, sometimes BufferedReader > StringBuilder (a little more)
