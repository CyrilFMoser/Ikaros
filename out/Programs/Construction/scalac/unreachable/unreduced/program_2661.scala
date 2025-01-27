package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[((T_B,T_B),T_B), C]
case class CC_B[D](a: Boolean) extends T_A[((T_B,T_B),T_B), D]
case class CC_C[E](a: T_A[E, E], b: E, c: T_B) extends T_A[((T_B,T_B),T_B), E]

val v_a: T_A[((T_B,T_B),T_B), Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_)