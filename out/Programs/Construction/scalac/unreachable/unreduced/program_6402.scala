package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[Char]], b: T_A[Char], c: T_A[Char]) extends T_A[Char]
case class CC_B(a: T_A[T_A[T_B]], b: T_A[Char]) extends T_A[Char]
case class CC_C(a: (T_A[(Char,Boolean)],T_B)) extends T_A[Char]
case class CC_D(a: T_B) extends T_B
case class CC_E(a: T_A[Char], b: (CC_B,T_A[Char])) extends T_B

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 1 
  case CC_B(_, CC_A(_, CC_C(_), CC_A(_, _, _))) => 2 
  case CC_B(_, CC_A(_, CC_A(_, _, _), CC_B(_, _))) => 3 
  case CC_B(_, CC_A(_, CC_B(_, _), CC_B(_, _))) => 4 
  case CC_B(_, CC_A(_, CC_C(_), CC_B(_, _))) => 5 
  case CC_B(_, CC_A(_, CC_A(_, _, _), CC_C(_))) => 6 
  case CC_B(_, CC_A(_, CC_B(_, _), CC_C(_))) => 7 
  case CC_B(_, CC_A(_, CC_C(_), CC_C(_))) => 8 
  case CC_B(_, CC_B(_, CC_A(_, _, _))) => 9 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 10 
  case CC_B(_, CC_B(_, CC_C(_))) => 11 
  case CC_B(_, CC_C((_,_))) => 12 
  case CC_C(_) => 13 
}
}
// This is not matched: CC_B(_, CC_A(_, CC_B(_, _), CC_A(_, _, _)))