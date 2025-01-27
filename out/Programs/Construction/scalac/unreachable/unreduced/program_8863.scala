package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean, b: T_B[(Char,Char)], c: (Char,T_A)) extends T_A
case class CC_B(a: T_A, b: Byte) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[B]() extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_B(CC_B(CC_A(_, _, _), _), _) => 2 
  case CC_B(CC_B(CC_B(_, _), _), _) => 3 
  case CC_B(CC_C(CC_A(_, _, _)), _) => 4 
  case CC_B(CC_C(CC_B(_, _)), _) => 5 
  case CC_B(CC_C(CC_C(_)), _) => 6 
  case CC_C(CC_A(_, _, (_,_))) => 7 
  case CC_C(CC_B(CC_A(_, _, _), _)) => 8 
  case CC_C(CC_B(CC_B(_, _), _)) => 9 
  case CC_C(CC_B(CC_C(_), _)) => 10 
  case CC_C(CC_C(CC_A(_, _, _))) => 11 
  case CC_C(CC_C(CC_B(_, _))) => 12 
  case CC_C(CC_C(CC_C(_))) => 13 
}
}
// This is not matched: CC_B(CC_B(CC_C(_), _), _)