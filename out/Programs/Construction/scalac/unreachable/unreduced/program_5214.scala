package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: CC_A, b: (Int,(CC_A,T_A))) extends T_A
case class CC_C(a: CC_B, b: (T_A,T_B[CC_A, CC_A]), c: (T_A,CC_A)) extends T_A
case class CC_D[C](a: (Byte,CC_A), b: CC_C, c: Boolean) extends T_B[T_A, C]
case class CC_E(a: Int, b: CC_A, c: T_A) extends T_B[T_A, (T_B[CC_C, CC_C],CC_B)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_A(CC_B(_, _), CC_A(_, _)) => 1 
  case CC_A(CC_C(_, (_,_), (_,_)), CC_A(_, _)) => 2 
  case CC_A(CC_A(_, _), CC_B(_, (_,_))) => 3 
  case CC_A(CC_B(_, _), CC_B(_, (_,_))) => 4 
  case CC_A(CC_C(_, (_,_), (_,_)), CC_B(_, (_,_))) => 5 
  case CC_A(CC_A(_, _), CC_C(_, _, _)) => 6 
  case CC_A(CC_B(_, _), CC_C(_, _, _)) => 7 
  case CC_A(CC_C(_, (_,_), (_,_)), CC_C(_, _, _)) => 8 
  case CC_B(_, _) => 9 
  case CC_C(_, (CC_A(_, _),_), _) => 10 
  case CC_C(_, (CC_C(_, _, _),_), _) => 11 
}
}
// This is not matched: CC_C(_, (CC_B(_, _),_), _)