package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_B,Char), b: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: CC_A, b: T_B, c: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: T_B, b: (T_A[CC_A],CC_A)) extends T_A[T_B]

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(CC_A(_, _), _, CC_A((_,_), CC_A(_, _))) => 1 
  case CC_B(CC_A(_, _), _, CC_A((_,_), CC_B(_, _, _))) => 2 
  case CC_B(CC_A(_, _), _, CC_A((_,_), CC_C(_, _))) => 3 
  case CC_B(CC_A(_, _), _, CC_B(CC_A(_, _), _, _)) => 4 
  case CC_B(CC_A(_, _), _, CC_C(_, (_,_))) => 5 
  case CC_C(_, (_,CC_A(_, _))) => 6 
}
}