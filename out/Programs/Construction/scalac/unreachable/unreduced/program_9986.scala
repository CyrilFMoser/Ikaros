package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: T_A[B]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: T_A[T_A[Boolean]], b: Char, c: CC_A[CC_A[Byte]]) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}