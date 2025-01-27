package Program_63 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_B]) extends T_A[Int]
case class CC_D(a: Char) extends T_B

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_D('x'), _) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard (T_A Int))