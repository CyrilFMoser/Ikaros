package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_A[Byte]], c: T_A[Char]) extends T_A[T_A[T_A[Byte]]]
case class CC_B[B](a: B, b: CC_A) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}