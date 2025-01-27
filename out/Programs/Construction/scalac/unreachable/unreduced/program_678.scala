package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[C, T_A[Byte, T_A[(Byte,Boolean), T_B]]]
case class CC_B[D](a: D, b: T_A[D, D], c: ((T_B,T_B),(T_B,T_B))) extends T_A[CC_A[T_B], D]
case class CC_C[E](a: Char) extends T_A[CC_A[T_B], E]
case class CC_D(a: CC_C[CC_A[T_B]]) extends T_B

val v_a: T_A[CC_A[T_B], Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, (_,_)) => 0 
  case CC_C(_) => 1 
}
}