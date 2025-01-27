package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: ((Char,Byte),T_A[Byte, Byte]), b: T_A[C, T_A[C, C]], c: T_A[T_A[T_A[Int, Boolean], T_A[Int, Boolean]], T_A[T_A[T_A[Int, Boolean], T_A[Int, Boolean]], T_A[T_A[Int, Boolean], T_A[Int, Boolean]]]]) extends T_A[C, T_A[C, C]]
case class CC_B[E, F](a: F) extends T_A[E, T_A[E, E]]
case class CC_C[G](a: CC_A[G]) extends T_A[G, T_A[G, G]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_), CC_A(_, _, _), CC_A((_,_), CC_A(_, _, _), _)) => 0 
  case CC_A(((_,_),_), CC_A(_, _, _), CC_A((_,_), CC_B(_), _)) => 1 
  case CC_A(((_,_),_), CC_A(_, _, _), CC_A((_,_), CC_C(_), _)) => 2 
  case CC_A(((_,_),_), CC_A(_, _, _), CC_B(_)) => 3 
  case CC_A(((_,_),_), CC_A(_, _, _), CC_C(CC_A(_, _, _))) => 4 
  case CC_A(((_,_),_), CC_B(_), CC_A((_,_), CC_A(_, _, _), _)) => 5 
  case CC_A(((_,_),_), CC_B(_), CC_A((_,_), CC_B(_), _)) => 6 
  case CC_A(((_,_),_), CC_B(_), CC_A((_,_), CC_C(_), _)) => 7 
  case CC_A(((_,_),_), CC_B(_), CC_B(_)) => 8 
  case CC_A(((_,_),_), CC_B(_), CC_C(CC_A(_, _, _))) => 9 
  case CC_A(((_,_),_), CC_C(CC_A(_, _, _)), CC_A((_,_), CC_A(_, _, _), _)) => 10 
  case CC_A(((_,_),_), CC_C(CC_A(_, _, _)), CC_A((_,_), CC_B(_), _)) => 11 
  case CC_A(((_,_),_), CC_C(CC_A(_, _, _)), CC_A((_,_), CC_C(_), _)) => 12 
  case CC_A(((_,_),_), CC_C(CC_A(_, _, _)), CC_B(_)) => 13 
  case CC_A(((_,_),_), CC_C(CC_A(_, _, _)), CC_C(CC_A(_, _, _))) => 14 
  case CC_B(_) => 15 
  case CC_C(CC_A((_,_), _, _)) => 16 
}
}