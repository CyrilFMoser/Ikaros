package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(T_A,T_A)], b: T_B[T_B[Boolean]], c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: T_B[CC_A]) extends T_A
case class CC_D(a: T_B[CC_B], b: T_B[CC_B]) extends T_B[CC_B]
case class CC_E() extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _, _), _) => 2 
  case CC_C(CC_B(), _) => 3 
  case CC_C(CC_C(_, _), _) => 4 
}
}