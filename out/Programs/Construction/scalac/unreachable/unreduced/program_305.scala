package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_A[Int],T_A[Int]), b: Char) extends T_A[Int]
case class CC_B(a: Char, b: Int) extends T_A[Int]
case class CC_C(a: CC_A) extends T_B
case class CC_D(a: CC_B, b: Byte, c: T_B) extends T_B
case class CC_E(a: T_A[Int], b: T_A[CC_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _)) => 0 
  case CC_D(_, _, _) => 1 
  case CC_E(CC_A(_, _), _) => 2 
  case CC_E(CC_B(_, _), _) => 3 
}
}