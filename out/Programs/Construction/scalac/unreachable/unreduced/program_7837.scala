package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Byte]], b: T_B[T_B[Int]], c: Boolean) extends T_A[T_A[T_B[Char]]]
case class CC_B[C](a: C) extends T_A[C]
case class CC_C(a: CC_A, b: Byte) extends T_A[T_A[T_B[Char]]]
case class CC_D(a: Byte, b: CC_A, c: T_B[Byte]) extends T_B[Byte]

val v_a: T_A[T_A[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(CC_B(_)), _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_A(_, _, _), _) => 2 
}
}