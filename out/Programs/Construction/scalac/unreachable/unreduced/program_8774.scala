package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[D, E]) extends T_A[D, E]
case class CC_B() extends T_B[T_A[Char, Boolean]]
case class CC_C(a: T_B[CC_A[CC_B, CC_B]]) extends T_B[T_A[Char, Boolean]]

val v_a: T_B[T_A[Char, Boolean]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
}
}