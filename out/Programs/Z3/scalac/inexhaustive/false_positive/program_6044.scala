package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B(a: Int) extends T_A[CC_A[Boolean, Byte], T_A[Boolean, Char]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_C (CC_A (CC_B Boolean Boolean Boolean Boolean)
//            Wildcard
//            Wildcard
//            (T_A (CC_B Boolean Boolean Boolean Boolean)))
//      (T_B (CC_A Byte Boolean Boolean Boolean)))