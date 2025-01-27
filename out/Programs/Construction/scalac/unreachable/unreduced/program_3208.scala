package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A, b: (T_A,CC_B), c: T_B[Int, CC_B]) extends T_A
case class CC_D(a: CC_B, b: CC_C) extends T_B[(CC_B,T_B[Byte, CC_A]), CC_C]
case class CC_E(a: T_A, b: T_A) extends T_B[(CC_B,T_B[Byte, CC_A]), CC_C]

val v_a: T_B[(CC_B,T_B[Byte, CC_A]), CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(), CC_C(_, (_,_), _)) => 0 
  case CC_E(CC_A(_, CC_A(_, _)), CC_A(_, _)) => 1 
  case CC_E(CC_A(_, CC_A(_, _)), CC_B()) => 2 
  case CC_E(CC_A(_, CC_A(_, _)), CC_C(_, _, _)) => 3 
  case CC_E(CC_A(_, CC_B()), CC_A(_, _)) => 4 
  case CC_E(CC_A(_, CC_B()), CC_B()) => 5 
  case CC_E(CC_A(_, CC_B()), CC_C(_, _, _)) => 6 
  case CC_E(CC_A(_, CC_C(_, _, _)), CC_A(_, _)) => 7 
  case CC_E(CC_A(_, CC_C(_, _, _)), CC_B()) => 8 
  case CC_E(CC_A(_, CC_C(_, _, _)), CC_C(_, _, _)) => 9 
  case CC_E(CC_B(), CC_A(_, _)) => 10 
  case CC_E(CC_B(), CC_B()) => 11 
  case CC_E(CC_C(CC_A(_, _), (_,_), _), CC_A(_, _)) => 12 
  case CC_E(CC_C(CC_A(_, _), (_,_), _), CC_B()) => 13 
  case CC_E(CC_C(CC_A(_, _), (_,_), _), CC_C(_, _, _)) => 14 
}
}
// This is not matched: CC_E(CC_B(), CC_C(_, _, _))