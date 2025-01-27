package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: T_B[(Int,Int), Int]) extends T_A
case class CC_B() extends T_A
case class CC_D() extends T_B[Byte, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(12, _) => 1 
}
}
// This is not matched: (CC_A (CC_A Byte Boolean) (T_A (CC_A Byte Boolean)))