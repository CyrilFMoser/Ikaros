package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: T_A[Boolean]) extends T_A[Int]
case class CC_B() extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_B(), _) => 1 
}
}
// This is not matched: (CC_B T_A)