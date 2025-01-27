package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Boolean, T_A[Char, Int]], b: T_A[Boolean, T_A[Char, Int]], c: (T_A[Boolean, Boolean],T_A[Char, Boolean])) extends T_A[Boolean, T_A[Char, Int]]
case class CC_B(a: T_A[Int, T_A[CC_A, CC_A]]) extends T_A[T_A[CC_A, Boolean], Char]
case class CC_C(a: ((CC_A,CC_A),CC_A), b: T_A[Boolean, T_A[Char, Int]], c: T_A[CC_A, CC_B]) extends T_A[Boolean, T_A[Char, Int]]

val v_a: T_A[Boolean, T_A[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_C((_,_), CC_A(_, _, _), _), _, _) => 1 
  case CC_A(CC_C((_,_), CC_C(_, _, _), _), _, _) => 2 
  case CC_C(_, _, _) => 3 
}
}