package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_B[D](a: T_B[D]) extends T_B[D]
case class CC_C[E](a: CC_B[E]) extends T_B[E]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_C(_))) => 0 
}
}
// This is not matched: CC_A(_)