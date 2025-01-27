package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[T_B[Byte, Int], T_A[Boolean, Int]], E]
case class CC_B(a: T_A[T_A[Boolean, Char], T_A[Char, Byte]]) extends T_A[T_B[T_B[Byte, Int], T_A[Boolean, Int]], T_B[T_B[Byte, Int], CC_A[Byte]]]

val v_a: T_A[T_B[T_B[Byte, Int], T_A[Boolean, Int]], T_B[T_B[Byte, Int], CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}