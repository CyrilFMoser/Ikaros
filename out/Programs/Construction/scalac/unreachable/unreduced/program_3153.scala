package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Byte], b: T_B) extends T_A[T_A[Byte]]
case class CC_B(a: T_A[T_A[Byte]], b: T_B, c: T_B) extends T_A[T_A[Byte]]
case class CC_C(a: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_D() extends T_B
case class CC_E(a: T_A[T_A[CC_B]]) extends T_B
case class CC_F(a: Boolean, b: CC_A, c: (CC_C,CC_E)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_) => 1 
  case CC_F(_, CC_A(_, CC_D()), (CC_C(_),CC_E(_))) => 2 
  case CC_F(_, CC_A(_, CC_E(_)), (CC_C(_),CC_E(_))) => 3 
  case CC_F(_, CC_A(_, CC_F(_, _, _)), (CC_C(_),CC_E(_))) => 4 
}
}