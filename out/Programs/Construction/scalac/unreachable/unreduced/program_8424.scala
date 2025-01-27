package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, T_A[C, C]], c: T_A[C, Byte]) extends T_A[C, Byte]
case class CC_B[D](a: D, b: CC_A[D], c: Byte) extends T_A[D, Byte]
case class CC_C[E](a: T_A[E, E], b: E, c: T_A[E, Byte]) extends T_A[E, Byte]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_, _, _)