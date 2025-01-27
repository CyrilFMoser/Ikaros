package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[E, E]) extends T_A[D, E]
case class CC_B() extends T_B[Boolean]
case class CC_C(a: T_A[CC_A[CC_B, CC_B], Int], b: T_A[T_A[CC_B, CC_B], T_A[CC_B, (Int,Char)]], c: T_B[T_B[CC_B]]) extends T_B[Boolean]
case class CC_D(a: T_A[CC_B, T_B[Boolean]]) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(CC_A(_)), CC_A(CC_A(_)), _) => 1 
}
}
// This is not matched: CC_D(_)