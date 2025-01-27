package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Char, Boolean],T_A[Char, Boolean])) extends T_A[Char, C]
case class CC_B(a: T_A[Boolean, T_A[Char, Char]], b: T_A[Char, Char], c: T_A[Char, Char]) extends T_A[Char, Char]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_),CC_A(_))) => 0 
  case CC_B(_, CC_A((_,_)), CC_A((_,_))) => 1 
  case CC_B(_, CC_A((_,_)), CC_B(_, _, CC_A(_))) => 2 
  case CC_B(_, CC_A((_,_)), CC_B(_, _, CC_B(_, _, _))) => 3 
  case CC_B(_, CC_B(_, CC_A(_), _), CC_A((_,_))) => 4 
  case CC_B(_, CC_B(_, CC_A(_), _), CC_B(_, _, CC_A(_))) => 5 
  case CC_B(_, CC_B(_, CC_A(_), _), CC_B(_, _, CC_B(_, _, _))) => 6 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), CC_A((_,_))) => 7 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), CC_B(_, _, CC_A(_))) => 8 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), CC_B(_, _, CC_B(_, _, _))) => 9 
}
}