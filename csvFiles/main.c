//***********************************************************************
//
//                  H T L - W E L S   /   Klasse 3BHIT
//
//-----------------------------------------------------------------------
// Programm         : CSV - Files
//
// Ersteller        : David Wandratsch
//
// Erstelldatum     : 2021-05-20
//
// Abgabedatum      : 2021-05-25
//
// Kurzbeschreibung : Arbeiten mit CSV - Dateien
//
// GitHub Repository: https://github.com/WandratschDavid/csvFiles
//***********************************************************************

// Including libraries
#include <stdio.h>
#include <string.h>
#include <mm_malloc.h>

// defining structs
struct student
{
	char* catNum;
	char* firstName;
	char* surName;
	int grade;
	
	struct student* next;
};

// defining global variables
struct student* head = NULL;
struct student* cursor = NULL;

// implementing functions

//********************************************************************
// Funktion        : insertStudent
//
// Kurzbeschreibung: inserts a new student at the end of the file
//--------------------------------------------------------------------
// Parameter       :
//    1   catNum       char*       hands over the catalog number
//    2   surName      char*       hands over the surName
//    3   firstName    char*       hands over the firstName
//********************************************************************
void insertStudent(char* catNum, char* surName, char* firstName)
{
    struct student* student = malloc(sizeof(struct student));
    student->catNum = strdup(catNum);
    student->surName = strdup(surName);
    student->firstName = strdup(firstName);
    student->grade = 0;

    if (head == NULL)
    {
        student->next = NULL;
        head = student;
        cursor = student;
    }
    else
    {
        struct student origin = *cursor;
        cursor->next = student;
        student->next = origin.next;
        cursor = student;
    }
}

//*************************************************************************
// Funktion        : readFile
//
// Kurzbeschreibung: reads in the whole file
//-------------------------------------------------------------------------
// Parameter       :
//    1   filename     char*       contains the filepath of the input file
//*************************************************************************
void readFile(char* filename)
{
    FILE* fp = fopen(filename, "r");
    char curLine[125];
    char* data;
    char* catNum;
	char* surName;
	char* firstName;
    
    int counter, index = 0;

    if (fp == NULL)
	{
        printf("\nFile does not exist or you dont have permissions to open it!\n");
        return;
    }
	else
	{
		while (fgets(curLine, 125, fp) != NULL)
		{
			data = strtok(curLine, ";");

			while (data != NULL) 
			{
				switch (index) 
				{
					case 0:
						catNum = data;
						break;
					case 1:
						surName = data;
						break;
					case 2:
						firstName = strtok(data, "\n");
						break;
					default:
						break;
				}

				data = strtok(NULL, ";");
				index++;
			}

            insertStudent(catNum, surName, firstName);
			index = 0;
			counter++;
		}
	}
    fclose(fp);
}

//********************************************************************
// Funktion        : gradeStudent
//
// Kurzbeschreibung: function to grade all the students
//********************************************************************
void gradeStudent()
{
    cursor = head;
    int gradeInput;

    printf("\nPlease enter a grade for every student!\n");

    while (cursor != NULL) 
	{
        printf("\n%s %s %s\nNote:", cursor->catNum, cursor->surName, cursor->firstName);
        scanf("%d", &gradeInput);

        if (gradeInput > 0 && gradeInput < 6)
		{
            cursor->grade = gradeInput;
            cursor = cursor->next;
        }
        else
		{
			printf("Please only enter a grade between 1 and 5!\n");
		}
    }
    printf("\nGrading completed successfully!\n");
}

//********************************************************************
// Funktion        : writeToFile
//
// Kurzbeschreibung: writes all the students to a new output - file
//--------------------------------------------------------------------
// Parameter       :
//    1   filename     char*       contains the desired filename
//********************************************************************
void writeToFile(char* filename) 
{
    FILE *file = fopen(filename, "w");
    cursor = head;

    while (cursor != NULL)
	{
        fprintf(file, "%s;%s;%s;%d\n", cursor->catNum, cursor->surName, cursor->firstName, cursor->grade);
        cursor = cursor->next;
    }

    fclose(file);

    printf("\nFile created and written to successfully!\n");
}

// main program
int main()
{
    char filepath[60] = "D:\\Schuljahr 2020_21\\SEW\\Exercises\\csvFiles\\files\\3bhit.csv";
	char folderPath[50] = "D:\\Schuljahr 2020_21\\SEW\\Exercises\\csvFiles\\files\\";
    char outputFileName[40];

    readFile(filepath);
    gradeStudent();

    printf("\nPlease enter your desired name of the output - file (dont forget the fileextension .csv)!\n");
    scanf("%s", outputFileName);
    
	strcat(folderPath, outputFileName);
    writeToFile(outputFileName);
}