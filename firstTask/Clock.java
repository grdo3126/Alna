package firstTask;

public class Clock {

    // METHOD COUNTS AN ANGLE BETWEEN STARTING POINT AND THE MINUTES ARROW
    private double countMinutesAngle(int minutes) {
        return 6 * minutes;         // 360 * (minutes / 60)
    }

    // METHOD COUNTS AN ANGLE BETWEEN STARTING POINT AND THE HOURS ARROW
    private double countHoursAngle(int hours) {
        return 30 * hours;         // 360 * (hours / 12)
    }

    // WHAT ANGLE DOES THE HOURS ARROW MOVE PER GIVEN MINUTES
    private double partOfHoursArrow(int minutes) {
        return minutes / 2;        // 30 * (minutes / 60)
    }

    // COUNTING ANGLE BETWEEN ARROWS SUBSTRACTING ANGLES
    protected double countAngleBetweenTwoArrows(int hours, int minutes) {

        double neededAngle;

        if (countMinutesAngle(minutes) > countHoursAngle(hours) + partOfHoursArrow(minutes)) {
            neededAngle = countMinutesAngle(minutes) - countHoursAngle(hours) - partOfHoursArrow(minutes);
        }

        else {
            neededAngle = countHoursAngle(hours) + partOfHoursArrow(minutes) - countMinutesAngle(minutes);
        }

        if (neededAngle > 180) {                    // TO ENSURE THAT WE HAVE SMALLER ANGLE
            neededAngle = 360 - neededAngle;
        }
        return neededAngle;
    }

    protected boolean validation(int hours, int minutes) {

        if (hours >= 0 && hours <= 11 && minutes >= 0 && minutes <= 59) {
            return true;
        } else {
            System.out.println("Wrong parameters!");
            return false;
        }
    }
}
