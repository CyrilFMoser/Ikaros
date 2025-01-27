package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: Char, b: D) extends T_A[D, T_A[D, D]]
case class CC_C(a: (T_A[(Byte,Char), Byte],CC_A[Char]), b: (Int,T_A[(Boolean,Boolean), (Byte,Boolean)]), c: CC_B[(Char,Boolean)]) extends T_A[T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]], T_A[T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]], T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]]]]

val v_a: T_A[T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]], T_A[T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]], T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_B(_, _), CC_A(_, _))) => 1 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_A(_, _), CC_B(_, _))) => 2 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_B(_, _), CC_B(_, _))) => 3 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_A(_, _), CC_C(_, _, _))) => 4 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_B(_, _), CC_C(_, _, _))) => 5 
  case CC_A(CC_A(_, CC_A(_, _)), CC_B(_, CC_A(_, _))) => 6 
  case CC_A(CC_A(_, CC_A(_, _)), CC_B(_, CC_B(_, _))) => 7 
  case CC_A(CC_A(_, CC_A(_, _)), CC_C((_,_), _, CC_B(_, _))) => 8 
  case CC_A(CC_A(_, CC_B(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 9 
  case CC_A(CC_A(_, CC_B(_, _)), CC_A(CC_B(_, _), CC_A(_, _))) => 10 
  case CC_A(CC_A(_, CC_B(_, _)), CC_A(CC_A(_, _), CC_B(_, _))) => 11 
  case CC_A(CC_A(_, CC_B(_, _)), CC_A(CC_B(_, _), CC_B(_, _))) => 12 
  case CC_A(CC_A(_, CC_B(_, _)), CC_A(CC_A(_, _), CC_C(_, _, _))) => 13 
  case CC_A(CC_A(_, CC_B(_, _)), CC_A(CC_B(_, _), CC_C(_, _, _))) => 14 
  case CC_A(CC_A(_, CC_B(_, _)), CC_B(_, CC_A(_, _))) => 15 
  case CC_A(CC_A(_, CC_B(_, _)), CC_B(_, CC_B(_, _))) => 16 
  case CC_A(CC_A(_, CC_B(_, _)), CC_C((_,_), _, CC_B(_, _))) => 17 
  case CC_A(CC_B(_, _), CC_A(CC_A(_, _), CC_A(_, _))) => 18 
  case CC_A(CC_B(_, _), CC_A(CC_B(_, _), CC_A(_, _))) => 19 
  case CC_A(CC_B(_, _), CC_A(CC_A(_, _), CC_B(_, _))) => 20 
  case CC_A(CC_B(_, _), CC_A(CC_B(_, _), CC_B(_, _))) => 21 
  case CC_A(CC_B(_, _), CC_A(CC_A(_, _), CC_C(_, _, _))) => 22 
  case CC_A(CC_B(_, _), CC_A(CC_B(_, _), CC_C(_, _, _))) => 23 
  case CC_A(CC_B(_, _), CC_B(_, CC_A(_, _))) => 24 
  case CC_A(CC_B(_, _), CC_B(_, CC_B(_, _))) => 25 
  case CC_A(CC_B(_, _), CC_C((_,_), _, CC_B(_, _))) => 26 
  case CC_B(_, CC_A(_, _)) => 27 
  case CC_B(_, CC_B(_, _)) => 28 
  case CC_C(_, _, _) => 29 
}
}