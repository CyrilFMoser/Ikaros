package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[Int, CC_A]) extends T_A
case class CC_C(a: T_A, b: T_B[(T_A,T_A), T_A], c: T_B[CC_B, (Char,CC_B)]) extends T_B[(T_A,T_A), T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}