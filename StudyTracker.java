void main() {
    Scanner input = new Scanner(System.in);
    int weeklyGoal = 600, choose, totaltime1, studysession = 0;
    int programming = 0, mathematics = 0, english = 0, other = 0, nextaction = 0;
    int totaltime = other + programming + mathematics + english;
    while (nextaction != 4) {
        System.out.println("");
        System.out.println("==== STUDY TRACKER ====");
        System.out.println("1. Add study session");
        System.out.println("2. View statistics");
        System.out.println("3. Check weekly goal");
        System.out.println("4. Exit");
        System.out.println("");
        System.out.print("Choose an option: ");
        switch (nextaction = input.nextInt()) {
            case 1:
                System.out.println("");
                System.out.println("Choose a subject:");
                System.out.println("1. Programming");
                System.out.println("2. Mathematics");
                System.out.println("3. English");
                System.out.println("4. Other");
                System.out.println("");
                System.out.print("Choose an option: ");
                choose = input.nextInt();
                System.out.println("\n");
                if (choose == 1) {
                    System.out.print("Study time in minutes: ");
                    totaltime1 = input.nextInt();
                    if(totaltime1<=0) {
                        System.out.println("Error!");
                        break;
                    }
                    programming += totaltime1;
                    totaltime += totaltime1;
                    System.out.println("Study session added!");
                    studysession++;
                    System.out.println("Current total study time: " + totaltime + "\n");
                } else if (choose == 2) {
                    System.out.print("Study time in minutes: ");
                    totaltime1 = input.nextInt();
                    if(totaltime1<=0) {
                        System.out.println("Error!");
                        break;
                    }
                    mathematics += totaltime1;
                    totaltime += totaltime1;
                    System.out.println("Study session added!");
                    studysession++;
                    System.out.println("Current total study time: " + totaltime + "\n");
                } else if (choose == 3) {
                    System.out.print("Study time in minutes: ");
                    totaltime1 = input.nextInt();
                    if(totaltime1<=0) {
                        System.out.println("Error!");
                        break;
                    }
                    english += totaltime1;
                    totaltime += totaltime1;
                    System.out.println("Study session added!");
                    studysession++;
                    System.out.println("Current total study time: " + totaltime);
                } else if (choose == 4) {
                    System.out.print("Study time in minutes: ");
                    totaltime1 = input.nextInt();
                    if(totaltime1<=0) {
                        System.out.println("Error!");
                        break;
                    }
                    totaltime += totaltime1;
                    other += totaltime1;
                    System.out.println("Study session added!");
                    studysession++;
                    System.out.println("Current total study time: " + totaltime);
                } else {
                    System.out.println("Error!");
                    break;
                }
                break;
            case 2:
                System.out.println("===== WEEKLY STATISTICS =====");
                System.out.println("Study sessions: " + studysession);
                System.out.println("Total study time: " + totaltime);
                System.out.println("");
                System.out.println("Programming: " + programming + " minutes");
                System.out.println("Mathematics: " + mathematics + " minutes");
                System.out.println("English: " + english + " minutes");
                System.out.println("Other: " + other + " minutes");
                break;
            case 3:
                System.out.println("Weekly goal: " + weeklyGoal + " minutes");
                System.out.println("You studied: " + totaltime + " minutes");
                System.out.println("Remaining: " + (weeklyGoal - totaltime) + " minutes");
                if (weeklyGoal <= totaltime) {
                    System.out.println("Weekly goal achieved!!");
                }
                break;
            case 4:
                System.out.println("Study tracker closed. Keep up the good work!");
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }
}