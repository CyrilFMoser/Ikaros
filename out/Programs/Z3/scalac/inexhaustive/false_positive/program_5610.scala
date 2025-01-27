package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_A[Char]) extends T_A[D]
case class CC_D() extends T_B[CC_A[Boolean]]

val v_a: CC_B[CC_D] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_B (CC_D (T_A Boolean) Boolean)
//      (CC_A Char (T_A Char))
//      (CC_B (CC_D Boolean Boolean)
//            (CC_A Char (T_A Char))
//            (CC_B (CC_D Boolean Boolean)
//                  (CC_A Char (T_A Char))
//                  Wildcard
//                  (T_A (CC_D Boolean Boolean)))
//            (T_A (CC_D Boolean Boolean)))
//      (T_A (CC_D (T_A Boolean) Boolean)))