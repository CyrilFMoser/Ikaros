package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B(a: T_A, b: T_B[CC_A]) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D(a: T_B[CC_A], b: CC_C) extends T_B[CC_A]
case class CC_E(a: T_A) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
  case CC_B(CC_B(_, CC_E(_)), _) => 2 
  case CC_B(CC_C(CC_B(_, _)), _) => 3 
  case CC_C(_) => 4 
}
}
// This is not matched: CC_B(CC_B(_, CC_D(_, _)), _)