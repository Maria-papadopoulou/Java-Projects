class Student extends Person {

      String registrationNo;

      Student() {
            System.out.println("Student class Constructor");
      } 

      public void setRegistrationNo(String registrationNo) {
            this.registrationNo = registrationNo;
      }

      public String getRegistrationNo() {
            return registrationNo;
      }

      // @Override
      // public String toString() {
      //       return "First name: " + firstName +
      //             "\nLast name: " + lastName +
      //             "\nRegistration No: " + registrationNo;
      // }

}