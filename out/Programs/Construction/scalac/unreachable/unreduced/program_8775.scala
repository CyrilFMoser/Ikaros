package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte) extends T_A
case class CC_B() extends T_B[T_A]
case class CC_C(a: Byte, b: T_B[T_B[T_A]]) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(0, _) => 1 
  case CC_C(_, _) => 2 
}
}