package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_A[C, D], b: T_A[T_A[T_B, T_B], C], c: Boolean) extends T_A[T_A[T_B, T_B], C]
case class CC_B[E, F](a: (CC_A[T_B, Int],Boolean), b: (T_B,T_B), c: T_A[T_A[T_B, T_B], E]) extends T_A[T_A[T_B, T_B], E]
case class CC_C[G](a: G, b: T_A[T_A[T_B, T_B], G], c: T_A[T_A[T_B, T_B], G]) extends T_A[T_A[T_B, T_B], G]
case class CC_D(a: CC_B[CC_A[T_B, T_B], CC_B[T_B, T_B]], b: T_A[T_A[T_B, T_B], CC_A[T_B, T_B]]) extends T_B
case class CC_E(a: T_A[T_A[T_B, T_B], CC_B[(Char,Char), CC_D]], b: CC_A[Boolean, T_B]) extends T_B
case class CC_F(a: T_A[T_A[T_B, T_B], T_A[Byte, Byte]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_B((_,_), (_,_), CC_A(_, _, _)), _) => 0 
  case CC_D(CC_B((_,_), (_,_), CC_B(_, _, _)), _) => 1 
  case CC_D(CC_B((_,_), (_,_), CC_C(_, _, _)), _) => 2 
  case CC_E(CC_A(_, _, _), CC_A(_, CC_A(_, _, _), _)) => 3 
  case CC_E(CC_B(_, _, _), CC_A(_, CC_A(_, _, _), _)) => 4 
  case CC_E(CC_C(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), _)) => 5 
  case CC_E(CC_C(_, CC_B(_, _, _), CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), _)) => 6 
  case CC_E(CC_C(_, CC_C(_, _, _), CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), _)) => 7 
  case CC_E(CC_C(_, CC_A(_, _, _), CC_B(_, _, _)), CC_A(_, CC_A(_, _, _), _)) => 8 
  case CC_E(CC_C(_, CC_B(_, _, _), CC_B(_, _, _)), CC_A(_, CC_A(_, _, _), _)) => 9 
  case CC_E(CC_C(_, CC_C(_, _, _), CC_B(_, _, _)), CC_A(_, CC_A(_, _, _), _)) => 10 
  case CC_E(CC_C(_, CC_A(_, _, _), CC_C(_, _, _)), CC_A(_, CC_A(_, _, _), _)) => 11 
  case CC_E(CC_C(_, CC_B(_, _, _), CC_C(_, _, _)), CC_A(_, CC_A(_, _, _), _)) => 12 
  case CC_E(CC_C(_, CC_C(_, _, _), CC_C(_, _, _)), CC_A(_, CC_A(_, _, _), _)) => 13 
  case CC_E(CC_A(_, _, _), CC_A(_, CC_B(_, _, _), _)) => 14 
  case CC_E(CC_B(_, _, _), CC_A(_, CC_B(_, _, _), _)) => 15 
  case CC_E(CC_C(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, CC_B(_, _, _), _)) => 16 
  case CC_E(CC_C(_, CC_B(_, _, _), CC_A(_, _, _)), CC_A(_, CC_B(_, _, _), _)) => 17 
  case CC_E(CC_C(_, CC_C(_, _, _), CC_A(_, _, _)), CC_A(_, CC_B(_, _, _), _)) => 18 
  case CC_E(CC_C(_, CC_A(_, _, _), CC_B(_, _, _)), CC_A(_, CC_B(_, _, _), _)) => 19 
  case CC_E(CC_C(_, CC_B(_, _, _), CC_B(_, _, _)), CC_A(_, CC_B(_, _, _), _)) => 20 
  case CC_E(CC_C(_, CC_C(_, _, _), CC_B(_, _, _)), CC_A(_, CC_B(_, _, _), _)) => 21 
  case CC_E(CC_C(_, CC_A(_, _, _), CC_C(_, _, _)), CC_A(_, CC_B(_, _, _), _)) => 22 
  case CC_E(CC_C(_, CC_B(_, _, _), CC_C(_, _, _)), CC_A(_, CC_B(_, _, _), _)) => 23 
  case CC_E(CC_C(_, CC_C(_, _, _), CC_C(_, _, _)), CC_A(_, CC_B(_, _, _), _)) => 24 
  case CC_E(CC_A(_, _, _), CC_A(_, CC_C(_, _, _), _)) => 25 
  case CC_E(CC_B(_, _, _), CC_A(_, CC_C(_, _, _), _)) => 26 
  case CC_E(CC_C(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, CC_C(_, _, _), _)) => 27 
  case CC_E(CC_C(_, CC_B(_, _, _), CC_A(_, _, _)), CC_A(_, CC_C(_, _, _), _)) => 28 
  case CC_E(CC_C(_, CC_C(_, _, _), CC_A(_, _, _)), CC_A(_, CC_C(_, _, _), _)) => 29 
  case CC_E(CC_C(_, CC_A(_, _, _), CC_B(_, _, _)), CC_A(_, CC_C(_, _, _), _)) => 30 
  case CC_E(CC_C(_, CC_B(_, _, _), CC_B(_, _, _)), CC_A(_, CC_C(_, _, _), _)) => 31 
  case CC_E(CC_C(_, CC_C(_, _, _), CC_B(_, _, _)), CC_A(_, CC_C(_, _, _), _)) => 32 
  case CC_E(CC_C(_, CC_A(_, _, _), CC_C(_, _, _)), CC_A(_, CC_C(_, _, _), _)) => 33 
  case CC_E(CC_C(_, CC_B(_, _, _), CC_C(_, _, _)), CC_A(_, CC_C(_, _, _), _)) => 34 
  case CC_E(CC_C(_, CC_C(_, _, _), CC_C(_, _, _)), CC_A(_, CC_C(_, _, _), _)) => 35 
  case CC_F(CC_A(_, _, true)) => 36 
  case CC_F(CC_A(_, _, false)) => 37 
  case CC_F(CC_B(_, (_,_), _)) => 38 
  case CC_F(CC_C(_, CC_A(_, _, _), CC_A(_, _, _))) => 39 
  case CC_F(CC_C(_, CC_B(_, _, _), CC_A(_, _, _))) => 40 
  case CC_F(CC_C(_, CC_C(_, _, _), CC_A(_, _, _))) => 41 
  case CC_F(CC_C(_, CC_A(_, _, _), CC_B(_, _, _))) => 42 
  case CC_F(CC_C(_, CC_B(_, _, _), CC_B(_, _, _))) => 43 
  case CC_F(CC_C(_, CC_C(_, _, _), CC_B(_, _, _))) => 44 
  case CC_F(CC_C(_, CC_A(_, _, _), CC_C(_, _, _))) => 45 
  case CC_F(CC_C(_, CC_B(_, _, _), CC_C(_, _, _))) => 46 
  case CC_F(CC_C(_, CC_C(_, _, _), CC_C(_, _, _))) => 47 
}
}