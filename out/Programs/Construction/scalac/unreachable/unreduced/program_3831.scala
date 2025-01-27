package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[T_A[Byte, Byte], T_A[Char, Byte]]]
case class CC_B[D](a: (T_A[Char, Boolean],Int)) extends T_A[D, T_A[T_A[Byte, Byte], T_A[Char, Byte]]]
case class CC_C[E](a: CC_A[E], b: E, c: (Byte,Char)) extends T_A[E, T_A[T_A[Byte, Byte], T_A[Char, Byte]]]

val v_a: T_A[Byte, T_A[T_A[Byte, Byte], T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}