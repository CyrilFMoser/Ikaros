package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, T_A[T_A[Byte, Int], T_A[Boolean, Boolean]]]
case class CC_B(a: Byte, b: CC_A[T_A[Byte, Boolean]], c: (T_A[Char, Int],Int)) extends T_A[T_A[CC_A[Byte], CC_A[Boolean]], T_A[T_A[Byte, Int], T_A[Boolean, Boolean]]]

val v_a: T_A[T_A[CC_A[Byte], CC_A[Boolean]], T_A[T_A[Byte, Int], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}