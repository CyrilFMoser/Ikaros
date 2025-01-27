package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean) extends T_A
case class CC_B(a: CC_A, b: T_B[CC_A]) extends T_A
case class CC_C(a: T_B[(CC_B,Int)], b: T_A) extends T_A
case class CC_D(a: CC_C, b: CC_C, c: CC_B) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(true) => 0 
  case CC_A(false) => 1 
  case CC_B(CC_A(_), _) => 2 
  case CC_C(_, CC_A(_)) => 3 
  case CC_C(_, CC_B(CC_A(_), _)) => 4 
  case CC_C(_, CC_C(_, CC_A(_))) => 5 
  case CC_C(_, CC_C(_, CC_B(_, _))) => 6 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 7 
}
}