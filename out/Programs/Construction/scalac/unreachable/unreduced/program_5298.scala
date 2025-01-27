package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[Boolean, T_A[Boolean, Byte]]) extends T_A[Boolean, Byte]
case class CC_B(a: Int, b: T_A[Boolean, Byte]) extends T_A[Boolean, Byte]
case class CC_C[F, E](a: (Byte,CC_B), b: F, c: CC_B) extends T_B[E, F]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_)) => 0 
  case CC_B(_, CC_B(_, _)) => 1 
}
}
// This is not matched: CC_A(_)