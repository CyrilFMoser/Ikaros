package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: Int) extends T_A
case class CC_B(a: T_A, b: T_B[(CC_A,(Boolean,Byte))], c: T_B[CC_A]) extends T_A
case class CC_C(a: CC_A, b: CC_A) extends T_A
case class CC_D() extends T_B[CC_B]
case class CC_E(a: (T_B[CC_B],CC_D), b: (CC_B,CC_A)) extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(CC_A(_, _), _), CC_A(CC_A(_, _), _)) => 2 
  case CC_C(CC_A(CC_B(_, _, _), _), CC_A(CC_A(_, _), _)) => 3 
  case CC_C(CC_A(CC_C(_, _), _), CC_A(CC_A(_, _), _)) => 4 
  case CC_C(CC_A(CC_A(_, _), _), CC_A(CC_B(_, _, _), _)) => 5 
  case CC_C(CC_A(CC_B(_, _, _), _), CC_A(CC_B(_, _, _), _)) => 6 
  case CC_C(CC_A(CC_C(_, _), _), CC_A(CC_B(_, _, _), _)) => 7 
  case CC_C(CC_A(CC_A(_, _), _), CC_A(CC_C(_, _), _)) => 8 
  case CC_C(CC_A(CC_C(_, _), _), CC_A(CC_C(_, _), _)) => 9 
}
}
// This is not matched: CC_C(CC_A(CC_B(_, _, _), _), CC_A(CC_C(_, _), _))