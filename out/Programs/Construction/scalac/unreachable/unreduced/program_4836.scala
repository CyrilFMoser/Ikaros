package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_A[T_A[(Boolean,Boolean), Int], T_A[Boolean, Char]]]
case class CC_B[D](a: Byte, b: Boolean, c: Char) extends T_A[D, T_A[T_A[(Boolean,Boolean), Int], T_A[Boolean, Char]]]
case class CC_C[E](a: T_A[E, E], b: T_A[E, CC_B[E]]) extends T_A[E, T_A[T_A[(Boolean,Boolean), Int], T_A[Boolean, Char]]]

val v_a: T_A[Int, T_A[T_A[(Boolean,Boolean), Int], T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(0, _, _) => 1 
  case CC_B(_, _, _) => 2 
}
}
// This is not matched: CC_C(_, _)