package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: T_A[Char], c: Boolean) extends T_A[Char]
case class CC_B(a: T_A[T_A[Char]], b: T_A[Char], c: CC_A) extends T_A[Char]
case class CC_C(a: (T_A[Char],T_A[Char])) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _) => 1 
  case CC_A(_, CC_A(CC_C(_), CC_A(_, _, _), _), _) => 2 
  case CC_A(_, CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _) => 3 
  case CC_A(_, CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _) => 4 
  case CC_A(_, CC_A(CC_C(_), CC_B(_, _, _), _), _) => 5 
  case CC_A(_, CC_A(CC_A(_, _, _), CC_C(_), _), _) => 6 
  case CC_A(_, CC_A(CC_B(_, _, _), CC_C(_), _), _) => 7 
  case CC_A(_, CC_A(CC_C(_), CC_C(_), _), _) => 8 
  case CC_A(_, CC_B(_, _, _), _) => 9 
  case CC_A(_, CC_C((_,_)), _) => 10 
  case CC_B(_, _, _) => 11 
  case CC_C(_) => 12 
}
}