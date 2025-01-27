package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: Int, c: T_A[Char]) extends T_A[Char]
case class CC_B(a: Int, b: Byte, c: T_A[Char]) extends T_A[T_A[T_A[CC_A]]]
case class CC_C(a: T_A[Char], b: T_A[T_A[Char]], c: T_A[(CC_B,CC_A)]) extends T_A[T_A[T_A[CC_A]]]

val v_a: T_A[T_A[T_A[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_A(_, 12, CC_A(_, _, _)), _, _) => 1 
}
}
// This is not matched: CC_C(CC_A(_, _, CC_A(_, _, _)), _, _)