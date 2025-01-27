package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[Int, C], C], b: T_A[C, C], c: T_A[C, T_B]) extends T_A[Byte, C]
case class CC_B[D](a: T_A[Byte, D], b: (T_A[(Boolean,Byte), T_B],(T_B,Boolean)), c: T_A[D, D]) extends T_A[Byte, D]
case class CC_C[F, E](a: (Byte,T_A[T_B, T_B]), b: T_A[Byte, F], c: (T_A[Byte, T_B],T_A[Byte, T_B])) extends T_A[E, F]
case class CC_D(a: T_A[Byte, Char], b: Boolean, c: T_A[Byte, T_B]) extends T_B

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C((_,_), CC_A(_, _, _), (_,_)), CC_C((_,_), CC_A(_, _, _), (_,_))) => 0 
  case CC_A(_, CC_C((_,_), CC_B(_, _, _), (_,_)), CC_C((_,_), CC_A(_, _, _), (_,_))) => 1 
  case CC_A(_, CC_C((_,_), CC_A(_, _, _), (_,_)), CC_C((_,_), CC_B(_, _, _), (_,_))) => 2 
  case CC_A(_, CC_C((_,_), CC_B(_, _, _), (_,_)), CC_C((_,_), CC_B(_, _, _), (_,_))) => 3 
  case CC_A(_, CC_C((_,_), CC_C(_, _, _), (_,_)), CC_C((_,_), CC_B(_, _, _), (_,_))) => 4 
  case CC_A(_, CC_C((_,_), CC_A(_, _, _), (_,_)), CC_C((_,_), CC_C(_, _, _), (_,_))) => 5 
  case CC_A(_, CC_C((_,_), CC_B(_, _, _), (_,_)), CC_C((_,_), CC_C(_, _, _), (_,_))) => 6 
  case CC_A(_, CC_C((_,_), CC_C(_, _, _), (_,_)), CC_C((_,_), CC_C(_, _, _), (_,_))) => 7 
  case CC_B(_, _, _) => 8 
  case CC_C(_, _, (CC_A(_, _, _),CC_A(_, _, _))) => 9 
  case CC_C(_, _, (CC_A(_, _, _),CC_B(_, _, _))) => 10 
  case CC_C(_, _, (CC_A(_, _, _),CC_C(_, _, _))) => 11 
  case CC_C(_, _, (CC_B(_, _, _),CC_A(_, _, _))) => 12 
  case CC_C(_, _, (CC_B(_, _, _),CC_B(_, _, _))) => 13 
  case CC_C(_, _, (CC_B(_, _, _),CC_C(_, _, _))) => 14 
  case CC_C(_, _, (CC_C(_, _, _),CC_A(_, _, _))) => 15 
  case CC_C(_, _, (CC_C(_, _, _),CC_B(_, _, _))) => 16 
  case CC_C(_, _, (CC_C(_, _, _),CC_C(_, _, _))) => 17 
}
}
// This is not matched: CC_A(_, CC_C((_,_), CC_C(_, _, _), (_,_)), CC_C((_,_), CC_A(_, _, _), (_,_)))