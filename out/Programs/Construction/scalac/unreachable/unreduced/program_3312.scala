package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Boolean]
case class CC_B(a: T_A[Boolean], b: Boolean) extends T_A[Boolean]
case class CC_C(a: T_A[T_A[CC_A]]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, true) => 0 
  case CC_B(_, false) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: CC_A()