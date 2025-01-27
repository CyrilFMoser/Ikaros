package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D], c: (T_A[Char],T_A[Int])) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: Boolean, c: T_A[E]) extends T_A[E]
case class CC_C[F](a: T_A[F]) extends T_A[F]
case class CC_D[G]() extends T_B[G, CC_B[T_B[Int, Int]]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), (CC_A(_, _, _),CC_A(_, _, _))) => 0 
  case CC_A(_, CC_B(_, _, CC_A(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _))) => 1 
  case CC_A(_, CC_B(_, _, CC_B(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _))) => 2 
  case CC_A(_, CC_B(_, _, CC_C(_)), (CC_A(_, _, _),CC_A(_, _, _))) => 3 
  case CC_A(_, CC_C(_), (CC_A(_, _, _),CC_A(_, _, _))) => 4 
  case CC_A(_, CC_A(_, _, _), (CC_A(_, _, _),CC_B(_, _, _))) => 5 
  case CC_A(_, CC_B(_, _, CC_A(_, _, _)), (CC_A(_, _, _),CC_B(_, _, _))) => 6 
  case CC_A(_, CC_B(_, _, CC_B(_, _, _)), (CC_A(_, _, _),CC_B(_, _, _))) => 7 
  case CC_A(_, CC_B(_, _, CC_C(_)), (CC_A(_, _, _),CC_B(_, _, _))) => 8 
  case CC_A(_, CC_C(_), (CC_A(_, _, _),CC_B(_, _, _))) => 9 
  case CC_A(_, CC_A(_, _, _), (CC_A(_, _, _),CC_C(_))) => 10 
  case CC_A(_, CC_B(_, _, CC_A(_, _, _)), (CC_A(_, _, _),CC_C(_))) => 11 
  case CC_A(_, CC_B(_, _, CC_B(_, _, _)), (CC_A(_, _, _),CC_C(_))) => 12 
  case CC_A(_, CC_B(_, _, CC_C(_)), (CC_A(_, _, _),CC_C(_))) => 13 
  case CC_A(_, CC_C(_), (CC_A(_, _, _),CC_C(_))) => 14 
  case CC_A(_, CC_A(_, _, _), (CC_B(_, _, _),CC_A(_, _, _))) => 15 
  case CC_A(_, CC_B(_, _, CC_A(_, _, _)), (CC_B(_, _, _),CC_A(_, _, _))) => 16 
  case CC_A(_, CC_B(_, _, CC_B(_, _, _)), (CC_B(_, _, _),CC_A(_, _, _))) => 17 
  case CC_A(_, CC_B(_, _, CC_C(_)), (CC_B(_, _, _),CC_A(_, _, _))) => 18 
  case CC_A(_, CC_C(_), (CC_B(_, _, _),CC_A(_, _, _))) => 19 
  case CC_A(_, CC_A(_, _, _), (CC_B(_, _, _),CC_B(_, _, _))) => 20 
  case CC_A(_, CC_B(_, _, CC_A(_, _, _)), (CC_B(_, _, _),CC_B(_, _, _))) => 21 
  case CC_A(_, CC_B(_, _, CC_B(_, _, _)), (CC_B(_, _, _),CC_B(_, _, _))) => 22 
  case CC_A(_, CC_B(_, _, CC_C(_)), (CC_B(_, _, _),CC_B(_, _, _))) => 23 
  case CC_A(_, CC_C(_), (CC_B(_, _, _),CC_B(_, _, _))) => 24 
  case CC_A(_, CC_A(_, _, _), (CC_B(_, _, _),CC_C(_))) => 25 
  case CC_A(_, CC_B(_, _, CC_A(_, _, _)), (CC_B(_, _, _),CC_C(_))) => 26 
  case CC_A(_, CC_B(_, _, CC_B(_, _, _)), (CC_B(_, _, _),CC_C(_))) => 27 
  case CC_A(_, CC_B(_, _, CC_C(_)), (CC_B(_, _, _),CC_C(_))) => 28 
  case CC_A(_, CC_C(_), (CC_B(_, _, _),CC_C(_))) => 29 
  case CC_A(_, CC_A(_, _, _), (CC_C(_),CC_A(_, _, _))) => 30 
  case CC_A(_, CC_B(_, _, CC_A(_, _, _)), (CC_C(_),CC_A(_, _, _))) => 31 
  case CC_A(_, CC_B(_, _, CC_B(_, _, _)), (CC_C(_),CC_A(_, _, _))) => 32 
  case CC_A(_, CC_B(_, _, CC_C(_)), (CC_C(_),CC_A(_, _, _))) => 33 
  case CC_A(_, CC_C(_), (CC_C(_),CC_A(_, _, _))) => 34 
  case CC_A(_, CC_A(_, _, _), (CC_C(_),CC_B(_, _, _))) => 35 
  case CC_A(_, CC_B(_, _, CC_A(_, _, _)), (CC_C(_),CC_B(_, _, _))) => 36 
  case CC_A(_, CC_B(_, _, CC_B(_, _, _)), (CC_C(_),CC_B(_, _, _))) => 37 
  case CC_A(_, CC_B(_, _, CC_C(_)), (CC_C(_),CC_B(_, _, _))) => 38 
  case CC_A(_, CC_C(_), (CC_C(_),CC_B(_, _, _))) => 39 
  case CC_A(_, CC_A(_, _, _), (CC_C(_),CC_C(_))) => 40 
  case CC_A(_, CC_B(_, _, CC_A(_, _, _)), (CC_C(_),CC_C(_))) => 41 
  case CC_A(_, CC_B(_, _, CC_B(_, _, _)), (CC_C(_),CC_C(_))) => 42 
  case CC_A(_, CC_B(_, _, CC_C(_)), (CC_C(_),CC_C(_))) => 43 
  case CC_A(_, CC_C(_), (CC_C(_),CC_C(_))) => 44 
  case CC_B(_, _, CC_A(_, CC_A(_, _, _), (_,_))) => 45 
  case CC_B(_, _, CC_A(_, CC_B(_, _, _), (_,_))) => 46 
  case CC_B(_, _, CC_A(_, CC_C(_), (_,_))) => 47 
  case CC_B(_, _, CC_B(_, _, CC_A(_, _, _))) => 48 
  case CC_B(_, _, CC_B(_, _, CC_B(_, _, _))) => 49 
  case CC_B(_, _, CC_C(CC_A(_, _, _))) => 50 
  case CC_B(_, _, CC_C(CC_B(_, _, _))) => 51 
  case CC_B(_, _, CC_C(CC_C(_))) => 52 
  case CC_C(CC_A(_, CC_A(_, _, _), (_,_))) => 53 
  case CC_C(CC_A(_, CC_B(_, _, _), (_,_))) => 54 
  case CC_C(CC_A(_, CC_C(_), (_,_))) => 55 
  case CC_C(CC_B(_, _, _)) => 56 
  case CC_C(CC_C(_)) => 57 
}
}
// This is not matched: CC_B(_, _, CC_B(_, _, CC_C(_)))