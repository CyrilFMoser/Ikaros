package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Char) extends T_A[T_B]
case class CC_B() extends T_B
case class CC_C(a: T_A[CC_A]) extends T_B
case class CC_D(a: T_A[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_A(_)) => 1 
}
}
// This is not matched: CC_B()