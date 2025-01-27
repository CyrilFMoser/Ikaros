package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[T_A[Int, Byte], T_A[T_A[Int, Byte], T_A[Int, Byte]]], b: T_A[T_A[Int, (Char,Boolean)], T_A[Byte, Byte]], c: (T_A[Char, Boolean],T_A[Byte, (Int,Int)])) extends T_A[T_A[CC_A[Boolean], T_A[CC_A[Boolean], CC_A[Boolean]]], T_A[T_A[CC_A[Boolean], T_A[CC_A[Boolean], CC_A[Boolean]]], T_A[CC_A[Boolean], T_A[CC_A[Boolean], CC_A[Boolean]]]]]
case class CC_C(a: CC_B, b: CC_B, c: CC_A[Char]) extends T_A[T_A[CC_A[Boolean], T_A[CC_A[Boolean], CC_A[Boolean]]], T_A[T_A[CC_A[Boolean], T_A[CC_A[Boolean], CC_A[Boolean]]], T_A[CC_A[Boolean], T_A[CC_A[Boolean], CC_A[Boolean]]]]]

val v_a: T_A[T_A[CC_A[Boolean], T_A[CC_A[Boolean], CC_A[Boolean]]], T_A[T_A[CC_A[Boolean], T_A[CC_A[Boolean], CC_A[Boolean]]], T_A[CC_A[Boolean], T_A[CC_A[Boolean], CC_A[Boolean]]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_C(_, _, _))) => 1 
  case CC_A(CC_B(_, _, (_,_))) => 2 
  case CC_A(CC_C(_, _, _)) => 3 
  case CC_B(_, _, _) => 4 
  case CC_C(CC_B(CC_A(_), _, (_,_)), CC_B(_, _, _), _) => 5 
}
}
// This is not matched: CC_A(CC_A(CC_B(_, _, _)))