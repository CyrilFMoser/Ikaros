package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[T_A[D, T_A[D, D]], D]
case class CC_B[E](a: T_B[E], b: T_B[E], c: T_A[E, E]) extends T_B[E]
case class CC_C[F]() extends T_B[F]
case class CC_D[G](a: CC_B[G], b: CC_C[G]) extends T_B[G]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, CC_B(_, _, _), _), CC_B(CC_B(_, _, _), CC_B(_, _, _), _), _) => 0 
  case CC_B(CC_B(_, CC_C(), _), CC_B(CC_B(_, _, _), CC_B(_, _, _), _), _) => 1 
  case CC_B(CC_B(_, CC_D(_, _), _), CC_B(CC_B(_, _, _), CC_B(_, _, _), _), _) => 2 
  case CC_B(CC_C(), CC_B(CC_B(_, _, _), CC_B(_, _, _), _), _) => 3 
  case CC_B(CC_D(_, CC_C()), CC_B(CC_B(_, _, _), CC_B(_, _, _), _), _) => 4 
  case CC_B(CC_B(_, CC_B(_, _, _), _), CC_B(CC_C(), CC_B(_, _, _), _), _) => 5 
  case CC_B(CC_B(_, CC_C(), _), CC_B(CC_C(), CC_B(_, _, _), _), _) => 6 
  case CC_B(CC_B(_, CC_D(_, _), _), CC_B(CC_C(), CC_B(_, _, _), _), _) => 7 
  case CC_B(CC_C(), CC_B(CC_C(), CC_B(_, _, _), _), _) => 8 
  case CC_B(CC_D(_, CC_C()), CC_B(CC_C(), CC_B(_, _, _), _), _) => 9 
  case CC_B(CC_B(_, CC_B(_, _, _), _), CC_B(CC_D(_, _), CC_B(_, _, _), _), _) => 10 
  case CC_B(CC_B(_, CC_C(), _), CC_B(CC_D(_, _), CC_B(_, _, _), _), _) => 11 
  case CC_B(CC_B(_, CC_D(_, _), _), CC_B(CC_D(_, _), CC_B(_, _, _), _), _) => 12 
  case CC_B(CC_C(), CC_B(CC_D(_, _), CC_B(_, _, _), _), _) => 13 
  case CC_B(CC_D(_, CC_C()), CC_B(CC_D(_, _), CC_B(_, _, _), _), _) => 14 
  case CC_B(CC_B(_, CC_B(_, _, _), _), CC_B(CC_B(_, _, _), CC_C(), _), _) => 15 
  case CC_B(CC_B(_, CC_C(), _), CC_B(CC_B(_, _, _), CC_C(), _), _) => 16 
  case CC_B(CC_B(_, CC_D(_, _), _), CC_B(CC_B(_, _, _), CC_C(), _), _) => 17 
  case CC_B(CC_C(), CC_B(CC_B(_, _, _), CC_C(), _), _) => 18 
  case CC_B(CC_D(_, CC_C()), CC_B(CC_B(_, _, _), CC_C(), _), _) => 19 
  case CC_B(CC_B(_, CC_B(_, _, _), _), CC_B(CC_C(), CC_C(), _), _) => 20 
  case CC_B(CC_B(_, CC_C(), _), CC_B(CC_C(), CC_C(), _), _) => 21 
  case CC_B(CC_B(_, CC_D(_, _), _), CC_B(CC_C(), CC_C(), _), _) => 22 
  case CC_B(CC_C(), CC_B(CC_C(), CC_C(), _), _) => 23 
  case CC_B(CC_D(_, CC_C()), CC_B(CC_C(), CC_C(), _), _) => 24 
  case CC_B(CC_B(_, CC_B(_, _, _), _), CC_B(CC_D(_, _), CC_C(), _), _) => 25 
  case CC_B(CC_B(_, CC_C(), _), CC_B(CC_D(_, _), CC_C(), _), _) => 26 
  case CC_B(CC_B(_, CC_D(_, _), _), CC_B(CC_D(_, _), CC_C(), _), _) => 27 
  case CC_B(CC_C(), CC_B(CC_D(_, _), CC_C(), _), _) => 28 
  case CC_B(CC_D(_, CC_C()), CC_B(CC_D(_, _), CC_C(), _), _) => 29 
  case CC_B(CC_B(_, CC_B(_, _, _), _), CC_B(CC_B(_, _, _), CC_D(_, _), _), _) => 30 
  case CC_B(CC_B(_, CC_C(), _), CC_B(CC_B(_, _, _), CC_D(_, _), _), _) => 31 
  case CC_B(CC_B(_, CC_D(_, _), _), CC_B(CC_B(_, _, _), CC_D(_, _), _), _) => 32 
  case CC_B(CC_C(), CC_B(CC_B(_, _, _), CC_D(_, _), _), _) => 33 
  case CC_B(CC_D(_, CC_C()), CC_B(CC_B(_, _, _), CC_D(_, _), _), _) => 34 
  case CC_B(CC_B(_, CC_B(_, _, _), _), CC_B(CC_C(), CC_D(_, _), _), _) => 35 
  case CC_B(CC_B(_, CC_C(), _), CC_B(CC_C(), CC_D(_, _), _), _) => 36 
  case CC_B(CC_B(_, CC_D(_, _), _), CC_B(CC_C(), CC_D(_, _), _), _) => 37 
  case CC_B(CC_C(), CC_B(CC_C(), CC_D(_, _), _), _) => 38 
  case CC_B(CC_D(_, CC_C()), CC_B(CC_C(), CC_D(_, _), _), _) => 39 
  case CC_B(CC_B(_, CC_B(_, _, _), _), CC_B(CC_D(_, _), CC_D(_, _), _), _) => 40 
  case CC_B(CC_B(_, CC_C(), _), CC_B(CC_D(_, _), CC_D(_, _), _), _) => 41 
  case CC_B(CC_B(_, CC_D(_, _), _), CC_B(CC_D(_, _), CC_D(_, _), _), _) => 42 
  case CC_B(CC_C(), CC_B(CC_D(_, _), CC_D(_, _), _), _) => 43 
  case CC_B(CC_D(_, CC_C()), CC_B(CC_D(_, _), CC_D(_, _), _), _) => 44 
  case CC_B(CC_B(_, CC_B(_, _, _), _), CC_C(), _) => 45 
  case CC_B(CC_B(_, CC_C(), _), CC_C(), _) => 46 
  case CC_B(CC_B(_, CC_D(_, _), _), CC_C(), _) => 47 
  case CC_B(CC_C(), CC_C(), _) => 48 
  case CC_B(CC_D(_, CC_C()), CC_C(), _) => 49 
  case CC_B(CC_B(_, CC_B(_, _, _), _), CC_D(_, _), _) => 50 
  case CC_B(CC_B(_, CC_C(), _), CC_D(_, _), _) => 51 
  case CC_B(CC_B(_, CC_D(_, _), _), CC_D(_, _), _) => 52 
  case CC_B(CC_C(), CC_D(_, _), _) => 53 
  case CC_B(CC_D(_, CC_C()), CC_D(_, _), _) => 54 
  case CC_C() => 55 
  case CC_D(_, _) => 56 
}
}