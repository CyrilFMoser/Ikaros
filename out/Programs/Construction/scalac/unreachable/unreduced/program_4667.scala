package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: T_A[C, C]) extends T_A[C, T_A[T_A[Byte, Char], T_A[Byte, Boolean]]]
case class CC_B[D](a: CC_A[D]) extends T_A[(CC_A[Char],CC_A[Byte]), T_A[T_A[Byte, Char], T_A[Byte, Boolean]]]
case class CC_C[E]() extends T_A[E, T_A[T_A[Byte, Char], T_A[Byte, Boolean]]]

val v_a: T_A[(CC_A[Char],CC_A[Byte]), T_A[T_A[Byte, Char], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}