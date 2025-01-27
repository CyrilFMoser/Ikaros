package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: (T_B[T_A],T_A)) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: Boolean) extends T_A
case class CC_D(a: CC_C, b: T_B[T_B[Int]]) extends T_B[Boolean]
case class CC_E[B](a: T_A) extends T_B[Boolean]
case class CC_F() extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(CC_A(CC_A(_, _), _)) => 1 
  case CC_E(CC_A(CC_C(_, _), _)) => 2 
  case CC_E(CC_B()) => 3 
  case CC_E(CC_C(_, _)) => 4 
  case CC_F() => 5 
}
}
// This is not matched: CC_E(CC_A(CC_B(), _))