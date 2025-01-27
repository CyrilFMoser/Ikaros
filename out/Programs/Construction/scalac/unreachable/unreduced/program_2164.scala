package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: Char) extends T_A[Int]
case class CC_B(a: T_A[CC_A]) extends T_A[Int]
case class CC_C() extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _)