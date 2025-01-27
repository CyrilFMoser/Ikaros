package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, T_A[C, C]], c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C(a: Boolean, b: (CC_A[T_B],CC_A[T_B]), c: (T_A[T_B, Byte],Int)) extends T_A[T_A[Char, T_A[Char, Char]], T_A[T_A[Char, T_A[Char, Char]], T_A[Char, T_A[Char, Char]]]]
case class CC_D(a: (Byte,T_A[Boolean, T_B]), b: Boolean) extends T_B
case class CC_E(a: T_A[T_A[CC_D, Char], T_A[T_A[CC_D, Char], T_A[CC_D, Char]]], b: CC_C, c: (CC_B[T_B],T_B)) extends T_B
case class CC_F(a: T_A[T_A[Int, CC_D], T_A[T_A[Int, CC_D], T_A[Int, CC_D]]], b: Int) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D((_,_), _) => 0 
  case CC_E(CC_A(_, _, CC_A(_, _, _)), CC_C(_, (_,_), (_,_)), (CC_B(_, _),CC_D(_, _))) => 1 
  case CC_E(CC_A(_, _, CC_A(_, _, _)), CC_C(_, (_,_), (_,_)), (CC_B(_, _),CC_E(_, _, _))) => 2 
  case CC_E(CC_A(_, _, CC_A(_, _, _)), CC_C(_, (_,_), (_,_)), (CC_B(_, _),CC_F(_, _))) => 3 
  case CC_E(CC_A(_, _, CC_B(_, _)), CC_C(_, (_,_), (_,_)), (CC_B(_, _),CC_D(_, _))) => 4 
  case CC_E(CC_A(_, _, CC_B(_, _)), CC_C(_, (_,_), (_,_)), (CC_B(_, _),CC_E(_, _, _))) => 5 
  case CC_E(CC_A(_, _, CC_B(_, _)), CC_C(_, (_,_), (_,_)), (CC_B(_, _),CC_F(_, _))) => 6 
  case CC_E(CC_B(CC_A(_, _, _), CC_A(_, _, _)), CC_C(_, (_,_), (_,_)), (CC_B(_, _),CC_D(_, _))) => 7 
  case CC_E(CC_B(CC_A(_, _, _), CC_A(_, _, _)), CC_C(_, (_,_), (_,_)), (CC_B(_, _),CC_E(_, _, _))) => 8 
  case CC_E(CC_B(CC_A(_, _, _), CC_A(_, _, _)), CC_C(_, (_,_), (_,_)), (CC_B(_, _),CC_F(_, _))) => 9 
  case CC_E(CC_B(CC_A(_, _, _), CC_B(_, _)), CC_C(_, (_,_), (_,_)), (CC_B(_, _),CC_D(_, _))) => 10 
  case CC_E(CC_B(CC_A(_, _, _), CC_B(_, _)), CC_C(_, (_,_), (_,_)), (CC_B(_, _),CC_E(_, _, _))) => 11 
  case CC_E(CC_B(CC_A(_, _, _), CC_B(_, _)), CC_C(_, (_,_), (_,_)), (CC_B(_, _),CC_F(_, _))) => 12 
  case CC_E(CC_B(CC_B(_, _), CC_A(_, _, _)), CC_C(_, (_,_), (_,_)), (CC_B(_, _),CC_D(_, _))) => 13 
  case CC_E(CC_B(CC_B(_, _), CC_A(_, _, _)), CC_C(_, (_,_), (_,_)), (CC_B(_, _),CC_E(_, _, _))) => 14 
  case CC_E(CC_B(CC_B(_, _), CC_A(_, _, _)), CC_C(_, (_,_), (_,_)), (CC_B(_, _),CC_F(_, _))) => 15 
  case CC_E(CC_B(CC_B(_, _), CC_B(_, _)), CC_C(_, (_,_), (_,_)), (CC_B(_, _),CC_D(_, _))) => 16 
  case CC_E(CC_B(CC_B(_, _), CC_B(_, _)), CC_C(_, (_,_), (_,_)), (CC_B(_, _),CC_F(_, _))) => 17 
  case CC_F(_, _) => 18 
}
}
// This is not matched: CC_E(CC_B(CC_B(_, _), CC_B(_, _)), CC_C(_, (_,_), (_,_)), (CC_B(_, _),CC_E(_, _, _)))