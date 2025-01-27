package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Char], b: T_A[C, C]) extends T_A[C, T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]]
case class CC_C(a: CC_B[CC_A[Char]]) extends T_A[Char, T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]]

val v_a: T_A[Char, T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(CC_B()) => 1 
}
}
// This is not matched: CC_B()