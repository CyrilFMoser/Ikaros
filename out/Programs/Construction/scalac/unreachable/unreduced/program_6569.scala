package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_B[T_A[T_A[Byte]], T_A[Byte]], b: T_B[E, E], c: T_B[T_A[E], E]) extends T_B[T_A[E], E]
case class CC_C[G](a: CC_A[(Int,Boolean)], b: G) extends T_B[T_A[G], G]
case class CC_D[H](a: T_B[T_A[H], H], b: T_B[H, H]) extends T_B[T_A[H], H]

val v_a: T_B[T_A[Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_B(CC_B(_, _, _), _, _)) => 0 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_B(CC_C(_, _), _, _)) => 1 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_B(CC_D(_, _), _, _)) => 2 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_C(CC_A(_), _)) => 3 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_D(CC_B(_, _, _), _)) => 4 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_D(CC_C(_, _), _)) => 5 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_D(CC_D(_, _), _)) => 6 
  case CC_B(CC_B(CC_C(_, _), _, CC_B(_, _, _)), _, CC_B(CC_B(_, _, _), _, _)) => 7 
  case CC_B(CC_B(CC_C(_, _), _, CC_B(_, _, _)), _, CC_B(CC_C(_, _), _, _)) => 8 
  case CC_B(CC_B(CC_C(_, _), _, CC_B(_, _, _)), _, CC_B(CC_D(_, _), _, _)) => 9 
  case CC_B(CC_B(CC_C(_, _), _, CC_B(_, _, _)), _, CC_C(CC_A(_), _)) => 10 
  case CC_B(CC_B(CC_C(_, _), _, CC_B(_, _, _)), _, CC_D(CC_B(_, _, _), _)) => 11 
  case CC_B(CC_B(CC_C(_, _), _, CC_B(_, _, _)), _, CC_D(CC_C(_, _), _)) => 12 
  case CC_B(CC_B(CC_C(_, _), _, CC_B(_, _, _)), _, CC_D(CC_D(_, _), _)) => 13 
  case CC_B(CC_B(CC_D(_, _), _, CC_B(_, _, _)), _, CC_B(CC_B(_, _, _), _, _)) => 14 
  case CC_B(CC_B(CC_D(_, _), _, CC_B(_, _, _)), _, CC_B(CC_C(_, _), _, _)) => 15 
  case CC_B(CC_B(CC_D(_, _), _, CC_B(_, _, _)), _, CC_B(CC_D(_, _), _, _)) => 16 
  case CC_B(CC_B(CC_D(_, _), _, CC_B(_, _, _)), _, CC_C(CC_A(_), _)) => 17 
  case CC_B(CC_B(CC_D(_, _), _, CC_B(_, _, _)), _, CC_D(CC_B(_, _, _), _)) => 18 
  case CC_B(CC_B(CC_D(_, _), _, CC_B(_, _, _)), _, CC_D(CC_C(_, _), _)) => 19 
  case CC_B(CC_B(CC_D(_, _), _, CC_B(_, _, _)), _, CC_D(CC_D(_, _), _)) => 20 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_C(_, _)), _, CC_B(CC_B(_, _, _), _, _)) => 21 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_C(_, _)), _, CC_B(CC_C(_, _), _, _)) => 22 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_C(_, _)), _, CC_B(CC_D(_, _), _, _)) => 23 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_C(_, _)), _, CC_C(CC_A(_), _)) => 24 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_C(_, _)), _, CC_D(CC_B(_, _, _), _)) => 25 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_C(_, _)), _, CC_D(CC_C(_, _), _)) => 26 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_C(_, _)), _, CC_D(CC_D(_, _), _)) => 27 
  case CC_B(CC_B(CC_C(_, _), _, CC_C(_, _)), _, CC_B(CC_B(_, _, _), _, _)) => 28 
  case CC_B(CC_B(CC_C(_, _), _, CC_C(_, _)), _, CC_B(CC_C(_, _), _, _)) => 29 
  case CC_B(CC_B(CC_C(_, _), _, CC_C(_, _)), _, CC_B(CC_D(_, _), _, _)) => 30 
  case CC_B(CC_B(CC_C(_, _), _, CC_C(_, _)), _, CC_C(CC_A(_), _)) => 31 
  case CC_B(CC_B(CC_C(_, _), _, CC_C(_, _)), _, CC_D(CC_B(_, _, _), _)) => 32 
  case CC_B(CC_B(CC_C(_, _), _, CC_C(_, _)), _, CC_D(CC_C(_, _), _)) => 33 
  case CC_B(CC_B(CC_C(_, _), _, CC_C(_, _)), _, CC_D(CC_D(_, _), _)) => 34 
  case CC_B(CC_B(CC_D(_, _), _, CC_C(_, _)), _, CC_B(CC_B(_, _, _), _, _)) => 35 
  case CC_B(CC_B(CC_D(_, _), _, CC_C(_, _)), _, CC_B(CC_C(_, _), _, _)) => 36 
  case CC_B(CC_B(CC_D(_, _), _, CC_C(_, _)), _, CC_B(CC_D(_, _), _, _)) => 37 
  case CC_B(CC_B(CC_D(_, _), _, CC_C(_, _)), _, CC_C(CC_A(_), _)) => 38 
  case CC_B(CC_B(CC_D(_, _), _, CC_C(_, _)), _, CC_D(CC_B(_, _, _), _)) => 39 
  case CC_B(CC_B(CC_D(_, _), _, CC_C(_, _)), _, CC_D(CC_C(_, _), _)) => 40 
  case CC_B(CC_B(CC_D(_, _), _, CC_C(_, _)), _, CC_D(CC_D(_, _), _)) => 41 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_D(_, _)), _, CC_B(CC_B(_, _, _), _, _)) => 42 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_D(_, _)), _, CC_B(CC_C(_, _), _, _)) => 43 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_D(_, _)), _, CC_B(CC_D(_, _), _, _)) => 44 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_D(_, _)), _, CC_C(CC_A(_), _)) => 45 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_D(_, _)), _, CC_D(CC_B(_, _, _), _)) => 46 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_D(_, _)), _, CC_D(CC_C(_, _), _)) => 47 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_D(_, _)), _, CC_D(CC_D(_, _), _)) => 48 
  case CC_B(CC_B(CC_C(_, _), _, CC_D(_, _)), _, CC_B(CC_B(_, _, _), _, _)) => 49 
  case CC_B(CC_B(CC_C(_, _), _, CC_D(_, _)), _, CC_B(CC_C(_, _), _, _)) => 50 
  case CC_B(CC_B(CC_C(_, _), _, CC_D(_, _)), _, CC_B(CC_D(_, _), _, _)) => 51 
  case CC_B(CC_B(CC_C(_, _), _, CC_D(_, _)), _, CC_C(CC_A(_), _)) => 52 
  case CC_B(CC_B(CC_C(_, _), _, CC_D(_, _)), _, CC_D(CC_B(_, _, _), _)) => 53 
  case CC_B(CC_B(CC_C(_, _), _, CC_D(_, _)), _, CC_D(CC_C(_, _), _)) => 54 
  case CC_B(CC_B(CC_C(_, _), _, CC_D(_, _)), _, CC_D(CC_D(_, _), _)) => 55 
  case CC_B(CC_B(CC_D(_, _), _, CC_D(_, _)), _, CC_B(CC_B(_, _, _), _, _)) => 56 
  case CC_B(CC_B(CC_D(_, _), _, CC_D(_, _)), _, CC_B(CC_C(_, _), _, _)) => 57 
  case CC_B(CC_B(CC_D(_, _), _, CC_D(_, _)), _, CC_B(CC_D(_, _), _, _)) => 58 
  case CC_B(CC_B(CC_D(_, _), _, CC_D(_, _)), _, CC_C(CC_A(_), _)) => 59 
  case CC_B(CC_B(CC_D(_, _), _, CC_D(_, _)), _, CC_D(CC_B(_, _, _), _)) => 60 
  case CC_B(CC_B(CC_D(_, _), _, CC_D(_, _)), _, CC_D(CC_C(_, _), _)) => 61 
  case CC_B(CC_B(CC_D(_, _), _, CC_D(_, _)), _, CC_D(CC_D(_, _), _)) => 62 
  case CC_B(CC_C(CC_A(_), CC_A(_)), _, CC_B(CC_B(_, _, _), _, _)) => 63 
  case CC_B(CC_C(CC_A(_), CC_A(_)), _, CC_B(CC_C(_, _), _, _)) => 64 
  case CC_B(CC_C(CC_A(_), CC_A(_)), _, CC_B(CC_D(_, _), _, _)) => 65 
  case CC_B(CC_C(CC_A(_), CC_A(_)), _, CC_C(CC_A(_), _)) => 66 
  case CC_B(CC_C(CC_A(_), CC_A(_)), _, CC_D(CC_B(_, _, _), _)) => 67 
  case CC_B(CC_C(CC_A(_), CC_A(_)), _, CC_D(CC_C(_, _), _)) => 68 
  case CC_B(CC_C(CC_A(_), CC_A(_)), _, CC_D(CC_D(_, _), _)) => 69 
  case CC_B(CC_D(CC_B(_, _, _), _), _, CC_B(CC_B(_, _, _), _, _)) => 70 
  case CC_B(CC_D(CC_B(_, _, _), _), _, CC_B(CC_C(_, _), _, _)) => 71 
  case CC_B(CC_D(CC_B(_, _, _), _), _, CC_B(CC_D(_, _), _, _)) => 72 
  case CC_B(CC_D(CC_B(_, _, _), _), _, CC_C(CC_A(_), _)) => 73 
  case CC_B(CC_D(CC_B(_, _, _), _), _, CC_D(CC_B(_, _, _), _)) => 74 
  case CC_B(CC_D(CC_B(_, _, _), _), _, CC_D(CC_C(_, _), _)) => 75 
  case CC_B(CC_D(CC_B(_, _, _), _), _, CC_D(CC_D(_, _), _)) => 76 
  case CC_B(CC_D(CC_C(_, _), _), _, CC_B(CC_B(_, _, _), _, _)) => 77 
  case CC_B(CC_D(CC_C(_, _), _), _, CC_B(CC_C(_, _), _, _)) => 78 
  case CC_B(CC_D(CC_C(_, _), _), _, CC_B(CC_D(_, _), _, _)) => 79 
  case CC_B(CC_D(CC_C(_, _), _), _, CC_C(CC_A(_), _)) => 80 
  case CC_B(CC_D(CC_C(_, _), _), _, CC_D(CC_B(_, _, _), _)) => 81 
  case CC_B(CC_D(CC_C(_, _), _), _, CC_D(CC_C(_, _), _)) => 82 
  case CC_B(CC_D(CC_C(_, _), _), _, CC_D(CC_D(_, _), _)) => 83 
  case CC_B(CC_D(CC_D(_, _), _), _, CC_B(CC_B(_, _, _), _, _)) => 84 
  case CC_B(CC_D(CC_D(_, _), _), _, CC_B(CC_C(_, _), _, _)) => 85 
  case CC_B(CC_D(CC_D(_, _), _), _, CC_B(CC_D(_, _), _, _)) => 86 
  case CC_B(CC_D(CC_D(_, _), _), _, CC_C(CC_A(_), _)) => 87 
  case CC_B(CC_D(CC_D(_, _), _), _, CC_D(CC_B(_, _, _), _)) => 88 
  case CC_B(CC_D(CC_D(_, _), _), _, CC_D(CC_C(_, _), _)) => 89 
  case CC_B(CC_D(CC_D(_, _), _), _, CC_D(CC_D(_, _), _)) => 90 
  case CC_C(_, _) => 91 
  case CC_D(CC_B(_, _, _), _) => 92 
  case CC_D(CC_C(_, _), _) => 93 
  case CC_D(CC_D(CC_B(_, _, _), _), _) => 94 
  case CC_D(CC_D(CC_C(_, _), _), _) => 95 
  case CC_D(CC_D(CC_D(_, _), _), _) => 96 
}
}