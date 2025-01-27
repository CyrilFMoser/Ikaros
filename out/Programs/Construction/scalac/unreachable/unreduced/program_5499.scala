package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Int) extends T_A[T_A[Boolean]]
case class CC_B(a: T_B) extends T_B
case class CC_C(a: T_A[CC_A], b: T_B, c: CC_A) extends T_B
case class CC_D(a: T_B, b: T_A[T_A[Boolean]]) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_))) => 0 
  case CC_B(CC_B(CC_C(_, _, _))) => 1 
  case CC_B(CC_B(CC_D(_, _))) => 2 
  case CC_B(CC_C(_, _, CC_A(_))) => 3 
  case CC_B(CC_D(CC_B(_), _)) => 4 
  case CC_B(CC_D(CC_C(_, _, _), _)) => 5 
  case CC_B(CC_D(CC_D(_, _), _)) => 6 
}
}