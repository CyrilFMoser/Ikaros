package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[C, T_A[T_A[Char, Char], T_A[Byte, Boolean]]]
case class CC_B[D](a: T_A[D, D], b: T_A[CC_A[D], D]) extends T_A[D, T_A[T_A[Char, Char], T_A[Byte, Boolean]]]

val v_a: T_A[Int, T_A[T_A[Char, Char], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: CC_B(_, _)