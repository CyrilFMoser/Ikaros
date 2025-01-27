package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[C, T_A[Boolean, Byte]]

val v_a: T_A[Int, T_A[Boolean, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_C (CC_B (CC_A Boolean T_A)
//            (CC_A Wildcard T_A)
//            Wildcard
//            (T_B (CC_A Boolean T_A)))
//      (T_B (T_B Boolean)))