package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Boolean]) extends T_A[Boolean]
case class CC_B(a: CC_A, b: CC_A) extends T_B
case class CC_C() extends T_B
case class CC_D(a: CC_A, b: T_A[T_A[T_B]], c: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(_), _, CC_A(_)) => 1 
}
}
// This is not matched: CC_B(CC_A(_), _)