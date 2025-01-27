package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_B(a: Byte, b: T_A[(Byte,Byte), T_A[Char, Boolean]]) extends T_B[T_B[T_A[Boolean, Byte]]]
case class CC_C[E](a: (T_B[CC_B],T_B[Byte])) extends T_B[E]
case class CC_D(a: CC_C[Char], b: Boolean, c: CC_C[CC_B]) extends T_B[T_B[T_A[Boolean, Byte]]]

val v_a: T_B[T_B[T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_D(_, _, _) => 1 
}
}
// This is not matched: CC_C((CC_C(_),CC_C(_)))