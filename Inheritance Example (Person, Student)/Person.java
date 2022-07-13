class Person {

      String firstName;
      String lastName;

      Person() {
             System.out.println("Person class Constructor");
      }   

      public void setLastName(String lastName) {
            this.lastName = lastName;
      }

      public String getLastName() {
            return lastName;
      }

      public void setFirstName(String firstName) {
            this.firstName = firstName;
      }

      public String getFirstName() {
            return firstName;
      }

      // @Override
      // public String toString() {
      //       return "First name: " + firstName +
      //             "\nLast name: " + lastName;
      // }

}