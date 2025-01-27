package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: T_A[C, Byte], c: T_A[C, C]) extends T_A[C, Byte]
case class CC_B[D, E](a: CC_A[E], b: T_A[E, Byte]) extends T_A[D, Byte]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_, _), _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_A(_, CC_A(_, _, _), _)