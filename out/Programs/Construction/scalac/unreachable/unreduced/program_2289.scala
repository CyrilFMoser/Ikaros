package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Char, Boolean], Boolean], b: T_A[C, Boolean], c: T_A[C, Boolean]) extends T_A[C, Boolean]
case class CC_B[E](a: (T_A[Boolean, Boolean],T_A[Boolean, Boolean]), b: CC_A[E], c: T_A[E, E]) extends T_A[E, Boolean]
case class CC_C(a: CC_A[CC_A[Char]], b: T_A[T_A[Byte, Boolean], T_A[Byte, Boolean]], c: T_A[CC_A[Boolean], Boolean]) extends T_A[T_A[CC_B[Char], Boolean], Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_A(_, CC_B(_, _, _), CC_A(CC_A(_, _, _), _, _)) => 1 
  case CC_A(_, CC_A(_, _, _), CC_A(CC_B(_, _, _), _, _)) => 2 
  case CC_A(_, CC_B(_, _, _), CC_A(CC_B(_, _, _), _, _)) => 3 
  case CC_A(_, CC_A(_, _, _), CC_B(_, CC_A(_, _, _), _)) => 4 
  case CC_A(_, CC_B(_, _, _), CC_B(_, CC_A(_, _, _), _)) => 5 
  case CC_B((CC_A(_, _, _),CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), _) => 6 
  case CC_B((CC_A(_, _, _),CC_B(_, _, _)), CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), _) => 7 
  case CC_B((CC_B(_, _, _),CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), _) => 8 
  case CC_B((CC_B(_, _, _),CC_B(_, _, _)), CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), _) => 9 
  case CC_B((CC_A(_, _, _),CC_A(_, _, _)), CC_A(_, CC_B(_, _, _), CC_A(_, _, _)), _) => 10 
  case CC_B((CC_A(_, _, _),CC_B(_, _, _)), CC_A(_, CC_B(_, _, _), CC_A(_, _, _)), _) => 11 
  case CC_B((CC_B(_, _, _),CC_A(_, _, _)), CC_A(_, CC_B(_, _, _), CC_A(_, _, _)), _) => 12 
  case CC_B((CC_B(_, _, _),CC_B(_, _, _)), CC_A(_, CC_B(_, _, _), CC_A(_, _, _)), _) => 13 
  case CC_B((CC_A(_, _, _),CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_B(_, _, _)), _) => 14 
  case CC_B((CC_A(_, _, _),CC_B(_, _, _)), CC_A(_, CC_A(_, _, _), CC_B(_, _, _)), _) => 15 
  case CC_B((CC_B(_, _, _),CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_B(_, _, _)), _) => 16 
  case CC_B((CC_B(_, _, _),CC_B(_, _, _)), CC_A(_, CC_A(_, _, _), CC_B(_, _, _)), _) => 17 
  case CC_B((CC_A(_, _, _),CC_A(_, _, _)), CC_A(_, CC_B(_, _, _), CC_B(_, _, _)), _) => 18 
  case CC_B((CC_A(_, _, _),CC_B(_, _, _)), CC_A(_, CC_B(_, _, _), CC_B(_, _, _)), _) => 19 
  case CC_B((CC_B(_, _, _),CC_A(_, _, _)), CC_A(_, CC_B(_, _, _), CC_B(_, _, _)), _) => 20 
  case CC_B((CC_B(_, _, _),CC_B(_, _, _)), CC_A(_, CC_B(_, _, _), CC_B(_, _, _)), _) => 21 
}
}