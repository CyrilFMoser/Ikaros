package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Byte], Byte], b: T_B[T_B[Byte, Byte], T_B[Char, Boolean]], c: T_A[T_B[Boolean, Boolean]]) extends T_A[T_B[T_B[Boolean, Byte], T_B[Boolean, Boolean]]]
case class CC_B(a: T_B[T_B[CC_A, CC_A], (CC_A,CC_A)]) extends T_A[T_B[T_B[Boolean, Byte], T_B[Boolean, Boolean]]]

val v_a: T_A[T_B[T_B[Boolean, Byte], T_B[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}