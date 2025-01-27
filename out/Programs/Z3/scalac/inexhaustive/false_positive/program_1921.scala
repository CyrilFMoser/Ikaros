package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_B[E, F](a: F) extends T_A[E, F]

val v_a: CC_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_A Int
//      (CC_A (Tuple Int Boolean) Byte Boolean Boolean Boolean Boolean Boolean)
//      Boolean
//      Byte
//      Wildcard
//      Wildcard
//      (T_A Int
//           (CC_A (Tuple Int Boolean)
//                 Byte
//                 Boolean
//                 Boolean
//                 Boolean
//                 Boolean
//                 Boolean)))