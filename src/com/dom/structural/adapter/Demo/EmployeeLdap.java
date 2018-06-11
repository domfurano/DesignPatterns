package com.dom.structural.adapter.Demo;

public class EmployeeLdap {
    private String cn;
    private String surname;
    private String givenName;
    private String mail;

    EmployeeLdap(String cn, String surname, String givenName, String mail) {
        this.cn = cn;
        this.surname = surname;
        this.givenName = givenName;
        this.mail = mail;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeLdap that = (EmployeeLdap) o;

        if (!getCn().equals(that.getCn())) return false;
        if (!getSurname().equals(that.getSurname())) return false;
        if (!getGivenName().equals(that.getGivenName())) return false;
        return getMail().equals(that.getMail());
    }

    @Override
    public int hashCode() {
        int result = getCn().hashCode();
        result = 31 * result + getSurname().hashCode();
        result = 31 * result + getGivenName().hashCode();
        result = 31 * result + getMail().hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeeLdap{");
        sb.append("cn='").append(cn).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", givenName='").append(givenName).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
