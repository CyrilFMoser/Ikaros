package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A]) extends T_A
case class CC_B(a: Byte, b: Char) extends T_A
case class CC_C(a: T_A, b: CC_A) extends T_A
case class CC_D() extends T_B[Int]
case class CC_E(a: CC_C, b: CC_C, c: CC_A) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_C(_, _), CC_C(CC_A(_, _), CC_A(_, _)), CC_A(_, _)) => 1 
  case CC_E(CC_C(_, _), CC_C(CC_B(_, _), CC_A(_, _)), CC_A(_, _)) => 2 
  case CC_E(CC_C(_, _), CC_C(CC_C(_, _), CC_A(_, _)), CC_A(_, _)) => 3 
}
}