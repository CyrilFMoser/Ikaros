package Program_63 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: T_A[D, D]) extends T_A[D, T_A[D, D]]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
}
}
// This is not matched: CC_B(_)