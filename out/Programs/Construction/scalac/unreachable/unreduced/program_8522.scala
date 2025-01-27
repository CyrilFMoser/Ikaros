package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: ((Byte,Char),T_A[Boolean, Byte])) extends T_A[C, T_A[(Int,Byte), Boolean]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: CC_A[D]) extends T_A[D, T_A[(Int,Byte), Boolean]]
case class CC_C[E](a: CC_A[E]) extends T_A[E, T_A[(Int,Byte), Boolean]]

val v_a: T_A[Byte, T_A[(Int,Byte), Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_A(_, _)) => 1 
}
}
// This is not matched: CC_A(_, _)