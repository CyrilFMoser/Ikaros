package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,T_B[Int]), b: Byte) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: CC_B, b: (Char,T_B[(Int,Boolean)]), c: T_B[T_A]) extends T_A
case class CC_D(a: Char, b: Byte, c: Byte) extends T_B[CC_B]
case class CC_E(a: T_B[CC_B], b: CC_A) extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(CC_A(_, _)), _, _) => 2 
  case CC_C(CC_B(CC_B(_)), _, _) => 3 
  case CC_C(CC_B(CC_C(_, _, _)), _, _) => 4 
}
}