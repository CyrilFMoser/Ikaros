package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[C, T_A[D, C]], b: T_A[D, C], c: T_A[T_A[Byte, D], C]) extends T_A[D, C]
case class CC_B[F, E](a: T_A[F, E]) extends T_A[E, F]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _)) => 0 
  case CC_A(CC_B(CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _)) => 1 
  case CC_A(CC_B(CC_B(_)), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _)) => 2 
  case CC_A(CC_A(_, _, _), CC_A(CC_B(_), CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _)) => 3 
  case CC_A(CC_B(CC_A(_, _, _)), CC_A(CC_B(_), CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _)) => 4 
  case CC_A(CC_B(CC_B(_)), CC_A(CC_B(_), CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _)) => 5 
  case CC_A(CC_A(_, _, _), CC_A(CC_A(_, _, _), CC_B(_), CC_A(_, _, _)), CC_A(_, _, _)) => 6 
  case CC_A(CC_B(CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_B(_), CC_A(_, _, _)), CC_A(_, _, _)) => 7 
  case CC_A(CC_B(CC_B(_)), CC_A(CC_A(_, _, _), CC_B(_), CC_A(_, _, _)), CC_A(_, _, _)) => 8 
  case CC_A(CC_A(_, _, _), CC_A(CC_B(_), CC_B(_), CC_A(_, _, _)), CC_A(_, _, _)) => 9 
  case CC_A(CC_B(CC_A(_, _, _)), CC_A(CC_B(_), CC_B(_), CC_A(_, _, _)), CC_A(_, _, _)) => 10 
  case CC_A(CC_B(CC_B(_)), CC_A(CC_B(_), CC_B(_), CC_A(_, _, _)), CC_A(_, _, _)) => 11 
  case CC_A(CC_A(_, _, _), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_B(_)), CC_A(_, _, _)) => 12 
  case CC_A(CC_B(CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_B(_)), CC_A(_, _, _)) => 13 
  case CC_A(CC_B(CC_B(_)), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_B(_)), CC_A(_, _, _)) => 14 
  case CC_A(CC_A(_, _, _), CC_A(CC_B(_), CC_A(_, _, _), CC_B(_)), CC_A(_, _, _)) => 15 
  case CC_A(CC_B(CC_A(_, _, _)), CC_A(CC_B(_), CC_A(_, _, _), CC_B(_)), CC_A(_, _, _)) => 16 
  case CC_A(CC_B(CC_B(_)), CC_A(CC_B(_), CC_A(_, _, _), CC_B(_)), CC_A(_, _, _)) => 17 
  case CC_A(CC_A(_, _, _), CC_A(CC_A(_, _, _), CC_B(_), CC_B(_)), CC_A(_, _, _)) => 18 
  case CC_A(CC_B(CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_B(_), CC_B(_)), CC_A(_, _, _)) => 19 
  case CC_A(CC_B(CC_B(_)), CC_A(CC_A(_, _, _), CC_B(_), CC_B(_)), CC_A(_, _, _)) => 20 
  case CC_A(CC_A(_, _, _), CC_A(CC_B(_), CC_B(_), CC_B(_)), CC_A(_, _, _)) => 21 
  case CC_A(CC_B(CC_A(_, _, _)), CC_A(CC_B(_), CC_B(_), CC_B(_)), CC_A(_, _, _)) => 22 
  case CC_A(CC_B(CC_B(_)), CC_A(CC_B(_), CC_B(_), CC_B(_)), CC_A(_, _, _)) => 23 
  case CC_A(CC_A(_, _, _), CC_B(CC_A(_, _, _)), CC_A(_, _, _)) => 24 
  case CC_A(CC_B(CC_A(_, _, _)), CC_B(CC_A(_, _, _)), CC_A(_, _, _)) => 25 
  case CC_A(CC_B(CC_B(_)), CC_B(CC_A(_, _, _)), CC_A(_, _, _)) => 26 
  case CC_A(CC_A(_, _, _), CC_B(CC_B(_)), CC_A(_, _, _)) => 27 
  case CC_A(CC_B(CC_A(_, _, _)), CC_B(CC_B(_)), CC_A(_, _, _)) => 28 
  case CC_A(CC_B(CC_B(_)), CC_B(CC_B(_)), CC_A(_, _, _)) => 29 
  case CC_A(CC_A(_, _, _), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_B(_)) => 30 
  case CC_A(CC_B(CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_B(_)) => 31 
  case CC_A(CC_B(CC_B(_)), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_B(_)) => 32 
  case CC_A(CC_A(_, _, _), CC_A(CC_B(_), CC_A(_, _, _), CC_A(_, _, _)), CC_B(_)) => 33 
  case CC_A(CC_B(CC_A(_, _, _)), CC_A(CC_B(_), CC_A(_, _, _), CC_A(_, _, _)), CC_B(_)) => 34 
  case CC_A(CC_B(CC_B(_)), CC_A(CC_B(_), CC_A(_, _, _), CC_A(_, _, _)), CC_B(_)) => 35 
  case CC_A(CC_A(_, _, _), CC_A(CC_A(_, _, _), CC_B(_), CC_A(_, _, _)), CC_B(_)) => 36 
  case CC_A(CC_B(CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_B(_), CC_A(_, _, _)), CC_B(_)) => 37 
  case CC_A(CC_B(CC_B(_)), CC_A(CC_A(_, _, _), CC_B(_), CC_A(_, _, _)), CC_B(_)) => 38 
  case CC_A(CC_A(_, _, _), CC_A(CC_B(_), CC_B(_), CC_A(_, _, _)), CC_B(_)) => 39 
  case CC_A(CC_B(CC_A(_, _, _)), CC_A(CC_B(_), CC_B(_), CC_A(_, _, _)), CC_B(_)) => 40 
  case CC_A(CC_B(CC_B(_)), CC_A(CC_B(_), CC_B(_), CC_A(_, _, _)), CC_B(_)) => 41 
  case CC_A(CC_A(_, _, _), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_B(_)), CC_B(_)) => 42 
  case CC_A(CC_B(CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_B(_)), CC_B(_)) => 43 
  case CC_A(CC_B(CC_B(_)), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_B(_)), CC_B(_)) => 44 
  case CC_A(CC_A(_, _, _), CC_A(CC_B(_), CC_A(_, _, _), CC_B(_)), CC_B(_)) => 45 
  case CC_A(CC_B(CC_A(_, _, _)), CC_A(CC_B(_), CC_A(_, _, _), CC_B(_)), CC_B(_)) => 46 
  case CC_A(CC_B(CC_B(_)), CC_A(CC_B(_), CC_A(_, _, _), CC_B(_)), CC_B(_)) => 47 
  case CC_A(CC_A(_, _, _), CC_A(CC_A(_, _, _), CC_B(_), CC_B(_)), CC_B(_)) => 48 
  case CC_A(CC_B(CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_B(_), CC_B(_)), CC_B(_)) => 49 
  case CC_A(CC_B(CC_B(_)), CC_A(CC_A(_, _, _), CC_B(_), CC_B(_)), CC_B(_)) => 50 
  case CC_A(CC_A(_, _, _), CC_A(CC_B(_), CC_B(_), CC_B(_)), CC_B(_)) => 51 
  case CC_A(CC_B(CC_A(_, _, _)), CC_A(CC_B(_), CC_B(_), CC_B(_)), CC_B(_)) => 52 
  case CC_A(CC_B(CC_B(_)), CC_A(CC_B(_), CC_B(_), CC_B(_)), CC_B(_)) => 53 
  case CC_A(CC_A(_, _, _), CC_B(CC_A(_, _, _)), CC_B(_)) => 54 
  case CC_A(CC_B(CC_A(_, _, _)), CC_B(CC_A(_, _, _)), CC_B(_)) => 55 
  case CC_A(CC_B(CC_B(_)), CC_B(CC_A(_, _, _)), CC_B(_)) => 56 
  case CC_A(CC_A(_, _, _), CC_B(CC_B(_)), CC_B(_)) => 57 
  case CC_A(CC_B(CC_A(_, _, _)), CC_B(CC_B(_)), CC_B(_)) => 58 
  case CC_A(CC_B(CC_B(_)), CC_B(CC_B(_)), CC_B(_)) => 59 
  case CC_B(_) => 60 
}
}