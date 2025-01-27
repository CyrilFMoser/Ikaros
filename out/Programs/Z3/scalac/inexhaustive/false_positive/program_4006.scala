package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Int]
case class CC_B(a: T_A[Int]) extends T_A[Int]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: (CC_A T_A)