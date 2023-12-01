#include <stdio.h> //include is preproceesor command that includes stdio.h file contents
#include <stdlib.h>
#include <time.h>

typedef char enemy[25];

//structs - data structure that can store multiple datatypes
struct Student{
    char name[50];
    char major[50];
    int age;
    double gpa;
};
//by adding typedef at start and name at end we cna use it as nickname without struct keyword when initializing struct
double cube(double num); //function prototype

int main(){
    printf("I love pizza\n");
    printf("| - - |\n");
    printf("| - - |\n");
    printf("| - - |\n");

    //data types
    int score = 12;
    char playerName[] = "adam";
    double gpa = 3.8;
    float cgpa = 8.85f;
    char grade = 'A';

    //format specifier = %something    
    printf("%s score is %d\n", playerName, score);
    printf("%f\n",cgpa);
    printf("%lf\n",gpa);
    printf("%c\n", grade);

    //math = +, -, *, /, %
    printf("%f\n", pow(2,4)); //sqrt, ceil, floor
    /*multi line comment*/

    //consts
    const int NUM1 = 5;
    float const NUM2 = 3;

    //user input
    int age;
    printf("Enter your age: ");
    scanf("%d", &age); //for double it is %lf but in printf its %c
    printf("You are %d years old\n", age);

    char name[20];
    printf("Enter your name: ");
    scanf("%s", &name); //it can get a single word only
    printf("You are %s\n", name);

    char fullName[20];
    printf("Enter your full name: ");
    fgets(fullName, 20, stdin); //also records newline when enter is pressed, scanf does this too
    printf("You are %s\n", fullName);

    char celebrityF[20];
    char celebrityL[20];
    printf("Who is your favourite celebrity: ");
    scanf("%s%s", celebrityF, celebrityL);
    printf("I love %s %s\n", celebrityF, celebrityL);

    //arrays
    int scores[] = {1,2,3,4,5};
    printf("%d\n",scores[0]);

    greet("mike");
    printf('Ans: %f', cube(7.0));

    /*
    if(){
    }else if{
    }else{
    }

    switch(something){ //only int,char and enum
        case something:
            do something;
            break;    
        case something:
            do something;
            break;
        default:
            do something

    }
    */

    struct Student s1;
    s1.age = 22;
    s1.gpa = 4.2;
    strcpy(s1.name, "Jim");
    strcpy(s1.major, "MBA");

    /*
        while(condition){

        }
        do{

        }while(condition)

        for(int i=0; i<=n; i++){

        }
    */

    //2d arrays
    int digits[2][2] = {{1,2}, {2,3}};
    //nested loops

    //memory addresses
    int sample = 34;
    printf("%p", &sample); //print memory address of sample using refernce operator

    //pointers - var storing memory address of another var as its value
    int *pSample = &sample;

    //dereferncing - go to memory address and get the value stored there
    printf("%p", pSample);
    printf("%d", *pSample);
    printf("%d", *&sample);

    //writing/append files
    FILE *fpointer = fopen("players.txt", "w"); //r,w,a file modes
    fprintf(fpointer, "sally, engineer\n, walter, chemist\n");//write data to file or append it
    fclose(fpointer);//save and clear memory

    //reading files
    char line[255];
    FILE *fpointer = fopen("players.txt", "r");
    fgets(line, 255, fpointer);
    fclose(fpointer);

    //typedef - reserve keyword that gives a existing datatype a nickname
    enemy en1 = "richard";

    /*
        for(int i=0; i<sizeof(array)/sizeof(array[0]); i++){}
        printf - '%f.2', %-12s
    */

   //enum - user defiened type of named integer identifiers helps to make program more readable
   //can delcare anywhere
    enum Day{Sun = 1, Mon = 2, Tue = 3, Wed = 4, Thu = 5, Fri = 6, Sat = 7};
    enum Day today = Sun; //enum values are treated as int not strings

    //psuedo random nums
    srand(time(0));

    int rn1 = rand() % 6 + 1;

    return 0;
}

void greet(char name[]){
    printf("Hello %s\n", name);
}

double cube(double num){
    return num*num*num;
}
