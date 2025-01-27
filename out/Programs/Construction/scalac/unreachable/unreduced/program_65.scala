package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, T_A[C, C]], c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B(a: Byte, b: Byte) extends T_A[T_A[T_A[Byte, Int], CC_A[Boolean]], T_A[T_A[T_A[Byte, Int], CC_A[Boolean]], T_A[T_A[Byte, Int], CC_A[Boolean]]]]

val v_a: T_A[T_A[T_A[Byte, Int], CC_A[Boolean]], T_A[T_A[T_A[Byte, Int], CC_A[Boolean]], T_A[T_A[Byte, Int], CC_A[Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(_, _)) => 1 
  case CC_B(_, _) => 2 
}
}