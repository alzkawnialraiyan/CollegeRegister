import java.util.Scanner;
class CollegeOfEng{
    String StudentName;
    int StudentID;
    int Phonenumber;
    void registerStudent(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter student name: ");
        StudentName= input.nextLine();
        System.out.println("Enter student ID: ");
        StudentID= input.nextInt();
        System.out.println("Enter phone number: ");
        Phonenumber= input.nextInt();
    }
    void IELTS_Score() // based on score application accepted/rejected
    {
        int IScore;
        int n=0;
        IScore=n;

        Scanner input= new Scanner(System.in);
        System.out.println("Enter student Ielts score: ");
        IScore= input.nextInt();

        if (n<=5) {
            System.out.println("Accepted");
        }
        else {
            System.out.println("Rejected");
        }
    }
    void displayStudentRecords(){
        System.out.println("Student name: "+ StudentName);
        System.out.println("Student ID: "+ StudentID);
        System.out.println("Phone number: "+ Phonenumber);

        System.out.println("  select Department: ");
        System.out.println("   \n 1.Department of Electrical and computer Engineering");
        System.out.println("   \n 2.Department of Mechanical Engineering ");
    }
}
class Dept_ElectricalAndComputer extends CollegeOfEng{
    String Programs;
    int lvl;
    int choice;
    void readPrograms(){
        Scanner input= new Scanner(System.in);
        System.out.println("Select a program.");

        System.out.println("1.Computer Engineering");
        System.out.println("2.Electrical Power Engineering");
        System.out.println("3.Electronics and Communications Engineering");

        switch (choice)
        {
            case (1):
                System.out.println("Computer Engineering");
                break;
            case (2):
                System.out.println("Electrical Power Engineering");
                break;
            case (3):
                System.out.println("Electronics and Communications Engineering");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
    void entry_Level(){
        int  credits;
        String level;

        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter credits: ");
        credits = obj2.nextInt();

        switch(credits){

            case 0:
                level="Entry to Level 1";
                break;
            case 34:
                level="Entry to Level 2";
                break;
            case 67:
                level="Entry to Level 3";
                break;
            case 103:
                level="Entry to Level 4";
                break;
            default:
                level="Invalid Number of credits";
        }
        System.out.println(level);
    }
}
class Dept_Mechanical extends CollegeOfEng{
    String Programs;
    int lvl;
    int choice;
    void readPrograms(){
        Scanner input= new Scanner(System.in);
        System.out.println("Select a program.");
        System.out.println("1.Chemical Engineering");
        System.out.println("2.Civil Engineering");

        switch (choice)
        {
            case '1':
                System.out.println("Chemical Engineering");
                break;
            case '2':
                System.out.println("Civil Engineering");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
    void entry_Level(){
        int  credits;
        String level;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter credits: ");
        credits = obj.nextInt();

        switch(credits){
            case 0:
                level="Entry to Level 1";
                break;
            case 34:
                level="Entry to Level 2";
                break;
            case 67:
                level="Entry to Level 3";
                break;
            case 103:
                level="Entry to Level 4";
                break;
            default:
                level="Invalid Number of credits";
        }
        System.out.println(level);
    }
}

class compEngineerResult extends Dept_ElectricalAndComputer{
    int CGPA;
    int concentration;
    void dispConcentration(){
        String con;

        Scanner readInput = new Scanner(System.in);
        System.out.println(" Select concentrations:"
                +"\n 1.Networking"
                +"\n 2.Software Development");
        concentration=readInput.nextInt();

        switch(concentration){

            case 1:
                System.out.println("The concentration is Networking");
                break;
            case 2:
                System.out.println("The concentration is Software Development");
                break;
            default:
                System.out.println("Invalid selection");
        }
    }
    public void dispDivision(){
        double cgpa;
        Scanner data = new Scanner(System.in);
        System.out.println("Enter CGPA: " );
        cgpa =data.nextDouble();


        int gpa = ( cgpa>=3.75 ) && ( cgpa<=4.00 ) ? 1: -1;
        gpa = ( cgpa>=3.30 )&&( cgpa<=3.74 ) ? 2: gpa;
        gpa = (cgpa>=2.75 )&&(cgpa<=3.29) ? 3: gpa;
        gpa = (cgpa<2.75) ? 4: gpa;

        String degree;
        switch (gpa) {
            case 1 :
                degree="Distinction with Honours";
                break;
            case 2 :
                degree="Distinction";
                break;
            case 3 :
                degree="Merit";
                break;
            case 4 :
                degree="Not classified";
                break;
            default:
                degree="Invalid";
                break;
        }
        System.out.println("Cgpa: " + cgpa + " - " + degree);
    }
}

class result{
    public static void main(String [] args){
        int depart;

        CollegeOfEng obj = new CollegeOfEng();
        obj.registerStudent();
        obj.IELTS_Score();
        obj.displayStudentRecords();

        Scanner dept = new Scanner(System.in);
        depart = dept.nextInt();

        if (depart==1){
            System.out.println("Electrical and Computer Department is selected");
            if(depart==1){
                Dept_ElectricalAndComputer obj1 = new Dept_ElectricalAndComputer();
                obj1.readPrograms();
            }
            int progr;
            Scanner pro = new Scanner(System.in);
            progr = dept.nextInt();

//            if (progr==1){
//                System.out.println("Computer Engineering is selected");
//            }

            if (progr==1){
                System.out.println("Computer Engineering is selected");
                compEngineerResult obj3 = new compEngineerResult();
                obj3.entry_Level();
                obj3.dispConcentration();
                obj3.dispDivision();
            }
            else if (progr==2){
                System.out.println("Electrical power Engineering is selected");
            }
            else /*(progr==3)*/{
                System.out.println("communication Engineering is selected");
            }
//            if (depart==2){
//                System.out.println("Mechanical Department is selected");
//            }

            if(depart==2){
                System.out.println("Mechanical Department is selected");
                Dept_Mechanical obj2 = new Dept_Mechanical();
                obj2.readPrograms();
                obj2.entry_Level();
            }
            int progrm;
            Scanner prog = new Scanner(System.in);
            progrm = dept.nextInt();

            if (progrm==1){
                System.out.println("Chemical Engineering is selected");
            }
            if (progrm==2){
                System.out.println("Civil Engineering  is selected");

            }
        }
    }
}
