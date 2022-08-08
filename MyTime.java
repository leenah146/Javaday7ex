public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {

        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("invalid hour");
        }
    }


        public void setMinute ( int minute){

            if (minute >= 0 && minute <= 59) {
                this.minute = minute;
            } else {
                throw new IllegalArgumentException("invalid minute");
            }

        }


        public void setSecond ( int second){
            if (second >= 0 && second <= 59) {
                this.second = second;
            } else {
                throw new IllegalArgumentException("invalid seconds");
            }

        }

//    public String toString(){
//        return String.format("%02d:%02d:%02d",hour,minute,second);
//    }

        @Override
        public String toString () {
            String leadingHour = String.format("%02d", hour);
            String leadingMinute = String.format(":%02d", minute);
            String leadingSecond = String.format(":%02d", second);
            return leadingHour + leadingMinute + leadingSecond;
        }

        public MyTime nextSecond () {

            if (second == 59) {
                this.second = 0;
                nextMinute();
            } else {
                this.second++;
            }
            return this;

        }
        public MyTime nextMinute () {

            if (minute == 59) {
                this.minute = 0;
                nextHour();
            } else {
                this.minute++;
            }
            return this;

        }
        public MyTime nextHour () {

            if (hour == 23) {
                this.hour = 0;
                this.minute = 0;
                this.second = 0;

            } else {
                this.hour++;
            }

            return this;

        }
        public MyTime PreviousSecond () {
            second--;
            if (second == 0) {
                second = 0;
                minute--;
            }
            if (minute == 0) {
                minute = 0;
                hour--;
            }
            if (hour == 0) {
                hour = 0;
            }
            return this;
        }


    }
