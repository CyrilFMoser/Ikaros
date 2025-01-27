package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: CC_B, b: T_B[CC_A]) extends T_A
case class CC_D(a: CC_B) extends T_B[CC_C]
case class CC_E() extends T_B[CC_C]
case class CC_F(a: (T_B[CC_C],(CC_A,Int)), b: T_B[CC_C]) extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_))) => 1 
  case CC_A(CC_A(CC_C(_, _))) => 2 
  case CC_A(CC_B(CC_A(_))) => 3 
  case CC_A(CC_B(CC_B(_))) => 4 
  case CC_A(CC_B(CC_C(_, _))) => 5 
  case CC_B(_) => 6 
  case CC_C(CC_B(CC_A(_)), _) => 7 
  case CC_C(CC_B(CC_B(_)), _) => 8 
  case CC_C(CC_B(CC_C(_, _)), _) => 9 
}
}
// This is not matched: CC_A(CC_C(CC_B(_), _))