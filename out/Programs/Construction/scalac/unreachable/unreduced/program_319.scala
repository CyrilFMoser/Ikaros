package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Int]
case class CC_B(a: T_A[Boolean], b: T_A[Int]) extends T_A[Int]
case class CC_C(a: Boolean, b: CC_A) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A()