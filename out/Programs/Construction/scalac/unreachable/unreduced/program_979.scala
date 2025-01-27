package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: Char) extends T_A[D]
case class CC_B(a: T_B[CC_A[(Int,Char)], Boolean], b: T_A[T_A[Boolean]], c: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_C[E](a: T_B[Char, Int], b: T_B[Char, E]) extends T_B[Char, E]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, _, _), _) => 1 
  case CC_B(_, _, CC_B(_, _, _)) => 2 
}
}
// This is not matched: CC_B(_, _, CC_A(_, _))