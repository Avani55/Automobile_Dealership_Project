class Dealership {
      private Car[] cars; // fields of the object array.
      
      // this is the constructor.
      public Dealership(Car[] cars){
        this.cars = new Car[cars.length];
        this.cars = Arrays.copyOf(cars, cars.length);
        for(int i=0; i<this.cars.length; i++){
          this.cars[i]= new Car(cars[i]);
        }
      }
  // here we are accessing the car object data.using getter methods.
      // public Car getCar(int index){
      //      return this.cars[index];
      // } this is giving the internal data access outside to avoid this we use deep copying where we will create the copy of the object.

      public Car getCar(int index){
        Car copy = new Car(this.cars[index]);
        return copy;
      }// here we have created the copy of the object.

      public void setCar(int index, Car newCar){
        Car copy = new Car(this.cars[index]);
      }

      // here we are putting the value as with the help of setters.
      // public void setCar(int index, Car newCar){
      //           this.cars[index]= newCar;
      // }
      public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }
    public void sell(int index){
      this.cars[index].drive();
   }
