//***********************************************************************
//
//                  H T L - W E L S   /   Klasse 3BHIT
//
//-----------------------------------------------------------------------
// Programm         : Fehler korrigieren & Arbeiten mit Speicherzuweisung
//
// Ersteller        : David Wandratsch
//
// Erstelldatum     : 2021-04-29
//
// Abgabedatum      : 2021-05-04
//
// Kurzbeschreibung : Fehler korrigieren, Funktionen implementieren
//                    und Arbeiten mit Pointern
//
// GitHub Repository: https://github.com/WandratschDavid/errorCorrection
//***********************************************************************

// Including libraries
#include <stdio.h>
#include <mm_malloc.h>
#include <time.h>
#include <string.h>

// predefining functions
int* rands(int size);
char* addstr(char* str1, char* str2);
char* getline(char* fileName);

// main program
int main()
{
    // ================ Finde den Fehler ================ //
    int* randomNumber;
    int sizeRands = 10;

    randomNumber = rands(sizeRands);

    // printing the generated random numbers
    for (int i = 0; i < sizeRands; i++)
    {
        printf("%2d. Zufallszahl: %d\n", i + 1, randomNumber[i]);
    }

    // freeing memory
    free(randomNumber);


    // ============== String Konkatenation ============== //
    char* combinedString;
    char str1[] = "Speicher";
    char str2[] = "zuweisung";

    // combining the two Strings
    combinedString = addstr(str1, str2);

    printf("\nVerbundener String: %s + %s = %s\n", str1, str2, combinedString);

    // freeing memory
    free(combinedString);


    // ================= Zeile einlesen ================= //
    char* getString = getline("../testFile.txt");

    // checking whether the String is empty or not
    if (getString != NULL)
    {
        printf("\nDatei - Inhalt: %s\n", getString);
    }

    // freeing memory
    free(getString);
}


//********************************************************************
// Funktion        : rands
//
// Kurzbeschreibung: Generating as much numbers as requested
//                   between 1 - 100
//
// Parameter       :
//    1   size         int         tells the function how many numbers
//                                 to generate
//    R   zahl         int[]       returns the Integer - Array with
//                                 the generated numbers
//********************************************************************
int* rands(int size)
{
    int i;
    int* zahl;

    // Speicherplatz reservieren
    zahl = (int*) malloc(size * sizeof(*zahl));

    // Zufallsgenerator initialisieren
    srand((unsigned) time(NULL));

    // Zufallszahlen erzeugen
    for (i = 0; i < size; i++)
    {
        zahl[i] = (rand() % 100) + 1; // generating a random number from 1 - 100
    }

    // Zeiger auf die Zahlen zurückgeben
    return (zahl);
}

//**************************************************************************
// Funktion        : addstr
//
// Kurzbeschreibung: This function combines the two provided Strings
//
// Parameter       :
//    1   str1              char[]      Array containing the first String
//    2   str2              char[]      Array containing the second String
//    R   combinedString    char[]      Array containing the combined String
//**************************************************************************
char* addstr(char* str1, char* str2)
{
    int str1Length = strlen(str1);
    int totStrLength = str1Length + strlen(str2);

    // assigning the amount of memory needed
    char* combinedString = malloc(totStrLength + 1);

    // combining the two Strings
    for (int i = 0; i < str1Length; i++)
    {
        combinedString[i] = str1[i];
    }

    for (int j = 0; j < strlen(str2); j++)
    {
        combinedString[j + str1Length] = str2[j];
    }

    combinedString[totStrLength] = '\0';

    return combinedString;
}

//***************************************************************************
// Funktion        : getline
//
// Kurzbeschreibung: Gets the content of a file
//
// Parameter       :
//    1   fileName     char        hands over the file name
//    R   textLine     char[]      contains the first 512 letters of the file
//***************************************************************************
char* getline(char* fileName)
{
    // assigning the amount of memory needed
    char* textLine = malloc(512);
    // opening the desired file
    FILE* file = fopen(fileName,"r");
    // declining the variable to keep track of the current position in the array
    int position = 0;
    char character;

    // checking if the file is available
    if (file == NULL)
    {
        printf("\nNo file found!\n");
        return NULL;
    }

    while ((character = fgetc(file)) != EOF && position < 511)
    {
        // checking for text in a new line
        if (character == '\n')
        {
            break;
        }

        textLine[position] = character;
        position++;
    }

    // closing the file
    fclose(file);

    textLine[strlen(textLine)] = '\0';

    return textLine;
}