#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/**
 * author: David Wandratsch, 3BHIT
 * date: 18.03.2021
 */

int main()
{
    int randomNumber, guess, guessAttempts = 0;
    int upperBound = 100;
    srand ((unsigned int)time(NULL));
    randomNumber = 1 + rand() % upperBound;

    printf("You have 10 guesses!\n");
    printf("To guess enter a random Number between 1 and %d: ", upperBound);

    do
        {
        if (guessAttempts >= 10)
        {
            printf("================== Game over! ==================");
            printf("\nYou ran out of guesses!\n");
            break;
        }

        scanf("%d", &guess);

        if (guess > randomNumber)
        {
            printf("Please try it with a LOWER Number!\n");
            guessAttempts++;
        }
        else if (randomNumber > guess)
        {
            printf("Please try it with a HIGHER Number!\n");
            guessAttempts++;
        }
        else
            {
                printf("================== You won! ==================\n");
                printf("You guessed the random Number in %d attempts!\n", guessAttempts);
                printf("The random Number was: %d!", randomNumber);
            }
    }
    while (guess != randomNumber);
}