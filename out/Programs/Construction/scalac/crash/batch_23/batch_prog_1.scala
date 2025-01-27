package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C]) extends T_A[B]
case class CC_B[D](a: T_A[T_A[D]], b: D) extends T_A[D]
case class CC_C[E](a: (Boolean,T_A[(Boolean,Byte)]), b: T_A[E]) extends T_A[E]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), true) => 1 
  case CC_B(CC_B(CC_A(_), CC_A(_)), true) => 2 
  case CC_B(CC_B(CC_A(_), CC_B(_, _)), true) => 3 
  case CC_B(CC_B(CC_A(_), CC_C(_, _)), true) => 4 
  case CC_B(CC_B(CC_B(_, _), CC_A(_)), true) => 5 
  case CC_B(CC_B(CC_B(_, _), CC_B(_, _)), true) => 6 
  case CC_B(CC_B(CC_B(_, _), CC_C(_, _)), true) => 7 
  case CC_B(CC_B(CC_C(_, _), CC_A(_)), true) => 8 
  case CC_B(CC_B(CC_C(_, _), CC_B(_, _)), true) => 9 
  case CC_B(CC_B(CC_C(_, _), CC_C(_, _)), true) => 10 
  case CC_B(CC_C((_,_), _), true) => 11 
  case CC_B(CC_A(_), false) => 12 
  case CC_B(CC_B(CC_A(_), CC_A(_)), false) => 13 
  case CC_B(CC_B(CC_A(_), CC_B(_, _)), false) => 14 
  case CC_B(CC_B(CC_A(_), CC_C(_, _)), false) => 15 
  case CC_B(CC_B(CC_B(_, _), CC_A(_)), false) => 16 
  case CC_B(CC_B(CC_B(_, _), CC_B(_, _)), false) => 17 
  case CC_B(CC_B(CC_B(_, _), CC_C(_, _)), false) => 18 
  case CC_B(CC_B(CC_C(_, _), CC_A(_)), false) => 19 
  case CC_B(CC_B(CC_C(_, _), CC_B(_, _)), false) => 20 
  case CC_B(CC_B(CC_C(_, _), CC_C(_, _)), false) => 21 
  case CC_B(CC_C((_,_), _), false) => 22 
  case CC_C((_,CC_A(_)), CC_A(_)) => 23 
  case CC_C((_,CC_B(_, _)), CC_A(_)) => 24 
  case CC_C((_,CC_C(_, _)), CC_A(_)) => 25 
  case CC_C((_,CC_A(_)), CC_B(CC_A(_), _)) => 26 
  case CC_C((_,CC_B(_, _)), CC_B(CC_A(_), _)) => 27 
  case CC_C((_,CC_C(_, _)), CC_B(CC_A(_), _)) => 28 
  case CC_C((_,CC_A(_)), CC_B(CC_B(_, _), _)) => 29 
  case CC_C((_,CC_B(_, _)), CC_B(CC_B(_, _), _)) => 30 
  case CC_C((_,CC_C(_, _)), CC_B(CC_B(_, _), _)) => 31 
  case CC_C((_,CC_A(_)), CC_B(CC_C(_, _), _)) => 32 
  case CC_C((_,CC_B(_, _)), CC_B(CC_C(_, _), _)) => 33 
  case CC_C((_,CC_C(_, _)), CC_B(CC_C(_, _), _)) => 34 
  case CC_C((_,CC_A(_)), CC_C((_,_), CC_A(_))) => 35 
  case CC_C((_,CC_B(_, _)), CC_C((_,_), CC_A(_))) => 36 
  case CC_C((_,CC_C(_, _)), CC_C((_,_), CC_A(_))) => 37 
  case CC_C((_,CC_A(_)), CC_C((_,_), CC_B(_, _))) => 38 
  case CC_C((_,CC_B(_, _)), CC_C((_,_), CC_B(_, _))) => 39 
  case CC_C((_,CC_C(_, _)), CC_C((_,_), CC_B(_, _))) => 40 
  case CC_C((_,CC_A(_)), CC_C((_,_), CC_C(_, _))) => 41 
  case CC_C((_,CC_B(_, _)), CC_C((_,_), CC_C(_, _))) => 42 
  case CC_C((_,CC_C(_, _)), CC_C((_,_), CC_C(_, _))) => 43 
}
}