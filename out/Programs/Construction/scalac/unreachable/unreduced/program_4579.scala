package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Byte, Char], T_A[Boolean, Byte]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Byte, Char], T_A[Boolean, Byte]]]
case class CC_C[E](a: E, b: E, c: T_A[E, E]) extends T_A[E, T_A[T_A[Byte, Char], T_A[Boolean, Byte]]]

val v_a: T_A[Byte, T_A[T_A[Byte, Char], T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}