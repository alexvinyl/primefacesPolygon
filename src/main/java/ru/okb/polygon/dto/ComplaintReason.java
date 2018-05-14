package ru.okb.polygon.dto;

public class ComplaintReason {
    private long reasonCode;
    private String reasonName;

    public ComplaintReason() {
    }

    public ComplaintReason(Long reasonCode, String reasonName) {
        this.reasonCode = reasonCode;
        this.reasonName = reasonName;
    }

    public long getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(long reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReasonName() {
        return reasonName;
    }

    public void setReasonName(String reasonName) {
        this.reasonName = reasonName;
    }

    @Override
    public String toString() {
        return "ComplaintReason{" +
                "reasonCode=" + reasonCode +
                ", reasonName='" + reasonName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComplaintReason that = (ComplaintReason) o;

        if (reasonCode != that.reasonCode) return false;
        return reasonName != null ? reasonName.equals(that.reasonName) : that.reasonName == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (reasonCode ^ (reasonCode >>> 32));
        result = 31 * result + (reasonName != null ? reasonName.hashCode() : 0);
        return result;
    }
}

