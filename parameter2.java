import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;





    public class parameter2 {
        String name_of_student;
        String student_department;
        String university;
        int Level;
        int Semester;
        int Levels;
        int coursenumfinalyear;
        int numb_of_course;
        int coursenum;
        int number_of_course;
        List<String> course_name = new ArrayList();
        List<Integer> course_unit = new ArrayList();
        List<Integer> course_unit_finalyear = new ArrayList();
        List<Integer> course_score = new ArrayList();
        List<Integer> course_score_finalyear = new ArrayList();
        Scanner scanner;

        public parameter2() {
            this.scanner = new Scanner(System.in);
        }

        public void student_personal_info() {
            System.out.println("STUDENT NAME:  ");
            Scanner name = new Scanner(System.in);

            try {
                this.name_of_student = name.nextLine();
            } catch (InputMismatchException var7) {
                System.out.println("Invalid input. Field only accept a string.");
                throw new RuntimeException("Invalid input. Please enter an string.");
            }

            System.out.println("STUDENT DEPARTMENT:  ");

            try {
                this.student_department = name.nextLine();
            } catch (InputMismatchException var6) {
                System.out.println("Invalid input. Please enter a string.");
                throw new RuntimeException("Invalid input. Please enter an string.");
            }

            System.out.println("NAME OF UNIVERSITY:  ");

            try {
                this.university = name.nextLine();
            } catch (InputMismatchException var5) {
                System.out.println("Invalid input. Please enter a string.");
                throw new RuntimeException("Invalid input. Please enter an string.");
            }

            System.out.println("CURRENT LEVEL(100,200,...):  ");

            try {
                this.Levels = name.nextInt();
                this.Level = this.Levels / 100;
            } catch (InputMismatchException var4) {
                System.out.println("Invalid input. Please enter an integer.");
                throw new RuntimeException("Invalid input. Please enter an integer.");
            }

            System.out.println("CURRENT SEMESTER(1 OR 2):  ");

            try {
                this.Semester = name.nextInt();
            } catch (InputMismatchException var3) {
                System.out.println("Invalid input, please enter an integer");
                throw new RuntimeException("Invalid input. Please enter an integer.");
            }
        }

        public void course_info() {
            int x;
            for(x = 1; x < this.Level; ++x) {
                System.out.println("courses taken in " + x * 100 + "  level");
                System.out.println("Kindly input the number of course you took:  ");

                try {
                    this.numb_of_course = this.scanner.nextInt();
                    this.coursenum += this.numb_of_course;
                } catch (InputMismatchException var15) {
                    System.out.println("Invalid input, please enter an integer");
                    throw new RuntimeException("Invalid input. Please enter an integer.");
                }

                for(int j = 0; j < this.numb_of_course; ++j) {
                    System.out.println("Course name:  ");

                    try {
                        this.course_name.add(this.scanner.nextLine());
                    } catch (InputMismatchException var14) {
                        System.out.println("This field only takes a string");
                        throw new RuntimeException("Invalid input. Please enter an string.");
                    }

                    System.out.println("Course unit:  ");

                    try {
                        this.course_unit.add(this.scanner.nextInt());
                    } catch (InputMismatchException var13) {
                        System.out.println("Invalid input, please enter an integer");
                        throw new RuntimeException("Invalid input. Please enter an integer.");
                    }

                    System.out.println("Score:  ");

                    try {
                        this.course_score.add(this.scanner.nextInt());
                    } catch (InputMismatchException var12) {
                        System.out.println("Invalid input, please enter an integer");
                        throw new RuntimeException("Invalid input. Please enter an integer.");
                    }
                }
            }

            for(x = 0; x < this.Semester; ++x) {
                System.out.println("number of course you are taking in semester " + (x + 1) + " of level " + 100 * this.Level);
                Scanner number = new Scanner(System.in);

                try {
                    this.number_of_course = number.nextInt();
                    this.coursenumfinalyear += this.number_of_course;
                } catch (InputMismatchException var11) {
                    System.out.println("This field takes only an integer");
                    throw new RuntimeException("Invalid input. Please enter an integer.");
                }

                for(int j = 0; j < this.number_of_course; ++j) {
                    System.out.println("Course name:  ");
                    Scanner scanner = new Scanner(System.in);

                    try {
                        this.course_name.add(scanner.nextLine());
                    } catch (InputMismatchException var10) {
                        System.out.println("Please input only string");
                        throw new RuntimeException("Invalid input. Please enter an integer.");
                    }

                    System.out.println("Course unit:  ");
                    Scanner unit = new Scanner(System.in);

                    try {
                        this.course_unit_finalyear.add(unit.nextInt());
                    } catch (InputMismatchException var9) {
                        System.out.println("This field takes only integer");
                        throw new RuntimeException("Invalid input. Please enter an integer.");
                    }

                    System.out.println("Score:  ");
                    Scanner score = new Scanner(System.in);

                    try {
                        this.course_score_finalyear.add(score.nextInt());
                    } catch (InputMismatchException var8) {
                        System.out.println("field takes only int");
                        throw new RuntimeException("Invalid input. Please enter an integer.");
                    }
                }
            }

        }
    }


