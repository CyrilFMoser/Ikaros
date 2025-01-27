package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Boolean, T_A[Boolean, T_A[Boolean, Byte]]]) extends T_A[Boolean, C]
case class CC_B[E](a: T_A[Boolean, E], b: T_A[E, E], c: E) extends T_A[Boolean, E]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(CC_A(_)), _, _) => 1 
  case CC_B(CC_B(CC_A(_), _, _), _, _) => 2 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 3 
}
}
// This is not matched: CC_B(CC_A(CC_B(_, _, _)), _, _)