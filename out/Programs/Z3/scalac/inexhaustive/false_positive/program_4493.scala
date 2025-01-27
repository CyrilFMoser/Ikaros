package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, C]) extends T_A[D, C]
case class CC_B[F, E](a: Int, b: Char) extends T_A[F, E]

val v_a: CC_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Char Int (CC_A Char Int Wildcard (T_A Int Char)) (T_A Int Char))