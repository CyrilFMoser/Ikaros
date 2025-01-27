package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Int) extends T_A[C]
case class CC_B[D](a: D) extends T_A[D]
case class CC_C[E](a: T_B[E], b: CC_B[E], c: CC_B[E]) extends T_A[E]
case class CC_D(a: CC_C[CC_A[Byte]]) extends T_B[T_A[(Byte,Byte)]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_)