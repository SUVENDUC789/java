class Time {
    private int hours;
    private int minutes;
    private int seconds;
  
    public Time(int hours, int minutes, int seconds) {
      this.hours = hours;
      this.minutes = minutes;
      this.seconds = seconds;
    }
  
    public int getHours() {
      return hours;
    }
  
    public int getMinutes() {
      return minutes;
    }
  
    public int getSeconds() {
      return seconds;
    }
  
    public Time add(Time t) {
      Time sum = new Time(0, 0, 0);
      sum.seconds = this.seconds + t.seconds;
      sum.minutes = this.minutes + t.minutes + sum.seconds / 60;
      sum.seconds = sum.seconds % 60;
      sum.hours = this.hours + t.hours + sum.minutes / 60;
      sum.minutes = sum.minutes % 60;
      return sum;
    }
  
    public Time subtract(Time t) {
      Time difference = new Time(0, 0, 0);
      int borrow = 0;
      difference.seconds = this.seconds - t.seconds + borrow;
      if (difference.seconds < 0) {
        borrow = -1;
        difference.seconds += 60;
      } else {
        borrow = 0;
      }
      difference.minutes = this.minutes - t.minutes + borrow;
      if (difference.minutes < 0) {
        borrow = -1;
        difference.minutes += 60;
      } else {
        borrow = 0;
      }
      difference.hours = this.hours - t.hours + borrow;
      return difference;
    }
  }
  