package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_B]]
case class CC_B() extends T_A[CC_A]
case class CC_C(a: T_A[T_A[CC_A]]) extends T_B
case class CC_D(a: T_A[CC_A], b: T_A[Boolean]) extends T_B
case class CC_E(a: Int, b: T_A[T_A[T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_B(), _) => 1 
  case CC_E(_, CC_A()) => 2 
}
}