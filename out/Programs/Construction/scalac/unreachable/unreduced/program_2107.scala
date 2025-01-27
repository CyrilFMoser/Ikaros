package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: (Char,Char)) extends T_A
case class CC_B(a: T_A, b: T_B[Int]) extends T_A
case class CC_C(a: T_A, b: Byte, c: Char) extends T_B[T_B[CC_B]]
case class CC_D() extends T_B[T_B[CC_B]]
case class CC_E(a: T_B[(Byte,Boolean)], b: Byte) extends T_B[T_B[CC_B]]

val v_a: T_B[T_B[CC_B]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), _, _) => 0 
  case CC_C(CC_B(_, _), _, _) => 1 
  case CC_D() => 2 
  case CC_E(_, _) => 3 
}
}