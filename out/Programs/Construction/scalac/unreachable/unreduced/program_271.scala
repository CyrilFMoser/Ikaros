package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Boolean]) extends T_A[T_B]
case class CC_B(a: T_A[(T_B,T_B)]) extends T_B
case class CC_C(a: T_A[T_B], b: Int) extends T_B
case class CC_D(a: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_A(_), _) => 1 
  case CC_D(CC_C(_, _)) => 2 
}
}