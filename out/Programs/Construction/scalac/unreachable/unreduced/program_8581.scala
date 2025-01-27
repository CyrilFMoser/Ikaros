package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: CC_A, b: T_B[T_B[CC_A, Boolean], T_A], c: CC_A) extends T_A
case class CC_C(a: (CC_A,T_A), b: T_A) extends T_A
case class CC_D[C](a: Byte, b: Byte, c: CC_B) extends T_B[C, CC_C]
case class CC_E[D, E](a: CC_B) extends T_B[D, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_A(_, CC_A(CC_B(_, _, _), CC_A(_, _))) => 1 
  case CC_A(_, CC_A(CC_C(_, _), CC_A(_, _))) => 2 
  case CC_A(_, CC_A(CC_A(_, _), CC_B(_, _, _))) => 3 
  case CC_A(_, CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 4 
  case CC_A(_, CC_A(CC_C(_, _), CC_B(_, _, _))) => 5 
  case CC_A(_, CC_A(CC_A(_, _), CC_C(_, _))) => 6 
  case CC_A(_, CC_A(CC_B(_, _, _), CC_C(_, _))) => 7 
  case CC_A(_, CC_A(CC_C(_, _), CC_C(_, _))) => 8 
  case CC_A(_, CC_B(_, _, _)) => 9 
  case CC_A(_, CC_C((_,_), _)) => 10 
  case CC_C((CC_A(_, _),CC_A(_, _)), _) => 11 
  case CC_C((CC_A(_, _),CC_B(_, _, _)), _) => 12 
  case CC_C((CC_A(_, _),CC_C(_, _)), _) => 13 
}
}
// This is not matched: CC_B(_, _, _)