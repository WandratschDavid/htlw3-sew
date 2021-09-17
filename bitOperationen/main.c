//********************************************************************
//
//                H T L - W E L S   /   Klasse 3BHIT
//
//--------------------------------------------------------------------
// Programm         : Bitoperatoren
//
// Ersteller        : David Wandratsch, 3BHIT
//
// Erstelldatum     : 2021-04-15
//
// Kurzbeschreibung : Rechnen mit bzw. ausgeben von Bitoperatoren
//
// GitHub Repository: https://github.com/WandratschDavid/bitOperationen
//********************************************************************

// Standardbibliotheken einbinden
#include <stdio.h>
#include <stdlib.h>

long getBinNumFromDec();

int main()
{
    char run;
    int option;
    char choice;
    long a, b, i, shift = 0;
    unsigned long n;

    while (run != 'n')
    {
        printf("Welche Aktion wollen sie machen?\n");
        printf("1. Bit - Manipulationen\n");
        printf("2. Benutzerfunktionen\n");
        printf("3. Programm beenden\n");
        scanf("%i", &option);

        switch (option)
        {
            case 1:
                printf("==== Bit - Operatoren ====\n");
                printf("Entscheiden Sie sich bitte zwischen binaerer und dezimaler Eingabe (b|d)!\n");
                fflush(stdin);
                scanf("%c", &choice);

                switch (choice)
                {
                    case 'b':
                        printf("Bitte geben Sie zwei binaere Zahlen (max. 16 Stellen) ein! \n");
                        printf("1.Zahl: \n");
                        scanf("%d", a);
                        printf("2.Zahl: \n");
                        scanf("%d", b);

                        printf("1.Binaerzahl: %d\n", a);
                        printf("2.Binaerzahl: %d\n", b);

                        break;
                    case 'd':
                        printf("Bitte geben Sie zwei ganze dezimale Zahlen ein!\n");
                        printf("1. Zahl: \n");
                        scanf("%d", a);
                        printf("2. Zahl: \n");
                        scanf("%d", b);

                        a = getBinNumFromDec(a);
                        b = getBinNumFromDec(b);

                        break;
                    default:
                        printf("Dies ist kein valider Operator!\n");
                }
                break;

            case 2:
                printf("Das Bitmuster von x & y: \n");
                n = a & b;
                n = getBinNumFromDec(n);
                printf("%d\n", n);

                printf("Das Bitmuster von x | y: \n");
                n = a | b;
                n = getBinNumFromDec(n);
                printf("%d\n", n);

                printf("Das Bitmuster von x ^ y: \n");
                n = a ^ b;
                n = getBinNumFromDec(n);
                printf("%d\n", n);

                printf("Um wie viele Positionen soll x geshiftet werden?\n");
                printf("Anzahl: \n");
                scanf("%d", shift);

                printf("Das Bitmuster von x << &d : \n", shift);
                n = a << shift;
                n = getBinNumFromDec(n);
                printf("%d\n", n);

                printf("Das Bitmuster von x >> &d : \n", shift);
                n = b >> shift;
                n = getBinNumFromDec(n);
                printf("%d\n", n);

                break;
            case 3:
                exit(0);
            default:
                printf("Dies ist keine valide Wahl!");
                break;
        }

        printf("\n\nWollen Sie das Programm wiederholen? (j|n)\n");
        scanf(" %c", &run);
    }
}

//Function to convert a decimal number to a binary one
long getBinNumFromDec(n)
{
    long r, binary = 0;
    int temp = 1;

    while (n != 0)
    {
        r = n % 2;
        n = n / 2;
        binary = binary + r*temp;
        temp = temp * 10;
    }

    return binary;
}