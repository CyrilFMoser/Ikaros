package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D[C](a: Byte, b: T_B[C, C], c: T_A) extends T_B[C, CC_B]
case class CC_E[D](a: T_A, b: (T_B[(Byte,Boolean), CC_B],Int)) extends T_B[D, CC_B]

val v_a: T_B[Byte, CC_B] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(CC_A(), (CC_D(_, _, _),12)) => 1 
  case CC_E(CC_A(), (CC_D(_, _, _),_)) => 2 
  case CC_E(CC_A(), (CC_E(_, _),12)) => 3 
  case CC_E(CC_A(), (CC_E(_, _),_)) => 4 
  case CC_E(CC_B(), (CC_D(_, _, _),12)) => 5 
  case CC_E(CC_B(), (CC_D(_, _, _),_)) => 6 
  case CC_E(CC_B(), (CC_E(_, _),12)) => 7 
  case CC_E(CC_B(), (CC_E(_, _),_)) => 8 
  case CC_E(CC_C(CC_B()), (CC_D(_, _, _),12)) => 9 
  case CC_E(CC_C(CC_B()), (CC_D(_, _, _),_)) => 10 
  case CC_E(CC_C(CC_B()), (CC_E(_, _),12)) => 11 
}
}
// This is not matched: CC_E(CC_C(CC_B()), (CC_E(_, _),_))