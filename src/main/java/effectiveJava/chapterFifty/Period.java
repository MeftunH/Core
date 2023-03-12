package effectiveJava.chapterFifty;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import java.util.Date;

public final class Period {
    private final Date start;
    private final Date end;
    private final String parameter;

//    public Period(Date start, Date end) {
//        if (start.compareTo(end)>0) {
//            throw new IllegalArgumentException(start+" after "+end);
//        }
//        this.start=start;
//        this.end=end;
//    }
//
//    public Date getStart() {
//        return start;
//    }
//
//    public Date getEnd() {
//        return end;
//    }
    @Override
    public String toString() {
        return "Period{"+
                "start="+start+
                ", end="+end+
                '}';
    }

    //Repaired constructor - makes defensive copies of parameters
    public Period(Date start, Date end, String parameter) {
        this.start=new Date(start.getTime());
        this.end=new Date(end.getTime());
        this.parameter=parameter;
        if (this.start.compareTo(this.end)>0) {
            throw new IllegalArgumentException(start+" after "+end);
        }
    }
    //Repaired accessors - make defensive copies of internal fields
    public Date getStart() {
        return new Date(start.getTime());
    }
    public Date getEnd() {
        return new Date(end.getTime());
    }
}
