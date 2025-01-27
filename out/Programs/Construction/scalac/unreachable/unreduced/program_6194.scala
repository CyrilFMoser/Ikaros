package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: Int, b: T_A) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D(a: CC_A) extends T_B[CC_C]
case class CC_E[B](a: (T_B[CC_C],CC_D), b: CC_A) extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(_)) => 2 
  case CC_C(CC_B(_, _)) => 3 
  case CC_C(CC_C(_)) => 4 
}
}