package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_B[Char]) extends T_A
case class CC_C(a: T_A, b: T_B[T_A]) extends T_A
case class CC_D(a: CC_A, b: CC_A) extends T_B[CC_C]
case class CC_E() extends T_B[CC_C]

val v_a: T_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(_, _)) => 0 
  case CC_D(CC_A(CC_A(_, _), CC_B(_)), CC_A(_, _)) => 1 
  case CC_D(CC_A(CC_A(_, _), CC_C(_, _)), CC_A(_, _)) => 2 
  case CC_D(CC_A(CC_B(_), CC_A(_, _)), CC_A(_, _)) => 3 
  case CC_D(CC_A(CC_B(_), CC_B(_)), CC_A(_, _)) => 4 
  case CC_D(CC_A(CC_B(_), CC_C(_, _)), CC_A(_, _)) => 5 
  case CC_D(CC_A(CC_C(_, _), CC_A(_, _)), CC_A(_, _)) => 6 
  case CC_D(CC_A(CC_C(_, _), CC_C(_, _)), CC_A(_, _)) => 7 
  case CC_E() => 8 
}
}
// This is not matched: CC_D(CC_A(CC_C(_, _), CC_B(_)), CC_A(_, _))