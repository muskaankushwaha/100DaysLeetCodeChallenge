class Solution {
    public double angleClock(int hour, int minutes) {
     double angle= 30*hour-5.5*minutes;
     if(angle<0){
        if(angle>-180)return -angle;
        return 360+angle;
     }
     else if(angle>0&&angle<180)return angle;
     else return 360-angle;
    }
}