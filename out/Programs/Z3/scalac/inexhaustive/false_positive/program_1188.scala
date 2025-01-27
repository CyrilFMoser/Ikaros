package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Boolean], b: Int) extends T_A[Int]
case class CC_B() extends T_A[Int]
case class CC_C() extends T_B[CC_B]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard (T_A Int))