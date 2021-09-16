#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdbool.h>

struct time{
    int hour;
    int min;
    int sec;
};

void timeDifference(struct time startTime, struct time endTime, struct time *diffTime);

int main()
{
    char operator[3];
    double firstInput, secondInput;

    char firstInputArray[50];
    char secondInputArray[50];
    bool run = true;

    struct time startTime, endTime, diffTime;

    while (run)
    {
        printf("Folgende Operatoren stehen zur Auswahl:\n");
        printf("Addition (+)\nSubtraktion (-)\nMultiplikation (*)\nDivision (/)\nModulo (%%)\nString Vergleich (v)\nString Addition (a)\nString Subtraktion (s)\nZeit Addition (T+)\nZeit Subtraktion (T-)\nBeenden (e)\n");
        printf("Ihre Wahl: ");
        fflush(stdin);
        scanf("%s", &operator[0]);

        if (operator[0] == 'e')
        {
            exit(0);
        }
        else if (operator[0] == '+' || operator[0] == '-' || operator[0] == '*' || operator[0] == '/' || operator[0] == '%')
        {
            printf("Geben Sie 2 Zahlen ein: ");
            printf("Erste Zahl:");
            scanf("%lf", &firstInput);
            printf("Zweite Zahl:");
            scanf("%lf", &secondInput);

            switch (operator[0])
            {
                case '+':
                    printf("%.1lf + %.1lf = %.1lf\n", firstInput, secondInput, firstInput + secondInput);
                    break;
                case '-':
                    printf("%.1lf - %.1lf = %.1lf\n", firstInput, secondInput, firstInput - secondInput);
                    break;
                case '*':
                    printf("%.1lf * %.1lf = %.1lf\n", firstInput, secondInput, firstInput * secondInput);
                    break;
                case '/':
                    if (secondInput == 0)
                    {
                        printf("Null Division!!!");
                    }
                    else
                    {
                        printf("%.1lf / %.1lf = %.1lf\n", firstInput, secondInput, firstInput / secondInput);
                        break;
                    }
                case '%':
                    printf("%d %% %d = %d\n", (int)firstInput, (int)secondInput, (int)firstInput % (int)secondInput);
                    break;
                default:
                    printf("Error! Dies ist kein valider Operator!\n");
            }
        }
        else if (operator[0] == 'v' || operator[0] == 'a' || operator[0] == 's' || operator[0] == 'T')
        {
            switch (operator[0])
            {
                case 'v':
                    printf("Geben Sie den ersten String ein: ");
                    scanf("%s", firstInputArray);
                    printf("Geben Sie den zweiten String ein: ");
                    scanf("%s", secondInputArray);

                    printf("Unterschied String1 und String2: %d\n", strcmp(firstInputArray, secondInputArray));
                    break;
                case 'a':
                    printf("Geben Sie den ersten String ein: ");
                    scanf("%s", firstInputArray);
                    printf("Geben Sie den zweiten String ein: ");
                    scanf("%s", secondInputArray);

                    printf("Addition String1 und String2: %s\n", strcat(firstInputArray, secondInputArray));
                    break;
                case 's':
                    printf("Geben Sie den ersten String ein: ");
                    scanf("%s", firstInputArray);
                    printf("Geben Sie den zweiten String ein: ");
                    scanf("%s", secondInputArray);

                    printf("Subtraktion String1 und String2: %d\n", strcmp(firstInputArray, secondInputArray));
                    break;
                case 'T':
                    if (operator[1] == '+') //Time Addition
                    {
                        printf("Enter first time:");
                        scanf("%d:%d:%d", &startTime.hour, &startTime.min, &startTime.sec);
                        printf("Enter second time:");
                        scanf("%d:%d:%d", &endTime.hour, &endTime.min, &endTime.sec);
                        diffTime.hour = startTime.hour + endTime.hour;
                        diffTime.min = startTime.min + endTime.min;
                        diffTime.sec = startTime.sec + endTime.sec;
                        if (diffTime.sec > 59)
                        {
                            diffTime.min++;
                            diffTime.sec= diffTime.sec - 60;
                        }
                        else if(diffTime.min > 59)
                        {
                            diffTime.hour++;
                            diffTime.min= diffTime.min - 60;
                        }
                        printf("%d:%d:%d", diffTime.hour, diffTime.min, diffTime.sec);
                        break;
                    }
                    else if (operator[1] == '-') //Time Subtraktion
                    {
                        printf("Enter first time:\n");
                        scanf("%d:%d:%d", &startTime.hour, &startTime.min, &startTime.sec);
                        printf("Enter second time:\n");
                        scanf("%d:%d:%d", &endTime.hour, &endTime.min, &endTime.sec);

                        timeDifference(startTime, endTime, &diffTime);

                        printf("%d:%d:%d\n", diffTime.hour, diffTime.min, diffTime.sec);
                        break;
                    }
                    else
                        {
                            printf("Bitte geben Sie + um Zeit Addition zu machen oder - um eine Zeit Subtraktion zu machen ein!\n");
                            break;
                        }
                default:
                    printf("Error! Dies ist kein valider Operator!\n");
            }
        }
        else
            {
                run = false;
            }
    }
    //Zum Beenden des Programms:
    exit(0);
}

void timeDifference(struct time startTime, struct time endTime, struct time *diffTime)
{
    if(endTime.sec > startTime.sec)
    {
        --startTime.min;
        startTime.sec += 60;
    }
    diffTime->sec = startTime.sec - endTime.sec;

    if(endTime.min > startTime.min)
    {
        --startTime.hour;
        startTime.min += 60;
    }
    diffTime->min = startTime.min - endTime.min;
    diffTime->hour = startTime.hour - endTime.hour;
}