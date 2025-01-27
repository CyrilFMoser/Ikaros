package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D], c: D) extends T_A[D]
case class CC_B[E](a: T_A[T_B[E, E]], b: T_A[E]) extends T_A[E]
case class CC_C(a: CC_B[T_A[Boolean]], b: T_A[T_A[Boolean]], c: CC_B[Int]) extends T_A[T_A[CC_B[Boolean]]]
case class CC_D(a: (CC_A[CC_C],T_A[CC_C]), b: CC_B[CC_C], c: T_B[Boolean, T_A[CC_C]]) extends T_B[T_A[T_A[CC_C]], Char]

val v_a: T_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_C(_, _, _)), _) => 0 
  case CC_A(CC_B(_, CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_C(_, _, _)), _) => 1 
  case CC_A(CC_B(_, CC_B(_, _)), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_C(_, _, _)), _) => 2 
  case CC_A(CC_A(_, _, _), CC_A(CC_A(_, _, _), CC_B(_, _), CC_C(_, _, _)), _) => 3 
  case CC_A(CC_B(_, CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_B(_, _), CC_C(_, _, _)), _) => 4 
  case CC_A(CC_B(_, CC_B(_, _)), CC_A(CC_A(_, _, _), CC_B(_, _), CC_C(_, _, _)), _) => 5 
  case CC_A(CC_A(_, _, _), CC_A(CC_B(_, _), CC_A(_, _, _), CC_C(_, _, _)), _) => 6 
  case CC_A(CC_B(_, CC_A(_, _, _)), CC_A(CC_B(_, _), CC_A(_, _, _), CC_C(_, _, _)), _) => 7 
  case CC_A(CC_B(_, CC_B(_, _)), CC_A(CC_B(_, _), CC_A(_, _, _), CC_C(_, _, _)), _) => 8 
  case CC_A(CC_A(_, _, _), CC_A(CC_B(_, _), CC_B(_, _), CC_C(_, _, _)), _) => 9 
  case CC_A(CC_B(_, CC_A(_, _, _)), CC_A(CC_B(_, _), CC_B(_, _), CC_C(_, _, _)), _) => 10 
  case CC_A(CC_B(_, CC_B(_, _)), CC_A(CC_B(_, _), CC_B(_, _), CC_C(_, _, _)), _) => 11 
  case CC_A(CC_A(_, _, _), CC_B(_, _), _) => 12 
  case CC_A(CC_B(_, CC_A(_, _, _)), CC_B(_, _), _) => 13 
  case CC_A(CC_B(_, CC_B(_, _)), CC_B(_, _), _) => 14 
  case CC_B(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(CC_A(_, _, _), _, _)) => 15 
  case CC_B(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(CC_B(_, _), _, _)) => 16 
  case CC_B(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_B(_, _)) => 17 
  case CC_B(CC_A(CC_B(_, _), CC_A(_, _, _), _), CC_A(CC_A(_, _, _), _, _)) => 18 
  case CC_B(CC_A(CC_B(_, _), CC_A(_, _, _), _), CC_A(CC_B(_, _), _, _)) => 19 
  case CC_B(CC_A(CC_B(_, _), CC_A(_, _, _), _), CC_B(_, _)) => 20 
  case CC_B(CC_A(CC_A(_, _, _), CC_B(_, _), _), CC_A(CC_A(_, _, _), _, _)) => 21 
  case CC_B(CC_A(CC_A(_, _, _), CC_B(_, _), _), CC_A(CC_B(_, _), _, _)) => 22 
  case CC_B(CC_A(CC_A(_, _, _), CC_B(_, _), _), CC_B(_, _)) => 23 
  case CC_B(CC_A(CC_B(_, _), CC_B(_, _), _), CC_A(CC_A(_, _, _), _, _)) => 24 
  case CC_B(CC_A(CC_B(_, _), CC_B(_, _), _), CC_A(CC_B(_, _), _, _)) => 25 
  case CC_B(CC_A(CC_B(_, _), CC_B(_, _), _), CC_B(_, _)) => 26 
  case CC_B(CC_B(_, _), CC_A(CC_A(_, _, _), _, _)) => 27 
  case CC_B(CC_B(_, _), CC_A(CC_B(_, _), _, _)) => 28 
  case CC_B(CC_B(_, _), CC_B(_, _)) => 29 
}
}