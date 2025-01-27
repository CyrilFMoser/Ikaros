package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[T_A[Boolean, Byte], T_A[Byte, Char]]]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[D, T_A[CC_A[Int], CC_A[Boolean]]]
case class CC_C[E]() extends T_A[E, T_A[CC_A[Int], CC_A[Boolean]]]

val v_a: T_A[Boolean, T_A[CC_A[Int], CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}