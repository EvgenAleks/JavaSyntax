package class23;

public final class FinalKeyword {

   final double gravity = 9.8;

   final double PI = 3.14;

   final double LightSpeed = 299792458;

   final void tryChangeGravity() {
     // gravity = 1.6; // we get an error because this variable is marked final
   }
}

  // class Child extends FinalKeyword {
  //  final void tryChangeGravity() {
        // gravity = 1.6; // we get an error because this variable is marked final

