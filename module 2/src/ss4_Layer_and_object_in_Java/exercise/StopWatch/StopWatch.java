package ss4_Layer_and_object_in_Java.exercise.StopWatch;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    };

    public void end(){
        this.endTime = System.currentTimeMillis();
    }
    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime - startTime;
    }
}
