package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, Boolean], b: C, c: T_A[C, C]) extends T_A[C, Boolean]
case class CC_B[D](a: Boolean) extends T_A[D, Boolean]
case class CC_C[E]() extends T_A[E, Boolean]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, _) => 0 
  case CC_A(CC_A(CC_B(_), _, _), _, _) => 1 
  case CC_A(CC_A(CC_C(), _, _), _, _) => 2 
  case CC_A(CC_B(_), _, _) => 3 
  case CC_A(CC_C(), _, _) => 4 
  case CC_B(_) => 5 
  case CC_C() => 6 
}
}