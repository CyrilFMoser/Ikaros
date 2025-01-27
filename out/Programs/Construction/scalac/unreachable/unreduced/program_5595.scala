package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_B[T_A[D, (Byte,Byte)]]]
case class CC_B[E](a: T_B[E], b: T_A[E, E]) extends T_B[E]
case class CC_C[F](a: T_B[F], b: T_B[F], c: Byte) extends T_B[F]
case class CC_D[G](a: T_B[G]) extends T_B[G]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), _), _) => 0 
  case CC_B(CC_B(CC_C(_, _, _), _), _) => 1 
  case CC_B(CC_B(CC_D(_), _), _) => 2 
  case CC_B(CC_C(CC_B(_, _), CC_B(_, _), _), _) => 3 
  case CC_B(CC_C(CC_B(_, _), CC_C(_, _, _), _), _) => 4 
  case CC_B(CC_C(CC_B(_, _), CC_D(_), _), _) => 5 
  case CC_B(CC_C(CC_C(_, _, _), CC_B(_, _), _), _) => 6 
  case CC_B(CC_C(CC_C(_, _, _), CC_C(_, _, _), _), _) => 7 
  case CC_B(CC_C(CC_C(_, _, _), CC_D(_), _), _) => 8 
  case CC_B(CC_C(CC_D(_), CC_B(_, _), _), _) => 9 
  case CC_B(CC_C(CC_D(_), CC_C(_, _, _), _), _) => 10 
  case CC_B(CC_C(CC_D(_), CC_D(_), _), _) => 11 
  case CC_B(CC_D(CC_B(_, _)), _) => 12 
  case CC_B(CC_D(CC_C(_, _, _)), _) => 13 
  case CC_B(CC_D(CC_D(_)), _) => 14 
  case CC_C(CC_B(_, _), CC_B(CC_B(_, _), _), _) => 15 
  case CC_C(CC_C(_, _, 0), CC_B(CC_B(_, _), _), _) => 16 
  case CC_C(CC_C(_, _, _), CC_B(CC_B(_, _), _), _) => 17 
  case CC_C(CC_D(CC_B(_, _)), CC_B(CC_B(_, _), _), _) => 18 
  case CC_C(CC_D(CC_C(_, _, _)), CC_B(CC_B(_, _), _), _) => 19 
  case CC_C(CC_D(CC_D(_)), CC_B(CC_B(_, _), _), _) => 20 
  case CC_C(CC_B(_, _), CC_B(CC_C(_, _, _), _), _) => 21 
  case CC_C(CC_C(_, _, 0), CC_B(CC_C(_, _, _), _), _) => 22 
  case CC_C(CC_C(_, _, _), CC_B(CC_C(_, _, _), _), _) => 23 
  case CC_C(CC_D(CC_B(_, _)), CC_B(CC_C(_, _, _), _), _) => 24 
  case CC_C(CC_D(CC_C(_, _, _)), CC_B(CC_C(_, _, _), _), _) => 25 
  case CC_C(CC_D(CC_D(_)), CC_B(CC_C(_, _, _), _), _) => 26 
  case CC_C(CC_B(_, _), CC_B(CC_D(_), _), _) => 27 
  case CC_C(CC_C(_, _, 0), CC_B(CC_D(_), _), _) => 28 
  case CC_C(CC_C(_, _, _), CC_B(CC_D(_), _), _) => 29 
  case CC_C(CC_D(CC_B(_, _)), CC_B(CC_D(_), _), _) => 30 
  case CC_C(CC_D(CC_C(_, _, _)), CC_B(CC_D(_), _), _) => 31 
  case CC_C(CC_D(CC_D(_)), CC_B(CC_D(_), _), _) => 32 
  case CC_C(CC_B(_, _), CC_C(_, CC_B(_, _), _), _) => 33 
  case CC_C(CC_C(_, _, 0), CC_C(_, CC_B(_, _), _), _) => 34 
  case CC_C(CC_C(_, _, _), CC_C(_, CC_B(_, _), _), _) => 35 
  case CC_C(CC_D(CC_B(_, _)), CC_C(_, CC_B(_, _), _), _) => 36 
  case CC_C(CC_D(CC_C(_, _, _)), CC_C(_, CC_B(_, _), _), _) => 37 
  case CC_C(CC_D(CC_D(_)), CC_C(_, CC_B(_, _), _), _) => 38 
  case CC_C(CC_B(_, _), CC_C(_, CC_C(_, _, _), _), _) => 39 
  case CC_C(CC_C(_, _, 0), CC_C(_, CC_C(_, _, _), _), _) => 40 
  case CC_C(CC_C(_, _, _), CC_C(_, CC_C(_, _, _), _), _) => 41 
  case CC_C(CC_D(CC_B(_, _)), CC_C(_, CC_C(_, _, _), _), _) => 42 
  case CC_C(CC_D(CC_C(_, _, _)), CC_C(_, CC_C(_, _, _), _), _) => 43 
  case CC_C(CC_D(CC_D(_)), CC_C(_, CC_C(_, _, _), _), _) => 44 
  case CC_C(CC_B(_, _), CC_C(_, CC_D(_), _), _) => 45 
  case CC_C(CC_C(_, _, 0), CC_C(_, CC_D(_), _), _) => 46 
  case CC_C(CC_C(_, _, _), CC_C(_, CC_D(_), _), _) => 47 
  case CC_C(CC_D(CC_B(_, _)), CC_C(_, CC_D(_), _), _) => 48 
  case CC_C(CC_D(CC_C(_, _, _)), CC_C(_, CC_D(_), _), _) => 49 
  case CC_C(CC_B(_, _), CC_D(_), _) => 50 
  case CC_C(CC_C(_, _, 0), CC_D(_), _) => 51 
  case CC_C(CC_C(_, _, _), CC_D(_), _) => 52 
  case CC_C(CC_D(CC_B(_, _)), CC_D(_), _) => 53 
  case CC_C(CC_D(CC_C(_, _, _)), CC_D(_), _) => 54 
  case CC_C(CC_D(CC_D(_)), CC_D(_), _) => 55 
  case CC_D(_) => 56 
}
}
// This is not matched: CC_C(CC_D(CC_D(_)), CC_C(_, CC_D(_), _), _)