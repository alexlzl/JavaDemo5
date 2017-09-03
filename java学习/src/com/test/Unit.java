package com.test;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/8 下午5:24
 */

import java.util.Arrays;

public class Unit {
    private short ashort;
    private char achar;
    private byte abyte;
    private boolean abool;
    private long along;
    private float afloat;
    private double adouble;
    private Unit aObject;
    private int[] ints;
    private Unit[] units;

    public boolean equals(Object o) {
        if (!(o instanceof Unit))
            return false;
        Unit unit = (Unit) o;
        return unit.ashort == ashort
                && unit.achar == achar
                && unit.abyte == abyte
                && unit.abool == abool
                && unit.along == along
                && Float.floatToIntBits(unit.afloat) == Float
                .floatToIntBits(afloat)
                && Double.doubleToLongBits(unit.adouble) == Double
                .doubleToLongBits(adouble)
                && unit.aObject.equals(aObject)
                && equalsInts(unit.ints)
                && equalsUnits(unit.units);
    }

    private boolean equalsInts(int[] aints) {
        return Arrays.equals(ints, aints);
    }

    private boolean equalsUnits(Unit[] aUnits) {
        return Arrays.equals(units, aUnits);
    }

    public int hashCode() {
        int result = 17;
        result = 37 * result + (int) ashort;
        result = 37 * result + (int) achar;
        result = 37 * result + (int) abyte;
        result = 37 * result + (abool ? 0 : 1);
        result = 37 * result + (int) (along ^ (along >>> 32));
        result = 37 * result + Float.floatToIntBits(afloat);
        long tolong = Double.doubleToLongBits(adouble);
        result = 37 * result + (int) (tolong ^ (tolong >>> 32));
        result = 37 * result + aObject.hashCode();
        result = 37 * result + intsHashCode(ints);
        result = 37 * result + unitsHashCode(units);
        return result;
    }

    private int intsHashCode(int[] aints) {
        int result = 17;
        for (int i = 0; i < aints.length; i++)
            result = 37 * result + aints[i];
        return result;
    }

    private int unitsHashCode(Unit[] aUnits) {
        int result = 17;
        for (int i = 0; i < aUnits.length; i++)
            result = 37 * result + aUnits[i].hashCode();
        return result;
    }
}