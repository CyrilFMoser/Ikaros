package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: Boolean) extends T_A[T_A[Byte, (Byte,T_B)], T_A[T_A[T_B, T_B], T_A[T_B, Int]]]
case class CC_B(a: T_A[CC_A, (Boolean,CC_A)]) extends T_A[T_A[Byte, (Byte,T_B)], T_A[T_A[T_B, T_B], T_A[T_B, Int]]]
case class CC_C(a: Byte, b: CC_A) extends T_B

val v_a: T_A[T_A[Byte, (Byte,T_B)], T_A[T_A[T_B, T_B], T_A[T_B, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, CC_A(_, _)), _) => 0 
  case CC_B(_) => 1 
}
}