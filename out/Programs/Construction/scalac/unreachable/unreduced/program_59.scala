package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: ((T_B,Int),Boolean)) extends T_A[T_A[Boolean]]
case class CC_B(a: CC_A, b: T_A[T_B], c: Boolean) extends T_A[T_B]
case class CC_C(a: Boolean, b: CC_B, c: T_B) extends T_A[T_A[Boolean]]
case class CC_D(a: Byte, b: CC_B, c: (T_A[T_B],CC_C)) extends T_B
case class CC_E(a: CC_C, b: CC_D) extends T_B
case class CC_F(a: T_A[T_B], b: T_A[CC_D]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B(_, _, _), _) => 0 
  case CC_E(_, CC_D(_, _, _)) => 1 
  case CC_F(_, _) => 2 
}
}