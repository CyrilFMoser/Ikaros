package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char, b: T_A[T_A[Byte]]) extends T_A[Byte]
case class CC_B(a: Int, b: T_A[Byte]) extends T_A[Byte]
case class CC_C[C](a: C, b: T_A[Byte], c: C) extends T_B[C]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _)) => 0 
  case CC_B(_, CC_B(_, CC_A(_, _))) => 1 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 2 
}
}