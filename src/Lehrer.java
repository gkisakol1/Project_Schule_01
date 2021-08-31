public class Lehrer {

    /*
 * 2) Teacher class
 * * there should be some information about all teachers like name, surname,branch and phone number
 * * there should be constructors to create teacher objects
 * * there should be a method for printing teacher's information
 *
 */


    private String name,surname,branch,phoneNumber;

    Lehrer(String name, String surname, String branch , String phoneNumber){
        this.name=name;
        this.surname= surname;
        this.branch = branch;
        this.phoneNumber=phoneNumber;

    }

    Lehrer(){

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString(Lehrer teacher) {

        return "Name : " + name +" " + surname +", "+ branch +", "+phoneNumber;
    }


}