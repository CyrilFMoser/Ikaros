package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B() extends T_A[T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]], T_A[T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]], T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]]]]
case class CC_C(a: CC_B, b: Byte, c: T_A[Char, CC_A[CC_B]]) extends T_A[T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]], T_A[T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]], T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]]]]

val v_a: T_A[T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]], T_A[T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]], T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(), _), _) => 1 
  case CC_A(CC_A(CC_C(_, _, _), _), _) => 2 
  case CC_A(CC_B(), _) => 3 
  case CC_A(CC_C(_, _, _), _) => 4 
  case CC_B() => 5 
  case CC_C(CC_B(), _, _) => 6 
}
}