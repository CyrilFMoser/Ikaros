package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[(T_B,T_A[T_B])]
case class CC_B(a: (T_A[T_B],Boolean), b: T_B) extends T_A[(T_B,T_A[T_B])]
case class CC_C(a: Boolean, b: T_B) extends T_B
case class CC_D() extends T_B
case class CC_E(a: T_B) extends T_B

val v_a: T_A[(T_B,T_A[T_B])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,true), CC_C(_, CC_C(_, _))) => 1 
  case CC_B((_,true), CC_C(_, CC_D())) => 2 
  case CC_B((_,true), CC_C(_, CC_E(_))) => 3 
  case CC_B((_,true), CC_D()) => 4 
  case CC_B((_,true), CC_E(CC_C(_, _))) => 5 
  case CC_B((_,true), CC_E(CC_D())) => 6 
  case CC_B((_,true), CC_E(CC_E(_))) => 7 
  case CC_B((_,false), CC_C(_, CC_C(_, _))) => 8 
  case CC_B((_,false), CC_C(_, CC_D())) => 9 
  case CC_B((_,false), CC_C(_, CC_E(_))) => 10 
  case CC_B((_,false), CC_D()) => 11 
  case CC_B((_,false), CC_E(CC_C(_, _))) => 12 
  case CC_B((_,false), CC_E(CC_D())) => 13 
  case CC_B((_,false), CC_E(CC_E(_))) => 14 
}
}