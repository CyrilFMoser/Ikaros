package Program_8 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C], b: (Byte,T_B), c: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C[E](a: CC_B[T_B], b: T_B, c: CC_A[E]) extends T_A[T_B, E]
case class CC_D(a: CC_A[T_B]) extends T_B
case class CC_E[F]() extends T_B
case class CC_F() extends T_B

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C(_, _, _)) => 0 
  case CC_A(CC_A(_, _, _), (_,CC_F()), CC_B()) => 1 
  case CC_A(CC_B(), (0,CC_D(_)), CC_B()) => 2 
  case CC_A(_, (0,CC_E()), CC_B()) => 3 
  case CC_A(CC_C(_, _, _), (_,CC_F()), CC_B()) => 4 
  case CC_A(_, (0,CC_F()), CC_C(_, _, _)) => 5 
  case CC_A(CC_A(_, _, _), _, _) => 6 
  case CC_A(CC_A(_, _, _), (0,CC_E()), _) => 7 
  case CC_A(_, (_,CC_F()), _) => 8 
  case CC_A(CC_C(_, _, _), (0,CC_E()), _) => 9 
  case CC_A(CC_A(_, _, _), (0,CC_D(_)), CC_A(_, _, _)) => 10 
  case CC_A(CC_C(_, _, _), (_,CC_F()), CC_A(_, _, _)) => 11 
  case CC_A(CC_B(), (_,CC_D(_)), _) => 12 
  case CC_A(CC_A(_, _, _), (_,CC_D(_)), CC_C(_, _, _)) => 13 
  case CC_A(CC_A(_, _, _), (_,CC_F()), CC_C(_, _, _)) => 14 
  case CC_A(CC_C(_, _, _), (_,CC_E()), _) => 15 
  case CC_A(CC_A(_, _, _), (_,CC_F()), _) => 16 
  case CC_A(CC_A(_, _, _), (0,CC_F()), CC_B()) => 17 
  case CC_A(CC_C(_, _, _), (0,CC_F()), CC_B()) => 18 
  case CC_A(CC_B(), (_,CC_F()), CC_B()) => 19 
  case CC_A(_, (_,CC_E()), CC_A(_, _, _)) => 20 
  case CC_A(_, (_,CC_D(_)), CC_B()) => 21 
  case CC_A(CC_B(), (_,CC_E()), CC_A(_, _, _)) => 22 
  case CC_A(CC_A(_, _, _), (_,CC_F()), CC_A(_, _, _)) => 23 
  case CC_A(_, (0,CC_F()), CC_B()) => 24 
  case CC_A(CC_B(), (_,CC_F()), _) => 25 
  case CC_A(CC_B(), (0,CC_D(_)), CC_C(_, _, _)) => 26 
  case CC_A(CC_B(), (_,CC_D(_)), CC_C(_, _, _)) => 27 
  case CC_A(CC_C(_, _, _), (0,CC_E()), CC_C(_, _, _)) => 28 
  case CC_A(CC_B(), (0,CC_F()), CC_B()) => 29 
  case CC_A(CC_C(_, _, _), _, CC_C(_, _, _)) => 30 
  case CC_A(CC_B(), _, CC_C(_, _, _)) => 31 
  case CC_A(CC_B(), _, _) => 32 
  case CC_A(_, _, CC_A(_, _, _)) => 33 
  case CC_A(CC_A(_, _, _), (_,CC_E()), CC_B()) => 34 
  case CC_A(CC_C(_, _, _), (_,CC_D(_)), _) => 35 
  case CC_A(_, (_,CC_F()), CC_A(_, _, _)) => 36 
  case CC_A(_, (_,CC_F()), CC_C(_, _, _)) => 37 
  case CC_A(_, (_,CC_F()), CC_B()) => 38 
  case CC_A(CC_A(_, _, _), (0,CC_E()), CC_A(_, _, _)) => 39 
  case CC_A(CC_C(_, _, _), (0,CC_D(_)), CC_A(_, _, _)) => 40 
  case CC_A(_, (0,CC_F()), _) => 41 
  case CC_A(_, (0,CC_D(_)), CC_B()) => 42 
  case CC_A(CC_C(_, _, _), (_,CC_E()), CC_A(_, _, _)) => 43 
  case CC_A(CC_B(), (0,CC_F()), _) => 44 
  case CC_A(CC_C(_, _, _), (0,CC_E()), CC_A(_, _, _)) => 45 
  case CC_A(CC_C(_, _, _), (0,CC_D(_)), CC_B()) => 46 
  case CC_A(CC_A(_, _, _), (0,CC_D(_)), CC_B()) => 47 
}
}
// This is not matched: (CC_A Char
//      (CC_C Char Wildcard (CC_E T_B T_B) Wildcard (T_A T_B Char))
//      (Tuple Byte (CC_E T_B T_B))
//      (CC_B Char (T_A T_B Char))
//      (T_A T_B Char))
// This is not matched: Pattern match is empty without constants