package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_A[Int, C]) extends T_A[D, C]
case class CC_B[F, E](a: T_A[E, CC_A[F, F]], b: T_A[F, T_B], c: Boolean) extends T_A[F, E]
case class CC_C() extends T_A[CC_A[CC_A[Byte, T_B], T_A[T_B, T_B]], T_A[T_A[(Boolean,Char), T_B], T_B]]
case class CC_D(a: Int, b: CC_B[T_A[CC_C, Int], T_A[Byte, Char]]) extends T_B

val v_a: T_A[CC_A[CC_A[Byte, T_B], T_A[T_B, T_B]], T_A[T_A[(Boolean,Char), T_B], T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_B(CC_A(_), CC_A(_), true)) => 2 
  case CC_A(CC_B(CC_A(_), CC_A(_), false)) => 3 
  case CC_A(CC_B(CC_A(_), CC_B(_, _, _), true)) => 4 
  case CC_A(CC_B(CC_A(_), CC_B(_, _, _), false)) => 5 
  case CC_A(CC_B(CC_B(_, _, _), CC_A(_), true)) => 6 
  case CC_A(CC_B(CC_B(_, _, _), CC_A(_), false)) => 7 
  case CC_A(CC_B(CC_B(_, _, _), CC_B(_, _, _), true)) => 8 
  case CC_A(CC_B(CC_B(_, _, _), CC_B(_, _, _), false)) => 9 
  case CC_B(CC_A(CC_A(_)), CC_A(CC_A(_)), _) => 10 
  case CC_B(CC_A(CC_A(_)), CC_A(CC_B(_, _, _)), _) => 11 
  case CC_B(CC_A(CC_A(_)), CC_B(CC_A(_), _, true), _) => 12 
  case CC_B(CC_A(CC_A(_)), CC_B(CC_B(_, _, _), _, true), _) => 13 
  case CC_B(CC_A(CC_A(_)), CC_B(CC_A(_), _, false), _) => 14 
  case CC_B(CC_A(CC_A(_)), CC_B(CC_B(_, _, _), _, false), _) => 15 
  case CC_B(CC_A(CC_B(_, _, _)), CC_A(CC_A(_)), _) => 16 
  case CC_B(CC_A(CC_B(_, _, _)), CC_A(CC_B(_, _, _)), _) => 17 
  case CC_B(CC_A(CC_B(_, _, _)), CC_B(CC_A(_), _, true), _) => 18 
  case CC_B(CC_A(CC_B(_, _, _)), CC_B(CC_B(_, _, _), _, true), _) => 19 
  case CC_B(CC_A(CC_B(_, _, _)), CC_B(CC_A(_), _, false), _) => 20 
  case CC_B(CC_A(CC_B(_, _, _)), CC_B(CC_B(_, _, _), _, false), _) => 21 
  case CC_B(CC_B(CC_A(_), CC_A(_), _), CC_A(CC_A(_)), _) => 22 
  case CC_B(CC_B(CC_A(_), CC_A(_), _), CC_A(CC_B(_, _, _)), _) => 23 
  case CC_B(CC_B(CC_A(_), CC_A(_), _), CC_B(CC_A(_), _, true), _) => 24 
  case CC_B(CC_B(CC_A(_), CC_A(_), _), CC_B(CC_B(_, _, _), _, true), _) => 25 
  case CC_B(CC_B(CC_A(_), CC_A(_), _), CC_B(CC_A(_), _, false), _) => 26 
  case CC_B(CC_B(CC_A(_), CC_A(_), _), CC_B(CC_B(_, _, _), _, false), _) => 27 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_), _), CC_A(CC_A(_)), _) => 28 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_), _), CC_A(CC_B(_, _, _)), _) => 29 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_), _), CC_B(CC_A(_), _, true), _) => 30 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_), _), CC_B(CC_B(_, _, _), _, true), _) => 31 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_), _), CC_B(CC_A(_), _, false), _) => 32 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_), _), CC_B(CC_B(_, _, _), _, false), _) => 33 
  case CC_B(CC_B(CC_A(_), CC_B(_, _, _), _), CC_A(CC_A(_)), _) => 34 
  case CC_B(CC_B(CC_A(_), CC_B(_, _, _), _), CC_A(CC_B(_, _, _)), _) => 35 
  case CC_B(CC_B(CC_A(_), CC_B(_, _, _), _), CC_B(CC_A(_), _, true), _) => 36 
  case CC_B(CC_B(CC_A(_), CC_B(_, _, _), _), CC_B(CC_B(_, _, _), _, true), _) => 37 
  case CC_B(CC_B(CC_A(_), CC_B(_, _, _), _), CC_B(CC_A(_), _, false), _) => 38 
  case CC_B(CC_B(CC_A(_), CC_B(_, _, _), _), CC_B(CC_B(_, _, _), _, false), _) => 39 
  case CC_B(CC_B(CC_B(_, _, _), CC_B(_, _, _), _), CC_A(CC_A(_)), _) => 40 
  case CC_B(CC_B(CC_B(_, _, _), CC_B(_, _, _), _), CC_A(CC_B(_, _, _)), _) => 41 
  case CC_B(CC_B(CC_B(_, _, _), CC_B(_, _, _), _), CC_B(CC_A(_), _, true), _) => 42 
  case CC_B(CC_B(CC_B(_, _, _), CC_B(_, _, _), _), CC_B(CC_B(_, _, _), _, true), _) => 43 
  case CC_B(CC_B(CC_B(_, _, _), CC_B(_, _, _), _), CC_B(CC_A(_), _, false), _) => 44 
  case CC_B(CC_B(CC_B(_, _, _), CC_B(_, _, _), _), CC_B(CC_B(_, _, _), _, false), _) => 45 
  case CC_C() => 46 
}
}