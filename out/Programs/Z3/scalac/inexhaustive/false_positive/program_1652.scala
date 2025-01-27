package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: D) extends T_A[T_A[D, D], D]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_C Wildcard
//      Wildcard
//      (CC_A (Tuple Int Int) Wildcard (T_A (Tuple Int Int)))
//      T_B)