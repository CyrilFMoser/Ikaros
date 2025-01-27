package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Char) extends T_A[T_A[T_B, Byte], T_B]
case class CC_B(a: T_B, b: T_A[T_A[T_B, CC_A], CC_A]) extends T_A[T_A[T_B, Byte], T_B]
case class CC_C(a: CC_A, b: T_A[CC_A, CC_B], c: CC_A) extends T_B
case class CC_D(a: CC_A, b: CC_B) extends T_B
case class CC_E(a: T_A[T_B, T_A[CC_B, CC_B]], b: (CC_D,CC_D)) extends T_B

val v_a: T_A[T_A[T_B, Byte], T_B] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
  case CC_A(_) => 1 
  case CC_B(_, _) => 2 
}
}