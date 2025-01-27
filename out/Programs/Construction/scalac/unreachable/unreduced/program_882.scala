package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[Char]) extends T_A
case class CC_B(a: Byte, b: T_A, c: CC_A) extends T_A
case class CC_C(a: Boolean, b: CC_B, c: CC_B) extends T_A
case class CC_D(a: CC_C, b: Char, c: T_B[T_A]) extends T_B[T_B[T_B[CC_B]]]
case class CC_E(a: CC_B, b: Boolean, c: (CC_C,(CC_B,(Boolean,Char)))) extends T_B[T_B[T_B[CC_B]]]
case class CC_F(a: CC_A, b: CC_A) extends T_B[T_B[T_B[CC_B]]]

val v_a: T_B[T_B[T_B[CC_B]]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(_, _, _) => 1 
}
}
// This is not matched: CC_F(_, CC_A(_, _))