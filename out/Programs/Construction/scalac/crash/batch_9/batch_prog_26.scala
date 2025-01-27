package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[Boolean, Boolean], b: (T_A[Char, Int],T_A[Boolean, Boolean]), c: T_A[D, D]) extends T_A[C, D]
case class CC_B[E, F](a: F) extends T_A[F, E]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, CC_A(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _))) => 0 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), CC_A(_, _, _))) => 1 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), CC_B(_))) => 2 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), CC_B(_))) => 3 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _)), CC_B(_)) => 4 
  case CC_A(CC_A(_, _, CC_B(_)), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _))) => 5 
  case CC_A(CC_A(_, _, CC_B(_)), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), CC_A(_, _, _))) => 6 
  case CC_A(CC_A(_, _, CC_B(_)), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), CC_B(_))) => 7 
  case CC_A(CC_A(_, _, CC_B(_)), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), CC_B(_))) => 8 
  case CC_A(CC_A(_, _, CC_B(_)), (CC_A(_, _, _),CC_A(_, _, _)), CC_B(_)) => 9 
  case CC_A(CC_B(_), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _))) => 10 
  case CC_A(CC_B(_), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), CC_A(_, _, _))) => 11 
  case CC_A(CC_B(_), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), CC_B(_))) => 12 
  case CC_A(CC_B(_), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), CC_B(_))) => 13 
  case CC_A(CC_B(_), (CC_A(_, _, _),CC_A(_, _, _)), CC_B(_)) => 14 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), (CC_A(_, _, _),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _))) => 15 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), (CC_A(_, _, _),CC_B(_)), CC_A(CC_B(_), (_,_), CC_A(_, _, _))) => 16 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), (CC_A(_, _, _),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), CC_B(_))) => 17 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), (CC_A(_, _, _),CC_B(_)), CC_A(CC_B(_), (_,_), CC_B(_))) => 18 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), (CC_A(_, _, _),CC_B(_)), CC_B(_)) => 19 
  case CC_A(CC_A(_, _, CC_B(_)), (CC_A(_, _, _),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _))) => 20 
  case CC_A(CC_A(_, _, CC_B(_)), (CC_A(_, _, _),CC_B(_)), CC_A(CC_B(_), (_,_), CC_A(_, _, _))) => 21 
  case CC_A(CC_A(_, _, CC_B(_)), (CC_A(_, _, _),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), CC_B(_))) => 22 
  case CC_A(CC_A(_, _, CC_B(_)), (CC_A(_, _, _),CC_B(_)), CC_A(CC_B(_), (_,_), CC_B(_))) => 23 
  case CC_A(CC_A(_, _, CC_B(_)), (CC_A(_, _, _),CC_B(_)), CC_B(_)) => 24 
  case CC_A(CC_B(_), (CC_A(_, _, _),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _))) => 25 
  case CC_A(CC_B(_), (CC_A(_, _, _),CC_B(_)), CC_A(CC_B(_), (_,_), CC_A(_, _, _))) => 26 
  case CC_A(CC_B(_), (CC_A(_, _, _),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), CC_B(_))) => 27 
  case CC_A(CC_B(_), (CC_A(_, _, _),CC_B(_)), CC_A(CC_B(_), (_,_), CC_B(_))) => 28 
  case CC_A(CC_B(_), (CC_A(_, _, _),CC_B(_)), CC_B(_)) => 29 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), (CC_B(_),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _))) => 30 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), (CC_B(_),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), CC_A(_, _, _))) => 31 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), (CC_B(_),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), CC_B(_))) => 32 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), (CC_B(_),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), CC_B(_))) => 33 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), (CC_B(_),CC_A(_, _, _)), CC_B(_)) => 34 
  case CC_A(CC_A(_, _, CC_B(_)), (CC_B(_),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _))) => 35 
  case CC_A(CC_A(_, _, CC_B(_)), (CC_B(_),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), CC_A(_, _, _))) => 36 
  case CC_A(CC_A(_, _, CC_B(_)), (CC_B(_),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), CC_B(_))) => 37 
  case CC_A(CC_A(_, _, CC_B(_)), (CC_B(_),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), CC_B(_))) => 38 
  case CC_A(CC_B(_), (CC_B(_),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _))) => 39 
  case CC_A(CC_B(_), (CC_B(_),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), CC_A(_, _, _))) => 40 
  case CC_A(CC_B(_), (CC_B(_),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), CC_B(_))) => 41 
  case CC_A(CC_B(_), (CC_B(_),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), CC_B(_))) => 42 
  case CC_A(CC_B(_), (CC_B(_),CC_A(_, _, _)), CC_B(_)) => 43 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), (CC_B(_),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _))) => 44 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), (CC_B(_),CC_B(_)), CC_A(CC_B(_), (_,_), CC_A(_, _, _))) => 45 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), (CC_B(_),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), CC_B(_))) => 46 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), (CC_B(_),CC_B(_)), CC_A(CC_B(_), (_,_), CC_B(_))) => 47 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), (CC_B(_),CC_B(_)), CC_B(_)) => 48 
  case CC_A(CC_A(_, _, CC_B(_)), (CC_B(_),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _))) => 49 
  case CC_A(CC_A(_, _, CC_B(_)), (CC_B(_),CC_B(_)), CC_A(CC_B(_), (_,_), CC_A(_, _, _))) => 50 
  case CC_A(CC_A(_, _, CC_B(_)), (CC_B(_),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), CC_B(_))) => 51 
  case CC_A(CC_A(_, _, CC_B(_)), (CC_B(_),CC_B(_)), CC_A(CC_B(_), (_,_), CC_B(_))) => 52 
  case CC_A(CC_A(_, _, CC_B(_)), (CC_B(_),CC_B(_)), CC_B(_)) => 53 
  case CC_A(CC_B(_), (CC_B(_),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _))) => 54 
  case CC_A(CC_B(_), (CC_B(_),CC_B(_)), CC_A(CC_B(_), (_,_), CC_A(_, _, _))) => 55 
  case CC_A(CC_B(_), (CC_B(_),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), CC_B(_))) => 56 
  case CC_A(CC_B(_), (CC_B(_),CC_B(_)), CC_A(CC_B(_), (_,_), CC_B(_))) => 57 
  case CC_A(CC_B(_), (CC_B(_),CC_B(_)), CC_B(_)) => 58 
  case CC_B(_) => 59 
}
}
// This is not matched: CC_A(CC_A(_, _, CC_B(_)), (CC_B(_),CC_A(_, _, _)), CC_B(_))