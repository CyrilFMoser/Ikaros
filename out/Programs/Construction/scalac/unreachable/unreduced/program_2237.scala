package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[E], b: T_A[E, E], c: T_A[D, D]) extends T_A[E, D]
case class CC_B[G, F](a: T_A[G, F]) extends T_A[G, F]
case class CC_C[I, H](a: I) extends T_A[I, H]
case class CC_D(a: T_A[(Int,Int), T_A[Int, Boolean]], b: CC_C[CC_B[Char, Boolean], (Boolean,Int)]) extends T_B[Int]
case class CC_E() extends T_B[Int]
case class CC_F(a: T_A[CC_A[CC_E, Char], Boolean], b: CC_C[T_B[Int], CC_D], c: CC_E) extends T_B[Int]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_), _), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 1 
  case CC_A(_, CC_A(_, CC_C(_), _), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 2 
  case CC_A(_, CC_B(_), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 3 
  case CC_A(_, CC_C(_), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 4 
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), CC_A(_, CC_B(_), CC_A(_, _, _))) => 5 
  case CC_A(_, CC_A(_, CC_B(_), _), CC_A(_, CC_B(_), CC_A(_, _, _))) => 6 
  case CC_A(_, CC_A(_, CC_C(_), _), CC_A(_, CC_B(_), CC_A(_, _, _))) => 7 
  case CC_A(_, CC_B(_), CC_A(_, CC_B(_), CC_A(_, _, _))) => 8 
  case CC_A(_, CC_C(_), CC_A(_, CC_B(_), CC_A(_, _, _))) => 9 
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), CC_A(_, CC_C(_), CC_A(_, _, _))) => 10 
  case CC_A(_, CC_A(_, CC_B(_), _), CC_A(_, CC_C(_), CC_A(_, _, _))) => 11 
  case CC_A(_, CC_A(_, CC_C(_), _), CC_A(_, CC_C(_), CC_A(_, _, _))) => 12 
  case CC_A(_, CC_B(_), CC_A(_, CC_C(_), CC_A(_, _, _))) => 13 
  case CC_A(_, CC_C(_), CC_A(_, CC_C(_), CC_A(_, _, _))) => 14 
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), CC_A(_, CC_A(_, _, _), CC_B(_))) => 15 
  case CC_A(_, CC_A(_, CC_B(_), _), CC_A(_, CC_A(_, _, _), CC_B(_))) => 16 
  case CC_A(_, CC_A(_, CC_C(_), _), CC_A(_, CC_A(_, _, _), CC_B(_))) => 17 
  case CC_A(_, CC_B(_), CC_A(_, CC_A(_, _, _), CC_B(_))) => 18 
  case CC_A(_, CC_C(_), CC_A(_, CC_A(_, _, _), CC_B(_))) => 19 
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), CC_A(_, CC_B(_), CC_B(_))) => 20 
  case CC_A(_, CC_A(_, CC_B(_), _), CC_A(_, CC_B(_), CC_B(_))) => 21 
  case CC_A(_, CC_A(_, CC_C(_), _), CC_A(_, CC_B(_), CC_B(_))) => 22 
  case CC_A(_, CC_B(_), CC_A(_, CC_B(_), CC_B(_))) => 23 
  case CC_A(_, CC_C(_), CC_A(_, CC_B(_), CC_B(_))) => 24 
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), CC_A(_, CC_C(_), CC_B(_))) => 25 
  case CC_A(_, CC_A(_, CC_B(_), _), CC_A(_, CC_C(_), CC_B(_))) => 26 
  case CC_A(_, CC_A(_, CC_C(_), _), CC_A(_, CC_C(_), CC_B(_))) => 27 
  case CC_A(_, CC_B(_), CC_A(_, CC_C(_), CC_B(_))) => 28 
  case CC_A(_, CC_C(_), CC_A(_, CC_C(_), CC_B(_))) => 29 
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), CC_A(_, CC_A(_, _, _), CC_C(_))) => 30 
  case CC_A(_, CC_A(_, CC_B(_), _), CC_A(_, CC_A(_, _, _), CC_C(_))) => 31 
  case CC_A(_, CC_A(_, CC_C(_), _), CC_A(_, CC_A(_, _, _), CC_C(_))) => 32 
  case CC_A(_, CC_B(_), CC_A(_, CC_A(_, _, _), CC_C(_))) => 33 
  case CC_A(_, CC_C(_), CC_A(_, CC_A(_, _, _), CC_C(_))) => 34 
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), CC_A(_, CC_B(_), CC_C(_))) => 35 
  case CC_A(_, CC_A(_, CC_B(_), _), CC_A(_, CC_B(_), CC_C(_))) => 36 
  case CC_A(_, CC_A(_, CC_C(_), _), CC_A(_, CC_B(_), CC_C(_))) => 37 
  case CC_A(_, CC_B(_), CC_A(_, CC_B(_), CC_C(_))) => 38 
  case CC_A(_, CC_C(_), CC_A(_, CC_B(_), CC_C(_))) => 39 
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), CC_A(_, CC_C(_), CC_C(_))) => 40 
  case CC_A(_, CC_A(_, CC_B(_), _), CC_A(_, CC_C(_), CC_C(_))) => 41 
  case CC_A(_, CC_A(_, CC_C(_), _), CC_A(_, CC_C(_), CC_C(_))) => 42 
  case CC_A(_, CC_B(_), CC_A(_, CC_C(_), CC_C(_))) => 43 
  case CC_A(_, CC_C(_), CC_A(_, CC_C(_), CC_C(_))) => 44 
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), CC_B(_)) => 45 
  case CC_A(_, CC_A(_, CC_B(_), _), CC_B(_)) => 46 
  case CC_A(_, CC_A(_, CC_C(_), _), CC_B(_)) => 47 
  case CC_A(_, CC_B(_), CC_B(_)) => 48 
  case CC_A(_, CC_C(_), CC_B(_)) => 49 
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), CC_C('x')) => 50 
  case CC_A(_, CC_A(_, CC_B(_), _), CC_C('x')) => 51 
  case CC_A(_, CC_A(_, CC_C(_), _), CC_C('x')) => 52 
  case CC_A(_, CC_B(_), CC_C('x')) => 53 
  case CC_A(_, CC_C(_), CC_C('x')) => 54 
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), CC_C(_)) => 55 
  case CC_A(_, CC_A(_, CC_B(_), _), CC_C(_)) => 56 
  case CC_A(_, CC_A(_, CC_C(_), _), CC_C(_)) => 57 
  case CC_A(_, CC_B(_), CC_C(_)) => 58 
  case CC_A(_, CC_C(_), CC_C(_)) => 59 
  case CC_B(CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 60 
  case CC_B(CC_A(_, CC_A(_, _, _), CC_B(_))) => 61 
  case CC_B(CC_A(_, CC_A(_, _, _), CC_C(_))) => 62 
  case CC_B(CC_A(_, CC_B(_), CC_A(_, _, _))) => 63 
  case CC_B(CC_A(_, CC_B(_), CC_B(_))) => 64 
  case CC_B(CC_A(_, CC_B(_), CC_C(_))) => 65 
  case CC_B(CC_A(_, CC_C(_), CC_A(_, _, _))) => 66 
  case CC_B(CC_A(_, CC_C(_), CC_B(_))) => 67 
  case CC_B(CC_A(_, CC_C(_), CC_C(_))) => 68 
  case CC_B(CC_B(_)) => 69 
  case CC_B(CC_C(true)) => 70 
  case CC_B(CC_C(false)) => 71 
  case CC_C(_) => 72 
}
}