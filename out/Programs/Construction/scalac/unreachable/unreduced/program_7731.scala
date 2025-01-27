package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Boolean, Byte], T_A[Char, Boolean]]]
case class CC_B[D](a: CC_A[D], b: CC_A[D], c: T_A[D, D]) extends T_A[D, T_A[T_A[Boolean, Byte], T_A[Char, Boolean]]]
case class CC_C[E](a: CC_B[CC_A[E]]) extends T_A[E, T_A[T_A[Boolean, Byte], T_A[Char, Boolean]]]

val v_a: T_A[Int, T_A[T_A[Boolean, Byte], T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_B(CC_A(), _, _)) => 1 
}
}
// This is not matched: CC_B(_, _, _)