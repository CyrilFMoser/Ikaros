package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_A[T_B, T_A[Char, T_B]]]
case class CC_B[D](a: CC_A[D], b: (Byte,Char), c: T_B) extends T_A[D, T_A[T_B, T_A[Char, T_B]]]
case class CC_C[E](a: Int) extends T_A[E, T_A[T_B, T_A[Char, T_B]]]

val v_a: T_A[T_B, T_A[T_B, T_A[Char, T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_)