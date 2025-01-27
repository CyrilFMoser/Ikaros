package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Byte, Byte], (Byte,Boolean)]) extends T_A[C, (Byte,Boolean)]
case class CC_B[D](a: T_A[D, (Byte,Boolean)], b: Int, c: D) extends T_A[D, (Byte,Boolean)]
case class CC_C[E](a: E, b: E, c: E) extends T_A[CC_A[E], E]

val v_a: T_A[Byte, (Byte,Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_B(_, _, _)) => 2 
  case CC_B(CC_A(_), _, _) => 3 
  case CC_B(CC_B(CC_A(_), _, _), _, _) => 4 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 5 
}
}