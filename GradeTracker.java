void main() {
    Scanner input = new Scanner(System.in);
    int assignmentscore, examscore, choose, totalasspoints = 0, totalexpoints = 0, assignmentcounter = 0, examcounter = 0, nextaction = 0;
    double overallAv, assignmentAv, examAv, newexamAV = 0, newassAV = 0;
    while (nextaction != 4) {
        System.out.println("");
        System.out.println("==== SEMESTER GRADE TRACKER ====");
        System.out.println("1. Add assignment result");
        System.out.println("2. Add exam result");
        System.out.println("3. View current grade");
        System.out.println("4. Exit");
        System.out.println("");
        System.out.print("Choose an option: ");
        switch (nextaction = input.nextInt()) {
            case 1:
                System.out.print("Enter assignment score: ");
                assignmentscore = input.nextInt();
                if (assignmentscore >= 0 && assignmentscore <= 100) {
                    System.out.println("Assignment score added");
                    totalasspoints += assignmentscore;
                    assignmentcounter++;
                } else {
                    System.out.println("Invalid score. Enter a value from 0 to 100");
                }
                break;
            case 2:
                System.out.print("Enter exam score: ");
                examscore = input.nextInt();
                if (examscore >= 0 && examscore <= 100) {
                    System.out.println("Exam score added");
                    totalexpoints += examscore;
                    examcounter++;
                } else {
                    System.out.println("Invalid score. Enter a value from 0 to 100");
                }
                break;
            case 3:
                if (assignmentcounter == 0 && examcounter == 0) {
                    System.out.println("No results available yet.");
                    break;
                }
                if (assignmentcounter > 0 && examcounter == 0) {
                    assignmentAv = totalasspoints / assignmentcounter;
                    newassAV = assignmentAv;
                    System.out.println("");
                    System.out.println("==== CURRENT RESULTS ====");
                    System.out.println("");
                    System.out.println("Assignments completed: " + assignmentcounter);
                    System.out.println("Assignments average: " + assignmentAv);
                    System.out.println("");
                    System.out.println("Assignments ONLY overall: " + newassAV);
                    if (newassAV >= 90 && newassAV <= 100) {
                        System.out.println("Grade: A");
                    } else if (newassAV >= 80 && newassAV <= 89.99) {
                        System.out.println("Grade: B");
                    } else if (newassAV >= 70 && newassAV <= 79.99) {
                        System.out.println("Grade: C");
                    } else if (newassAV >= 60 && newassAV <= 69.99) {
                        System.out.println("Grade: D");
                    } else if (newassAV < 60) {
                        System.out.println("Grade: F");
                    } else if (newassAV > 100) {
                        System.out.println("Grade: A+");
                    }
                    if (newassAV >= 60) {
                        System.out.println("Status: Passing");
                    } else {
                        System.out.println("Status: Failing");
                    }
                    break;
                }
                if (assignmentcounter == 0 && examcounter > 0) {
                    examAv = totalexpoints / examcounter;
                    newexamAV = examAv;
                    System.out.println("");
                    System.out.println("==== CURRENT RESULTS ====");
                    System.out.println("");
                    System.out.println("Exams completed: " + examcounter);
                    System.out.println("Exams average: " + examAv);
                    System.out.println("");
                    if ((assignmentcounter == 0 && examcounter > 0)) {
                        System.out.println("Exams ONLY overall: " + newexamAV);
                        if (newexamAV >= 90 && newexamAV <= 100) {
                            System.out.println("Grade: A");
                        } else if (newexamAV >= 80 && newexamAV <= 89.99) {
                            System.out.println("Grade: B");
                        } else if (newexamAV >= 70 && newexamAV <= 79.99) {
                            System.out.println("Grade: C");
                        } else if (newexamAV >= 60 && newexamAV <= 69.99) {
                            System.out.println("Grade: D");
                        } else if (newexamAV < 60) {
                            System.out.println("Grade: F");
                        } else if (newexamAV > 100) {
                            System.out.println("Grade: A+");
                        }
                        if (newexamAV >= 60) {
                            System.out.println("Status: Passing");
                        } else {
                            System.out.println("Status: Failing");
                        }
                        break;
                    }
                }
                if (assignmentcounter > 0 && examcounter > 0) {
                    assignmentAv = totalasspoints / assignmentcounter;
                    examAv = totalexpoints / examcounter;
                    overallAv = assignmentAv * 0.5 + examAv * 0.5;
                    System.out.println("");
                    System.out.println("==== CURRENT RESULTS ====");
                    System.out.println("");
                    System.out.println("Assignments completed: " + assignmentcounter);
                    System.out.println("Assignments average: " + assignmentAv);
                    System.out.println("");
                    System.out.println("Exams completed: " + examcounter);
                    System.out.println("Exams average: " + examAv);
                    System.out.println("");
                    System.out.println("Overall average: " + overallAv);
                    if (overallAv >= 90 && overallAv <= 100) {
                        System.out.println("Grade: A");
                    } else if (overallAv >= 80 && overallAv <= 89.99) {
                        System.out.println("Grade: B");
                    } else if (overallAv >= 70 && overallAv <= 79.99) {
                        System.out.println("Grade: C");
                    } else if (overallAv >= 60 && overallAv <= 69.99) {
                        System.out.println("Grade: D");
                    } else if (overallAv < 60) {
                        System.out.println("Grade: F");
                    } else if (overallAv > 100) {
                        System.out.println("Grade: A+");
                    }
                    if (overallAv >= 60) {
                        System.out.println("Status: Passing");
                    } else {
                        System.out.println("Status: Failing");
                    }
                    break;
                }
            case 4:
                System.out.println("GradeTracker is closed!");
                break;
        }
    }
}