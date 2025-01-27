package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[Boolean, C], b: C, c: T_A[C, C]) extends T_A[Boolean, C]
case class CC_B[D](a: D) extends T_A[Boolean, D]
case class CC_C[E]() extends T_A[Boolean, E]

val v_a: T_A[Boolean, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C()