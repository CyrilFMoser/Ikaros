package Program_60 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[Int]]
case class CC_B(a: T_B[Char], b: Int) extends T_A[T_B[Int]]
case class CC_C() extends T_B[CC_A]

val v_a: T_A[T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, 12) => 1 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard (T_A (T_A Int)))