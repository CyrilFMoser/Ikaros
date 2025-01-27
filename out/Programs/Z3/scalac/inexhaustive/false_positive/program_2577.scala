package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_B, T_B], T_B]
case class CC_B(a: (CC_A,T_B), b: T_A[Int, T_B]) extends T_B
case class CC_D() extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((_,CC_D()), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants