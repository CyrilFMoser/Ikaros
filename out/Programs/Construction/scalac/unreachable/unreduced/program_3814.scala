package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[Boolean, T_A], T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: Boolean, b: Boolean) extends T_A
case class CC_D[C, D](a: C) extends T_B[CC_A, C]
case class CC_E(a: Boolean) extends T_B[CC_A, (CC_D[Boolean, Int],CC_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(), _) => 1 
  case CC_A(CC_C(_, _), _) => 2 
  case CC_B() => 3 
  case CC_C(_, _) => 4 
}
}