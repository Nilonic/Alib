# Alib
check wiki or here for documentation!


# how to use:
importing is simple, just follow these steps

## to import just the finder:
put this at the top of your document:
```java
import Nilon.ALib.Finder;
```

## to import everything (wildcard):
put this at the top of your document:
```java
import Nilon.ALib.*;
```

# current features (1.0):

## Character Finder (in the Finder package):
### description:
finds a character within a string
### example:
```java
//import the finder package
import Nilon.ALib.Finder;

public class yourClass{
    public static void main(String[] argv) {
        System.out.println(Finder.FindCharacter("x", "12345678x0")); //expected output: 8
    }
}
```

## toIntEX (in the Finder package)
### description:
changes a string to an int (or returns null if it cannot convert)
### example:
```java
//import the finder package
import Nilon.ALib.Finder;

public class yourClass{
    public static void main(String[] argv) {
        System.out.println(Finder.toIntEX("432")); //expected output: 432, but as an int
        System.out.println(Finder.toIntEX("coolio")); //expected output: null
    }
}
```