package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: C) extends T_A[Boolean, C]
case class CC_B[D](a: Char, b: D, c: D) extends T_A[Boolean, D]
case class CC_C[E](a: T_A[E, E], b: E) extends T_A[Boolean, E]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}