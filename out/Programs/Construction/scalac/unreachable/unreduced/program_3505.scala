package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_B[Boolean], b: T_B[Int]) extends T_A
case class CC_D() extends T_B[(T_A,Byte)]
case class CC_E(a: T_B[CC_B]) extends T_B[(T_A,Byte)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_), _), _) => 1 
  case CC_A(CC_A(CC_C(_, _), _), _) => 2 
  case CC_A(CC_B(_), _) => 3 
  case CC_A(CC_C(_, _), _) => 4 
  case CC_B(CC_A(_, _)) => 5 
  case CC_B(CC_B(CC_A(_, _))) => 6 
  case CC_B(CC_B(CC_B(_))) => 7 
  case CC_B(CC_B(CC_C(_, _))) => 8 
  case CC_B(CC_C(_, _)) => 9 
  case CC_C(_, _) => 10 
}
}