package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte, b: Boolean) extends T_A
case class CC_B(a: T_B[T_B[T_A]]) extends T_B[T_B[T_B[CC_A]]]
case class CC_C(a: CC_B, b: T_A) extends T_B[T_B[T_B[CC_A]]]
case class CC_D(a: CC_B, b: CC_B) extends T_B[T_B[T_B[CC_A]]]

val v_a: T_B[T_B[T_B[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, CC_A(_, _)) => 1 
  case CC_D(_, _) => 2 
}
}