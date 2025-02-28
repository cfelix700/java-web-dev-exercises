//package org.launchcode.java.demos.lsn5unittesting.test;
//
//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.fail;
//
//import org.launchcode.java.demos.lsn5unittesting.main.Car;
//
//
//public class CarTest {
//
//    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
//    @Test
//    public void emptyTest() {
//        assertEquals(10, 10, .001);
//    }
//
//    //TODO: constructor sets gasTankLevel properly
//    @Test
//    public void testInitialGasTank() {
//        Car test_car = new Car("Toyota", "Prius", 10, 50);
//        assertEquals(10, test_car.getGasTankLevel(), .001);
//    }
//
//    //TODO: gasTankLevel is accurate after driving within tank range
////    @Test
////    public void testGasTankAfterDriving() {
////        Car test_car = new Car(test_car.drive(50));
////        assertEquals(9, test_car.getGasTankLevel(), .001);
////    }
//
//    //TODO: gasTankLevel is accurate after attempting to drive past tank range
//    @Test
//    public void testGasTankLevelAccuracyAfterDrivingPastRange() {
//        Car testCar = new Car(test_car.drive(50));
//        testCar.getGasTankLevel();
//        testCar.drive(15);
//        assertEquals( 0, testCar.getGasTankLevel(), .001);
//    }
//
//
//    //TODO: can't have more gas than tank size, expect an exception
//    @Test(expected = IllegalArgumentException.class)
//    public void testGasOverfillException(){
//
//        test_car.addGas(5);
//        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
//    }
//
//
//}
