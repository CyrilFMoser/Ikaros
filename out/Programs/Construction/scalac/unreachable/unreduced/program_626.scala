package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char) extends T_A[T_B[T_A[Boolean]]]
case class CC_B(a: Char, b: Char, c: T_A[T_B[Char]]) extends T_A[T_B[T_A[Boolean]]]
case class CC_C(a: CC_A, b: T_B[(Boolean,CC_A)], c: T_A[Byte]) extends T_A[T_B[T_A[Boolean]]]

val v_a: T_A[T_B[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
  case CC_A(_) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_, _, _) => 3 
}
}