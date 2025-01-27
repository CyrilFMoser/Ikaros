package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[C, C], c: C) extends T_A[C, T_A[C, T_A[C, Boolean]]]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, T_A[D, T_A[D, Boolean]]]
case class CC_C[E]() extends T_A[E, T_A[E, T_A[E, Boolean]]]

val v_a: T_A[Byte, T_A[Byte, T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}