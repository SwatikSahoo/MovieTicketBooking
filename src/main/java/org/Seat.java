package org;

public class Seat {
    int seatId;
    int row;
    SeatCategory seatCat;

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public SeatCategory getSeatCat() {
        return seatCat;
    }

    public void setSeatCat(SeatCategory seatCat) {
        this.seatCat = seatCat;
    }
}
