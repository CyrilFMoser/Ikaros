package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: (Int,T_B)) extends T_A[T_A[T_B, (Char,Char)], Int]
case class CC_C() extends T_B
case class CC_E() extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,CC_C())) => 0 
}
}
// This is not matched: (CC_A T_A)