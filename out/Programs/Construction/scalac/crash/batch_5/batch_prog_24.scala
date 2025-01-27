package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: (T_A[Byte],T_A[Char]), c: T_A[B]) extends T_A[B]
case class CC_B[C](a: T_A[T_A[C]]) extends T_A[C]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), _)) => 0 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _)), (CC_A(_, _, _),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), _)) => 1 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _)), (CC_B(_),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), _)) => 2 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _)), (CC_B(_),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), _)) => 3 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), _)) => 4 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _)), (CC_A(_, _, _),CC_B(_)), CC_A(CC_B(_), (_,_), _)) => 5 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _)), (CC_B(_),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), _)) => 6 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _)), (CC_B(_),CC_B(_)), CC_A(CC_B(_), (_,_), _)) => 7 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _)), CC_B(CC_A(_, _, _))) => 8 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _)), (CC_A(_, _, _),CC_B(_)), CC_B(CC_A(_, _, _))) => 9 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _)), (CC_B(_),CC_A(_, _, _)), CC_B(CC_A(_, _, _))) => 10 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _)), (CC_B(_),CC_B(_)), CC_B(CC_A(_, _, _))) => 11 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _)), CC_B(CC_B(_))) => 12 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _)), (CC_A(_, _, _),CC_B(_)), CC_B(CC_B(_))) => 13 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _)), (CC_B(_),CC_A(_, _, _)), CC_B(CC_B(_))) => 14 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _)), (CC_B(_),CC_B(_)), CC_B(CC_B(_))) => 15 
  case CC_A(CC_A(CC_B(_), (_,_), CC_A(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), _)) => 16 
  case CC_A(CC_A(CC_B(_), (_,_), CC_A(_, _, _)), (CC_A(_, _, _),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), _)) => 17 
  case CC_A(CC_A(CC_B(_), (_,_), CC_A(_, _, _)), (CC_B(_),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), _)) => 18 
  case CC_A(CC_A(CC_B(_), (_,_), CC_A(_, _, _)), (CC_B(_),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), _)) => 19 
  case CC_A(CC_A(CC_B(_), (_,_), CC_A(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), _)) => 20 
  case CC_A(CC_A(CC_B(_), (_,_), CC_A(_, _, _)), (CC_A(_, _, _),CC_B(_)), CC_A(CC_B(_), (_,_), _)) => 21 
  case CC_A(CC_A(CC_B(_), (_,_), CC_A(_, _, _)), (CC_B(_),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), _)) => 22 
  case CC_A(CC_A(CC_B(_), (_,_), CC_A(_, _, _)), (CC_B(_),CC_B(_)), CC_A(CC_B(_), (_,_), _)) => 23 
  case CC_A(CC_A(CC_B(_), (_,_), CC_A(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _)), CC_B(CC_A(_, _, _))) => 24 
  case CC_A(CC_A(CC_B(_), (_,_), CC_A(_, _, _)), (CC_A(_, _, _),CC_B(_)), CC_B(CC_A(_, _, _))) => 25 
  case CC_A(CC_A(CC_B(_), (_,_), CC_A(_, _, _)), (CC_B(_),CC_A(_, _, _)), CC_B(CC_A(_, _, _))) => 26 
  case CC_A(CC_A(CC_B(_), (_,_), CC_A(_, _, _)), (CC_B(_),CC_B(_)), CC_B(CC_A(_, _, _))) => 27 
  case CC_A(CC_A(CC_B(_), (_,_), CC_A(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _)), CC_B(CC_B(_))) => 28 
  case CC_A(CC_A(CC_B(_), (_,_), CC_A(_, _, _)), (CC_A(_, _, _),CC_B(_)), CC_B(CC_B(_))) => 29 
  case CC_A(CC_A(CC_B(_), (_,_), CC_A(_, _, _)), (CC_B(_),CC_A(_, _, _)), CC_B(CC_B(_))) => 30 
  case CC_A(CC_A(CC_B(_), (_,_), CC_A(_, _, _)), (CC_B(_),CC_B(_)), CC_B(CC_B(_))) => 31 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_B(_)), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), _)) => 32 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_B(_)), (CC_A(_, _, _),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), _)) => 33 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_B(_)), (CC_B(_),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), _)) => 34 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_B(_)), (CC_B(_),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), _)) => 35 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_B(_)), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), _)) => 36 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_B(_)), (CC_A(_, _, _),CC_B(_)), CC_A(CC_B(_), (_,_), _)) => 37 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_B(_)), (CC_B(_),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), _)) => 38 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_B(_)), (CC_B(_),CC_B(_)), CC_A(CC_B(_), (_,_), _)) => 39 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_B(_)), (CC_A(_, _, _),CC_A(_, _, _)), CC_B(CC_A(_, _, _))) => 40 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_B(_)), (CC_A(_, _, _),CC_B(_)), CC_B(CC_A(_, _, _))) => 41 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_B(_)), (CC_B(_),CC_A(_, _, _)), CC_B(CC_A(_, _, _))) => 42 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_B(_)), (CC_B(_),CC_B(_)), CC_B(CC_A(_, _, _))) => 43 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_B(_)), (CC_A(_, _, _),CC_A(_, _, _)), CC_B(CC_B(_))) => 44 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_B(_)), (CC_A(_, _, _),CC_B(_)), CC_B(CC_B(_))) => 45 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_B(_)), (CC_B(_),CC_A(_, _, _)), CC_B(CC_B(_))) => 46 
  case CC_A(CC_A(CC_A(_, _, _), (_,_), CC_B(_)), (CC_B(_),CC_B(_)), CC_B(CC_B(_))) => 47 
  case CC_A(CC_A(CC_B(_), (_,_), CC_B(_)), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), _)) => 48 
  case CC_A(CC_A(CC_B(_), (_,_), CC_B(_)), (CC_A(_, _, _),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), _)) => 49 
  case CC_A(CC_A(CC_B(_), (_,_), CC_B(_)), (CC_B(_),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), _)) => 50 
  case CC_A(CC_A(CC_B(_), (_,_), CC_B(_)), (CC_B(_),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), _)) => 51 
  case CC_A(CC_A(CC_B(_), (_,_), CC_B(_)), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), _)) => 52 
  case CC_A(CC_A(CC_B(_), (_,_), CC_B(_)), (CC_A(_, _, _),CC_B(_)), CC_A(CC_B(_), (_,_), _)) => 53 
  case CC_A(CC_A(CC_B(_), (_,_), CC_B(_)), (CC_B(_),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), _)) => 54 
  case CC_A(CC_A(CC_B(_), (_,_), CC_B(_)), (CC_B(_),CC_B(_)), CC_A(CC_B(_), (_,_), _)) => 55 
  case CC_A(CC_A(CC_B(_), (_,_), CC_B(_)), (CC_A(_, _, _),CC_A(_, _, _)), CC_B(CC_A(_, _, _))) => 56 
  case CC_A(CC_A(CC_B(_), (_,_), CC_B(_)), (CC_A(_, _, _),CC_B(_)), CC_B(CC_A(_, _, _))) => 57 
  case CC_A(CC_A(CC_B(_), (_,_), CC_B(_)), (CC_B(_),CC_A(_, _, _)), CC_B(CC_A(_, _, _))) => 58 
  case CC_A(CC_A(CC_B(_), (_,_), CC_B(_)), (CC_B(_),CC_B(_)), CC_B(CC_A(_, _, _))) => 59 
  case CC_A(CC_A(CC_B(_), (_,_), CC_B(_)), (CC_A(_, _, _),CC_A(_, _, _)), CC_B(CC_B(_))) => 60 
  case CC_A(CC_A(CC_B(_), (_,_), CC_B(_)), (CC_A(_, _, _),CC_B(_)), CC_B(CC_B(_))) => 61 
  case CC_A(CC_A(CC_B(_), (_,_), CC_B(_)), (CC_B(_),CC_A(_, _, _)), CC_B(CC_B(_))) => 62 
  case CC_A(CC_A(CC_B(_), (_,_), CC_B(_)), (CC_B(_),CC_B(_)), CC_B(CC_B(_))) => 63 
  case CC_A(CC_B(CC_A(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), _)) => 64 
  case CC_A(CC_B(CC_A(_, _, _)), (CC_A(_, _, _),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), _)) => 65 
  case CC_A(CC_B(CC_A(_, _, _)), (CC_B(_),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), _)) => 66 
  case CC_A(CC_B(CC_A(_, _, _)), (CC_B(_),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), _)) => 67 
  case CC_A(CC_B(CC_A(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), _)) => 68 
  case CC_A(CC_B(CC_A(_, _, _)), (CC_A(_, _, _),CC_B(_)), CC_A(CC_B(_), (_,_), _)) => 69 
  case CC_A(CC_B(CC_A(_, _, _)), (CC_B(_),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), _)) => 70 
  case CC_A(CC_B(CC_A(_, _, _)), (CC_B(_),CC_B(_)), CC_A(CC_B(_), (_,_), _)) => 71 
  case CC_A(CC_B(CC_A(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _)), CC_B(CC_A(_, _, _))) => 72 
  case CC_A(CC_B(CC_A(_, _, _)), (CC_A(_, _, _),CC_B(_)), CC_B(CC_A(_, _, _))) => 73 
  case CC_A(CC_B(CC_A(_, _, _)), (CC_B(_),CC_A(_, _, _)), CC_B(CC_A(_, _, _))) => 74 
  case CC_A(CC_B(CC_A(_, _, _)), (CC_B(_),CC_B(_)), CC_B(CC_A(_, _, _))) => 75 
  case CC_A(CC_B(CC_A(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _)), CC_B(CC_B(_))) => 76 
  case CC_A(CC_B(CC_A(_, _, _)), (CC_A(_, _, _),CC_B(_)), CC_B(CC_B(_))) => 77 
  case CC_A(CC_B(CC_A(_, _, _)), (CC_B(_),CC_A(_, _, _)), CC_B(CC_B(_))) => 78 
  case CC_A(CC_B(CC_A(_, _, _)), (CC_B(_),CC_B(_)), CC_B(CC_B(_))) => 79 
  case CC_A(CC_B(CC_B(_)), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), _)) => 80 
  case CC_A(CC_B(CC_B(_)), (CC_A(_, _, _),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), _)) => 81 
  case CC_A(CC_B(CC_B(_)), (CC_B(_),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), _)) => 82 
  case CC_A(CC_B(CC_B(_)), (CC_B(_),CC_B(_)), CC_A(CC_A(_, _, _), (_,_), _)) => 83 
  case CC_A(CC_B(CC_B(_)), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), _)) => 84 
  case CC_A(CC_B(CC_B(_)), (CC_A(_, _, _),CC_B(_)), CC_A(CC_B(_), (_,_), _)) => 85 
  case CC_A(CC_B(CC_B(_)), (CC_B(_),CC_A(_, _, _)), CC_A(CC_B(_), (_,_), _)) => 86 
  case CC_A(CC_B(CC_B(_)), (CC_B(_),CC_B(_)), CC_A(CC_B(_), (_,_), _)) => 87 
  case CC_A(CC_B(CC_B(_)), (CC_A(_, _, _),CC_A(_, _, _)), CC_B(CC_A(_, _, _))) => 88 
  case CC_A(CC_B(CC_B(_)), (CC_A(_, _, _),CC_B(_)), CC_B(CC_A(_, _, _))) => 89 
  case CC_A(CC_B(CC_B(_)), (CC_B(_),CC_A(_, _, _)), CC_B(CC_A(_, _, _))) => 90 
  case CC_A(CC_B(CC_B(_)), (CC_B(_),CC_B(_)), CC_B(CC_A(_, _, _))) => 91 
  case CC_A(CC_B(CC_B(_)), (CC_A(_, _, _),CC_A(_, _, _)), CC_B(CC_B(_))) => 92 
  case CC_A(CC_B(CC_B(_)), (CC_A(_, _, _),CC_B(_)), CC_B(CC_B(_))) => 93 
  case CC_A(CC_B(CC_B(_)), (CC_B(_),CC_A(_, _, _)), CC_B(CC_B(_))) => 94 
  case CC_A(CC_B(CC_B(_)), (CC_B(_),CC_B(_)), CC_B(CC_B(_))) => 95 
  case CC_B(CC_A(CC_A(_, _, _), _, _)) => 96 
  case CC_B(CC_A(CC_B(_), _, _)) => 97 
  case CC_B(CC_B(CC_A(_, _, _))) => 98 
  case CC_B(CC_B(CC_B(_))) => 99 
}
}