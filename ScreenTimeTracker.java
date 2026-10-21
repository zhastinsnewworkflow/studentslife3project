void main() {
    Scanner input = new Scanner(System.in);
    int socialmediatime = 0, gamingtime = 0, studyingtime = 0, videoorstreamingtime = 0, totalvideoorstreamingtime = 0, totalstudyingtime = 0, totalgamingtime = 0, totalsmtime = 0, totalexpoints = 0, recordedsessions = 0, totaltime = 0, nextaction = 0, entertainingTime, productiveTime = 0;
    while (nextaction != 6) {
        System.out.println("");
        System.out.println("==== SEMESTER GRADE TRACKER ====");
        System.out.println("");
        System.out.println("1. Add social media time");
        System.out.println("2. Add gaming time");
        System.out.println("3. Add studying time");
        System.out.println("4. Add video or streaming time");
        System.out.println("5. View statistics");
        System.out.println("6. Exit");
        System.out.println("");
        System.out.print("Choose an option: ");
        switch (nextaction = input.nextInt()) {
            case 1:
                System.out.print("Add social media time: ");
                socialmediatime = input.nextInt();
                if (socialmediatime > 0) {
                    System.out.println("Time added successfully.");
                    totalsmtime += socialmediatime;
                    totaltime += socialmediatime;
                    recordedsessions++;
                } else {
                    System.out.println("Invalid score. Enter a value greater than 0.");
                }
                break;
            case 2:
                System.out.print("Add gaming time: ");
                gamingtime = input.nextInt();
                if (gamingtime > 0) {
                    System.out.println("Time added successfully.");
                    totalgamingtime += gamingtime;
                    totaltime += gamingtime;
                    recordedsessions++;
                } else {
                    System.out.println("Invalid score. Enter a value greater than 0.");
                }
                break;
            case 3:
                System.out.print("Add studying time: ");
                studyingtime = input.nextInt();
                if (studyingtime > 0) {
                    System.out.println("Time added successfully.");
                    totalstudyingtime += studyingtime;
                    totaltime += studyingtime;
                    recordedsessions++;
                } else {
                    System.out.println("Invalid score. Enter a value greater than 0.");
                }
                break;
            case 4:
                System.out.print("Add video or streaming time: ");
                videoorstreamingtime = input.nextInt();
                if (videoorstreamingtime > 0) {
                    System.out.println("Time added successfully.");
                    totalvideoorstreamingtime += videoorstreamingtime;
                    totaltime += videoorstreamingtime;
                    recordedsessions++;
                } else {
                    System.out.println("Invalid score. Enter a value greater than 0.");
                }
                break;
            case 5:
                entertainingTime = totalsmtime + totalgamingtime + totalvideoorstreamingtime;
                productiveTime = totalstudyingtime;
                System.out.println("");
                System.out.println("===== TODAY'S SCREEN TIME =====");
                System.out.println("");
                System.out.println("Social media: " + totalsmtime + " minutes");
                System.out.println("Gaming: " + totalgamingtime + " minutes");
                System.out.println("Studying time: " + totalstudyingtime + " minutes");
                System.out.println("Streaimng: " + totalvideoorstreamingtime + " minutes");
                System.out.println("");
                System.out.println("Total screen time: " + totaltime + " minutes");
                System.out.println("Recorded sessions: " + recordedsessions);
                if (entertainingTime < productiveTime) {
                    System.out.println("Study screen time is greater than entertainment screen time. Good balance!");
                } else if (entertainingTime > productiveTime) {
                    System.out.println("Entertainment screen time is greater than study time.");
                } else if (entertainingTime == productiveTime) {
                    System.out.println("Study and entertainment screen time are equal.");
                }
                if (totaltime < 120) {
                    System.out.println("Low screen time");
                } else if (totaltime >= 120 && totaltime <= 240) {
                    System.out.println("Moderate screen time");
                } else if (totaltime > 240) {
                    System.out.println("High screen time");
                }
                break;
            case 6:
                System.out.print("Screen-time tracker closed");
                break;
            default:
                System.out.println("Error!");
        }
    }
}