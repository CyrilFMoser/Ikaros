package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B[E, F](a: F, b: T_B, c: T_A[F, F]) extends T_A[E, F]
case class CC_C[G, H]() extends T_A[G, H]
case class CC_D(a: (Byte,T_A[Char, T_B]), b: T_A[Char, T_A[T_B, T_B]], c: T_B) extends T_B
case class CC_E(a: CC_A[(CC_D,CC_D), Byte], b: T_B, c: CC_A[T_A[CC_D, CC_D], Byte]) extends T_B
case class CC_F[I](a: T_A[I, I]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D((_,CC_A()), CC_A(), CC_D(_, _, _)) => 0 
  case CC_D((_,CC_B(_, _, _)), CC_A(), CC_D(_, _, _)) => 1 
  case CC_D((_,CC_C()), CC_A(), CC_D(_, _, _)) => 2 
  case CC_D((_,CC_A()), CC_A(), CC_E(CC_A(), _, CC_A())) => 3 
  case CC_D((_,CC_B(_, _, _)), CC_A(), CC_E(CC_A(), _, CC_A())) => 4 
  case CC_D((_,CC_C()), CC_A(), CC_E(CC_A(), _, CC_A())) => 5 
  case CC_D((_,CC_A()), CC_A(), CC_F(_)) => 6 
  case CC_D((_,CC_B(_, _, _)), CC_A(), CC_F(_)) => 7 
  case CC_D((_,CC_C()), CC_A(), CC_F(_)) => 8 
  case CC_D((_,CC_A()), CC_B(_, CC_D(_, _, _), CC_A()), CC_D(_, _, _)) => 9 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_D(_, _, _), CC_A()), CC_D(_, _, _)) => 10 
  case CC_D((_,CC_C()), CC_B(_, CC_D(_, _, _), CC_A()), CC_D(_, _, _)) => 11 
  case CC_D((_,CC_A()), CC_B(_, CC_D(_, _, _), CC_A()), CC_E(CC_A(), _, CC_A())) => 12 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_D(_, _, _), CC_A()), CC_E(CC_A(), _, CC_A())) => 13 
  case CC_D((_,CC_C()), CC_B(_, CC_D(_, _, _), CC_A()), CC_E(CC_A(), _, CC_A())) => 14 
  case CC_D((_,CC_A()), CC_B(_, CC_D(_, _, _), CC_A()), CC_F(_)) => 15 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_D(_, _, _), CC_A()), CC_F(_)) => 16 
  case CC_D((_,CC_C()), CC_B(_, CC_D(_, _, _), CC_A()), CC_F(_)) => 17 
  case CC_D((_,CC_A()), CC_B(_, CC_E(_, _, _), CC_A()), CC_D(_, _, _)) => 18 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_E(_, _, _), CC_A()), CC_D(_, _, _)) => 19 
  case CC_D((_,CC_C()), CC_B(_, CC_E(_, _, _), CC_A()), CC_D(_, _, _)) => 20 
  case CC_D((_,CC_A()), CC_B(_, CC_E(_, _, _), CC_A()), CC_E(CC_A(), _, CC_A())) => 21 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_E(_, _, _), CC_A()), CC_E(CC_A(), _, CC_A())) => 22 
  case CC_D((_,CC_C()), CC_B(_, CC_E(_, _, _), CC_A()), CC_E(CC_A(), _, CC_A())) => 23 
  case CC_D((_,CC_A()), CC_B(_, CC_E(_, _, _), CC_A()), CC_F(_)) => 24 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_E(_, _, _), CC_A()), CC_F(_)) => 25 
  case CC_D((_,CC_C()), CC_B(_, CC_E(_, _, _), CC_A()), CC_F(_)) => 26 
  case CC_D((_,CC_A()), CC_B(_, CC_F(_), CC_A()), CC_D(_, _, _)) => 27 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_F(_), CC_A()), CC_D(_, _, _)) => 28 
  case CC_D((_,CC_C()), CC_B(_, CC_F(_), CC_A()), CC_D(_, _, _)) => 29 
  case CC_D((_,CC_A()), CC_B(_, CC_F(_), CC_A()), CC_E(CC_A(), _, CC_A())) => 30 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_F(_), CC_A()), CC_E(CC_A(), _, CC_A())) => 31 
  case CC_D((_,CC_C()), CC_B(_, CC_F(_), CC_A()), CC_E(CC_A(), _, CC_A())) => 32 
  case CC_D((_,CC_A()), CC_B(_, CC_F(_), CC_A()), CC_F(_)) => 33 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_F(_), CC_A()), CC_F(_)) => 34 
  case CC_D((_,CC_C()), CC_B(_, CC_F(_), CC_A()), CC_F(_)) => 35 
  case CC_D((_,CC_A()), CC_B(_, CC_D(_, _, _), CC_B(_, _, _)), CC_D(_, _, _)) => 36 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_D(_, _, _), CC_B(_, _, _)), CC_D(_, _, _)) => 37 
  case CC_D((_,CC_C()), CC_B(_, CC_D(_, _, _), CC_B(_, _, _)), CC_D(_, _, _)) => 38 
  case CC_D((_,CC_A()), CC_B(_, CC_D(_, _, _), CC_B(_, _, _)), CC_E(CC_A(), _, CC_A())) => 39 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_D(_, _, _), CC_B(_, _, _)), CC_E(CC_A(), _, CC_A())) => 40 
  case CC_D((_,CC_C()), CC_B(_, CC_D(_, _, _), CC_B(_, _, _)), CC_E(CC_A(), _, CC_A())) => 41 
  case CC_D((_,CC_A()), CC_B(_, CC_D(_, _, _), CC_B(_, _, _)), CC_F(_)) => 42 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_D(_, _, _), CC_B(_, _, _)), CC_F(_)) => 43 
  case CC_D((_,CC_C()), CC_B(_, CC_D(_, _, _), CC_B(_, _, _)), CC_F(_)) => 44 
  case CC_D((_,CC_A()), CC_B(_, CC_E(_, _, _), CC_B(_, _, _)), CC_D(_, _, _)) => 45 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_E(_, _, _), CC_B(_, _, _)), CC_D(_, _, _)) => 46 
  case CC_D((_,CC_C()), CC_B(_, CC_E(_, _, _), CC_B(_, _, _)), CC_D(_, _, _)) => 47 
  case CC_D((_,CC_A()), CC_B(_, CC_E(_, _, _), CC_B(_, _, _)), CC_E(CC_A(), _, CC_A())) => 48 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_E(_, _, _), CC_B(_, _, _)), CC_E(CC_A(), _, CC_A())) => 49 
  case CC_D((_,CC_C()), CC_B(_, CC_E(_, _, _), CC_B(_, _, _)), CC_E(CC_A(), _, CC_A())) => 50 
  case CC_D((_,CC_A()), CC_B(_, CC_E(_, _, _), CC_B(_, _, _)), CC_F(_)) => 51 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_E(_, _, _), CC_B(_, _, _)), CC_F(_)) => 52 
  case CC_D((_,CC_C()), CC_B(_, CC_E(_, _, _), CC_B(_, _, _)), CC_F(_)) => 53 
  case CC_D((_,CC_A()), CC_B(_, CC_F(_), CC_B(_, _, _)), CC_D(_, _, _)) => 54 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_F(_), CC_B(_, _, _)), CC_D(_, _, _)) => 55 
  case CC_D((_,CC_C()), CC_B(_, CC_F(_), CC_B(_, _, _)), CC_D(_, _, _)) => 56 
  case CC_D((_,CC_A()), CC_B(_, CC_F(_), CC_B(_, _, _)), CC_E(CC_A(), _, CC_A())) => 57 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_F(_), CC_B(_, _, _)), CC_E(CC_A(), _, CC_A())) => 58 
  case CC_D((_,CC_C()), CC_B(_, CC_F(_), CC_B(_, _, _)), CC_E(CC_A(), _, CC_A())) => 59 
  case CC_D((_,CC_A()), CC_B(_, CC_F(_), CC_B(_, _, _)), CC_F(_)) => 60 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_F(_), CC_B(_, _, _)), CC_F(_)) => 61 
  case CC_D((_,CC_C()), CC_B(_, CC_F(_), CC_B(_, _, _)), CC_F(_)) => 62 
  case CC_D((_,CC_A()), CC_B(_, CC_D(_, _, _), CC_C()), CC_D(_, _, _)) => 63 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_D(_, _, _), CC_C()), CC_D(_, _, _)) => 64 
  case CC_D((_,CC_C()), CC_B(_, CC_D(_, _, _), CC_C()), CC_D(_, _, _)) => 65 
  case CC_D((_,CC_A()), CC_B(_, CC_D(_, _, _), CC_C()), CC_E(CC_A(), _, CC_A())) => 66 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_D(_, _, _), CC_C()), CC_E(CC_A(), _, CC_A())) => 67 
  case CC_D((_,CC_C()), CC_B(_, CC_D(_, _, _), CC_C()), CC_E(CC_A(), _, CC_A())) => 68 
  case CC_D((_,CC_A()), CC_B(_, CC_D(_, _, _), CC_C()), CC_F(_)) => 69 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_D(_, _, _), CC_C()), CC_F(_)) => 70 
  case CC_D((_,CC_C()), CC_B(_, CC_D(_, _, _), CC_C()), CC_F(_)) => 71 
  case CC_D((_,CC_A()), CC_B(_, CC_E(_, _, _), CC_C()), CC_D(_, _, _)) => 72 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_E(_, _, _), CC_C()), CC_D(_, _, _)) => 73 
  case CC_D((_,CC_C()), CC_B(_, CC_E(_, _, _), CC_C()), CC_D(_, _, _)) => 74 
  case CC_D((_,CC_A()), CC_B(_, CC_E(_, _, _), CC_C()), CC_E(CC_A(), _, CC_A())) => 75 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_E(_, _, _), CC_C()), CC_E(CC_A(), _, CC_A())) => 76 
  case CC_D((_,CC_C()), CC_B(_, CC_E(_, _, _), CC_C()), CC_E(CC_A(), _, CC_A())) => 77 
  case CC_D((_,CC_A()), CC_B(_, CC_E(_, _, _), CC_C()), CC_F(_)) => 78 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_E(_, _, _), CC_C()), CC_F(_)) => 79 
  case CC_D((_,CC_C()), CC_B(_, CC_E(_, _, _), CC_C()), CC_F(_)) => 80 
  case CC_D((_,CC_A()), CC_B(_, CC_F(_), CC_C()), CC_D(_, _, _)) => 81 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_F(_), CC_C()), CC_D(_, _, _)) => 82 
  case CC_D((_,CC_C()), CC_B(_, CC_F(_), CC_C()), CC_D(_, _, _)) => 83 
  case CC_D((_,CC_A()), CC_B(_, CC_F(_), CC_C()), CC_E(CC_A(), _, CC_A())) => 84 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_F(_), CC_C()), CC_E(CC_A(), _, CC_A())) => 85 
  case CC_D((_,CC_C()), CC_B(_, CC_F(_), CC_C()), CC_E(CC_A(), _, CC_A())) => 86 
  case CC_D((_,CC_A()), CC_B(_, CC_F(_), CC_C()), CC_F(_)) => 87 
  case CC_D((_,CC_B(_, _, _)), CC_B(_, CC_F(_), CC_C()), CC_F(_)) => 88 
  case CC_D((_,CC_C()), CC_B(_, CC_F(_), CC_C()), CC_F(_)) => 89 
  case CC_D((_,CC_A()), CC_C(), CC_D(_, _, _)) => 90 
  case CC_D((_,CC_B(_, _, _)), CC_C(), CC_D(_, _, _)) => 91 
  case CC_D((_,CC_C()), CC_C(), CC_D(_, _, _)) => 92 
  case CC_D((_,CC_A()), CC_C(), CC_E(CC_A(), _, CC_A())) => 93 
  case CC_D((_,CC_B(_, _, _)), CC_C(), CC_E(CC_A(), _, CC_A())) => 94 
  case CC_D((_,CC_C()), CC_C(), CC_E(CC_A(), _, CC_A())) => 95 
  case CC_D((_,CC_A()), CC_C(), CC_F(_)) => 96 
  case CC_D((_,CC_B(_, _, _)), CC_C(), CC_F(_)) => 97 
  case CC_D((_,CC_C()), CC_C(), CC_F(_)) => 98 
  case CC_E(CC_A(), CC_D(_, _, _), CC_A()) => 99 
  case CC_E(CC_A(), CC_E(CC_A(), CC_D(_, _, _), CC_A()), CC_A()) => 100 
  case CC_E(CC_A(), CC_E(CC_A(), CC_E(_, _, _), CC_A()), CC_A()) => 101 
  case CC_E(CC_A(), CC_E(CC_A(), CC_F(_), CC_A()), CC_A()) => 102 
  case CC_E(CC_A(), CC_F(_), CC_A()) => 103 
  case CC_F(_) => 104 
}
}