package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: T_A[T_A[Char]], c: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_B(a: (T_A[Byte],T_A[CC_A])) extends T_A[T_A[Char]]
case class CC_C(a: T_A[T_A[Char]], b: Byte) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((_,_)) => 1 
  case CC_C(CC_A(_, _, CC_A(_, _, _)), 0) => 2 
  case CC_C(CC_A(_, _, CC_B(_)), 0) => 3 
  case CC_C(CC_A(_, _, CC_C(_, _)), 0) => 4 
  case CC_C(CC_B(_), 0) => 5 
  case CC_C(CC_C(CC_A(_, _, _), _), 0) => 6 
  case CC_C(CC_C(CC_B(_), _), 0) => 7 
  case CC_C(CC_C(CC_C(_, _), _), 0) => 8 
  case CC_C(CC_A(_, _, CC_A(_, _, _)), _) => 9 
  case CC_C(CC_A(_, _, CC_B(_)), _) => 10 
  case CC_C(CC_A(_, _, CC_C(_, _)), _) => 11 
  case CC_C(CC_B(_), _) => 12 
  case CC_C(CC_C(CC_A(_, _, _), _), _) => 13 
  case CC_C(CC_C(CC_B(_), _), _) => 14 
  case CC_C(CC_C(CC_C(_, _), _), _) => 15 
}
}