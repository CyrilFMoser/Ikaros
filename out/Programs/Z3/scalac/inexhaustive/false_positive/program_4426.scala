package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B() extends T_B
case class CC_C(a: (T_B,CC_B), b: T_A[CC_B, T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((CC_B(),_), _) => 1 
}
}
// This is not matched: (CC_A (T_B Char) Char Wildcard Wildcard Wildcard (T_A (T_B Char) Char))