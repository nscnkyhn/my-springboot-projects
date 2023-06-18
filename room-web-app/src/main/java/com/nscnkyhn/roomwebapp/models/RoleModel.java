package com.nscnkyhn.roomwebapp.models;

public enum RoleModel {
    HOUSE_KEEPING, FRONT_DESK, SECURITY, CONCIERGE, IT, CUSTOMER_SERVICES, MANAGEMENT, SECRETARY;

    @Override
    public String toString() {
        switch (this) {
            case HOUSE_KEEPING:
                return "House Keeping";
            case FRONT_DESK:
                return "Front Desk";
            case SECURITY:
                return "Security";
            case CONCIERGE:
                return "Concierge";
            case IT:
                return super.toString();
            case CUSTOMER_SERVICES:
                return "Customer Services";
            case MANAGEMENT:
                return "Management";
            case SECRETARY:
                return "Secretary";
            default:
                return "Undefined";
        }
    }
}
