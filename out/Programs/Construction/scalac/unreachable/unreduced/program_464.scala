package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[(Int,T_B), C]]
case class CC_B[D](a: T_B, b: D) extends T_A[D, T_A[(Int,T_B), D]]
case class CC_C[E]() extends T_A[E, T_A[(Int,T_B), E]]
case class CC_D() extends T_B

val v_a: T_A[CC_D, T_A[(Int,T_B), CC_D]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_D(), _) => 1 
}
}
// This is not matched: CC_C()