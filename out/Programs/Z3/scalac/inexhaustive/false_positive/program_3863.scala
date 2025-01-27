package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: (T_B,Char)) extends T_A[C, D]
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: CC_A[Boolean, CC_C] = null
val v_b: Int = v_a match{
  case CC_A((CC_C(),_)) => 0 
}
}
// This is not matched: (CC_C (T_A Int))