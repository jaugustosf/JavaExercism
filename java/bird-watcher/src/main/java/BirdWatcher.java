import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay.clone();
    }

    public int getToday() {
        if(birdsPerDay.length == 0) return 0;
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay).anyMatch(equalsZero -> equalsZero == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sumOfBirds = 0;
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            sumOfBirds += birdsPerDay[i];
        }
        return sumOfBirds;
    }

    public int getBusyDays() {
        return (int) Arrays.stream(birdsPerDay).filter(busyDay -> busyDay >= 5).count();
    }
}
