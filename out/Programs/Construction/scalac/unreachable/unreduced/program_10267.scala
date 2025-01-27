package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Char]], b: T_B[T_A[Byte]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[T_A[CC_A]], b: CC_A) extends T_A[T_A[T_A[Byte]]]
case class CC_C[C](a: C, b: Byte, c: C) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_C(_, _, _) => 2 
}
}