package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[Int, C]
case class CC_B[D](a: T_A[Int, D], b: D) extends T_A[Int, D]
case class CC_C[E](a: T_A[E, E], b: T_A[Int, E], c: Boolean) extends T_A[Int, E]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
  case CC_B(CC_C(_, _, _), _) => 3 
  case CC_C(_, _, _) => 4 
}
}