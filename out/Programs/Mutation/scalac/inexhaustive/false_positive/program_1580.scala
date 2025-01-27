package Program_63 

object Test {
sealed trait T_A[A, B]
case class CC_A[F, E](a: Int) extends T_A[F, E]

val v_a: CC_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard (T_A (T_A Int)))