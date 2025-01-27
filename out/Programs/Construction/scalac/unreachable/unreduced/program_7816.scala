package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Boolean]) extends T_A[Boolean]
case class CC_B() extends T_A[Boolean]
case class CC_C(a: T_A[CC_A], b: CC_B, c: CC_A) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B()) => 1 
  case CC_A(CC_C(_, CC_B(), CC_A(_))) => 2 
  case CC_B() => 3 
  case CC_C(_, CC_B(), _) => 4 
}
}