package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[Char]
case class CC_B(a: T_B, b: T_A[CC_A], c: T_A[Char]) extends T_B
case class CC_C(a: Byte, b: Byte) extends T_B
case class CC_D(a: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A()) => 0 
  case CC_C(0, _) => 1 
  case CC_C(_, _) => 2 
  case CC_D(CC_C(_, _)) => 3 
}
}