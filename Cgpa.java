import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cgpa {

        public Cgpa() {
        }

        public static void cgpa() {
            List<Integer> course_score_equivalence = new ArrayList();
            parameter2 new_parmeter = new parameter2();

            try {
                new_parmeter.student_personal_info();
                new_parmeter.course_info();
                Iterator var2 = new_parmeter.course_unit_finalyear.iterator();

                int item;
                while(var2.hasNext()) {
                    item = (Integer)var2.next();
                    new_parmeter.course_unit.add(item);
                }

                var2 = new_parmeter.course_score_finalyear.iterator();

                while(var2.hasNext()) {
                    item = (Integer)var2.next();
                    new_parmeter.course_score.add(item);
                }

                System.out.println(new_parmeter.course_score);
                System.out.println(new_parmeter.course_unit);
                int totalcourse_num = new_parmeter.coursenum + new_parmeter.coursenumfinalyear;
                Iterator var11 = new_parmeter.course_score.iterator();

                while(true) {
                    while(var11.hasNext()) {
                        int element = (Integer)var11.next();
                        if (element > 70) {
                            course_score_equivalence.add(4);
                        } else if (element <= 70 && element >= 50) {
                            course_score_equivalence.add(3);
                        } else if (element < 50 && element >= 40) {
                            course_score_equivalence.add(2);
                        } else if (element < 40 && element >= 30) {
                            course_score_equivalence.add(1);
                        } else if (element < 30) {
                            course_score_equivalence.add(0);
                        }
                    }

                    double total_unit = 0.0;
                    double total_point = 0.0;

                    for(int j = 0; j < totalcourse_num; ++j) {
                        total_unit += (double)(Integer)new_parmeter.course_unit.get(j);
                        total_point += (double)((Integer)course_score_equivalence.get(j) * (Integer)new_parmeter.course_unit.get(j));
                    }

                    System.out.println("Total point =  " + total_point);
                    System.out.println("Total unit= " + total_unit);
                    double The_cgpa = total_point / total_unit;
                    System.out.println("CGPA =   " + The_cgpa);
                    break;
                }
            } catch (Exception var9) {
                System.out.println(var9.getMessage());
            }

        }
    }

