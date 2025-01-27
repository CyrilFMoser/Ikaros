package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C[D, C](a: T_B[C, D], b: CC_A, c: (T_A,T_A)) extends T_B[C, D]

val v_a: CC_C[T_A, T_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _, (_,CC_B())) => 0 
}
}
// This is not matched: (CC_D Boolean
//      Wildcard
//      (CC_D T_A
//            (CC_E T_A (T_B T_A))
//            (CC_D T_A Wildcard Wildcard (T_B T_A))
//            (T_B T_A))
//      (T_B Boolean))