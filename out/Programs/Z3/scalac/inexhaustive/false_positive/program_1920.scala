package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[E, F](a: (Int,Char)) extends T_A[E, F]

val v_a: CC_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_B((_,'x')) => 0 
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