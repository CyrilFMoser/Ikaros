package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Char, C], b: T_A[C, C]) extends T_A[C, T_A[T_A[Char, Byte], T_A[Int, Int]]]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, T_A[T_A[Char, Byte], T_A[Int, Int]]]
case class CC_C[E]() extends T_A[E, T_A[T_A[Char, Byte], T_A[Int, Int]]]

val v_a: T_A[Byte, T_A[T_A[Char, Byte], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)