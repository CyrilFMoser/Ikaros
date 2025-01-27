package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int, b: T_B[T_A]) extends T_A
case class CC_B(a: T_B[T_B[CC_A]]) extends T_A
case class CC_C(a: Byte, b: Char) extends T_A
case class CC_D(a: T_B[T_A], b: CC_B) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_, CC_B(_))) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}