package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_B, c: T_B) extends T_A[T_A[T_A[T_B, T_B], T_A[Int, T_B]], T_B]
case class CC_B(a: T_B, b: T_A[CC_A[Byte], Char], c: CC_A[T_B]) extends T_A[T_A[T_A[T_B, T_B], T_A[Int, T_B]], T_B]
case class CC_C(a: Char, b: T_B, c: (T_B,CC_A[Byte])) extends T_B
case class CC_D(a: ((T_B,(Char,Char)),CC_B), b: Boolean) extends T_B

val v_a: T_A[T_A[T_A[T_B, T_B], T_A[Int, T_B]], T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C(_, CC_C(_, _, _), _)) => 0 
  case CC_A(_, _, CC_C(_, CC_D(_, _), _)) => 1 
  case CC_A(_, _, CC_D((_,_), true)) => 2 
  case CC_A(_, _, CC_D((_,_), false)) => 3 
  case CC_B(CC_C(_, CC_C(_, _, _), (_,_)), _, CC_A(CC_C(_, _, _), CC_C(_, _, _), _)) => 4 
  case CC_B(CC_C(_, CC_C(_, _, _), (_,_)), _, CC_A(CC_D(_, _), CC_C(_, _, _), _)) => 5 
  case CC_B(CC_C(_, CC_C(_, _, _), (_,_)), _, CC_A(CC_C(_, _, _), CC_D(_, _), _)) => 6 
  case CC_B(CC_C(_, CC_C(_, _, _), (_,_)), _, CC_A(CC_D(_, _), CC_D(_, _), _)) => 7 
  case CC_B(CC_C(_, CC_D(_, _), (_,_)), _, CC_A(CC_C(_, _, _), CC_C(_, _, _), _)) => 8 
  case CC_B(CC_C(_, CC_D(_, _), (_,_)), _, CC_A(CC_D(_, _), CC_C(_, _, _), _)) => 9 
  case CC_B(CC_C(_, CC_D(_, _), (_,_)), _, CC_A(CC_C(_, _, _), CC_D(_, _), _)) => 10 
  case CC_B(CC_C(_, CC_D(_, _), (_,_)), _, CC_A(CC_D(_, _), CC_D(_, _), _)) => 11 
  case CC_B(CC_D(_, _), _, CC_A(CC_C(_, _, _), CC_C(_, _, _), _)) => 12 
  case CC_B(CC_D(_, _), _, CC_A(CC_D(_, _), CC_C(_, _, _), _)) => 13 
  case CC_B(CC_D(_, _), _, CC_A(CC_C(_, _, _), CC_D(_, _), _)) => 14 
  case CC_B(CC_D(_, _), _, CC_A(CC_D(_, _), CC_D(_, _), _)) => 15 
}
}