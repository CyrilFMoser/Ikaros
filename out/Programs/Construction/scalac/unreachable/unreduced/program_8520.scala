package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: Boolean, c: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_A, b: CC_B, c: (T_B[(Char,Byte)],CC_B)) extends T_A
case class CC_D() extends T_B[CC_B]
case class CC_E(a: T_A) extends T_B[CC_B]
case class CC_F(a: CC_E, b: (CC_A,CC_A)) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_E(CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_E(CC_A(_, _, CC_B(_))) => 1 
  case CC_E(CC_A(_, _, CC_C(_, _, _))) => 2 
  case CC_E(CC_B(CC_A(_, _, _))) => 3 
  case CC_E(CC_B(CC_B(_))) => 4 
  case CC_E(CC_B(CC_C(_, _, _))) => 5 
  case CC_E(CC_C(CC_A(_, _, _), _, _)) => 6 
  case CC_E(CC_C(CC_B(_), _, _)) => 7 
  case CC_E(CC_C(CC_C(_, _, _), _, _)) => 8 
  case CC_F(_, (CC_A(_, _, _),CC_A(_, _, _))) => 9 
}
}
// This is not matched: CC_D()