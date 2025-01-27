package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[(Char,Byte)]]) extends T_A[Byte]
case class CC_B(a: (CC_A,(Byte,CC_A)), b: T_A[Byte], c: T_A[Byte]) extends T_A[Byte]
case class CC_C(a: (CC_B,CC_B)) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((_,_), CC_A(_, _), CC_B(_, _, _)) => 1 
  case CC_B((_,_), CC_A(_, _), CC_C(_)) => 2 
  case CC_B((_,_), CC_B(_, _, _), CC_A(_, _)) => 3 
  case CC_B((_,_), CC_B(_, _, _), CC_B(_, _, _)) => 4 
  case CC_B((_,_), CC_B(_, _, _), CC_C(_)) => 5 
  case CC_B((_,_), CC_C(_), CC_A(_, _)) => 6 
  case CC_B((_,_), CC_C(_), CC_B(_, _, _)) => 7 
  case CC_B((_,_), CC_C(_), CC_C(_)) => 8 
  case CC_C((_,_)) => 9 
}
}
// This is not matched: CC_B((_,_), CC_A(_, _), CC_A(_, _))