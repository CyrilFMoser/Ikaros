package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: Char, b: T_A, c: T_B[CC_A]) extends T_A
case class CC_C(a: CC_A, b: CC_B, c: T_A) extends T_B[T_B[T_B[Byte]]]
case class CC_D(a: CC_B, b: CC_B, c: CC_B) extends T_B[T_B[T_B[Byte]]]
case class CC_E(a: CC_A, b: CC_C) extends T_B[T_B[T_B[Byte]]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}