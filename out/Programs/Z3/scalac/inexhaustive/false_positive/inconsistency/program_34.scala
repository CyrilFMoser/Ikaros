package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[Char, C]
case class CC_C(a: T_A[T_B, Boolean], b: (T_B,T_B)) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_C(_, (CC_D(),_)) => 1 
}
}
// This is not matched: (CC_A (CC_C (CC_A Wildcard T_A) T_A) T_A)