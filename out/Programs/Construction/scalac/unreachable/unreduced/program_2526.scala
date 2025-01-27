package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D], c: T_B[T_A[Int], D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: T_A[F], b: T_B[F, F]) extends T_A[F]
case class CC_D[G, H](a: CC_A[G]) extends T_B[G, T_A[T_B[(Int,Char), (Boolean,Boolean)]]]
case class CC_E[I](a: (T_A[Boolean],CC_C[Char]), b: T_A[I], c: T_A[CC_B[Boolean]]) extends T_B[CC_C[I], I]
case class CC_F[J](a: CC_A[J]) extends T_B[CC_C[J], J]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(_, _, _), _) => 0 
  case CC_A(CC_A(CC_B(), CC_A(_, _, _), _), CC_A(_, _, _), _) => 1 
  case CC_A(CC_A(CC_C(_, _), CC_A(_, _, _), _), CC_A(_, _, _), _) => 2 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(), _), CC_A(_, _, _), _) => 3 
  case CC_A(CC_A(CC_B(), CC_B(), _), CC_A(_, _, _), _) => 4 
  case CC_A(CC_A(CC_C(_, _), CC_B(), _), CC_A(_, _, _), _) => 5 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_, _), _), CC_A(_, _, _), _) => 6 
  case CC_A(CC_A(CC_B(), CC_C(_, _), _), CC_A(_, _, _), _) => 7 
  case CC_A(CC_A(CC_C(_, _), CC_C(_, _), _), CC_A(_, _, _), _) => 8 
  case CC_A(CC_B(), CC_A(_, _, _), _) => 9 
  case CC_A(CC_C(_, _), CC_A(_, _, _), _) => 10 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_B(), _) => 11 
  case CC_A(CC_A(CC_B(), CC_A(_, _, _), _), CC_B(), _) => 12 
  case CC_A(CC_A(CC_C(_, _), CC_A(_, _, _), _), CC_B(), _) => 13 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(), _), CC_B(), _) => 14 
  case CC_A(CC_A(CC_B(), CC_B(), _), CC_B(), _) => 15 
  case CC_A(CC_A(CC_C(_, _), CC_B(), _), CC_B(), _) => 16 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_, _), _), CC_B(), _) => 17 
  case CC_A(CC_A(CC_B(), CC_C(_, _), _), CC_B(), _) => 18 
  case CC_A(CC_A(CC_C(_, _), CC_C(_, _), _), CC_B(), _) => 19 
  case CC_A(CC_B(), CC_B(), _) => 20 
  case CC_A(CC_C(_, _), CC_B(), _) => 21 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_C(CC_A(_, _, _), _), _) => 22 
  case CC_A(CC_A(CC_B(), CC_A(_, _, _), _), CC_C(CC_A(_, _, _), _), _) => 23 
  case CC_A(CC_A(CC_C(_, _), CC_A(_, _, _), _), CC_C(CC_A(_, _, _), _), _) => 24 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(), _), CC_C(CC_A(_, _, _), _), _) => 25 
  case CC_A(CC_A(CC_B(), CC_B(), _), CC_C(CC_A(_, _, _), _), _) => 26 
  case CC_A(CC_A(CC_C(_, _), CC_B(), _), CC_C(CC_A(_, _, _), _), _) => 27 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_, _), _), CC_C(CC_A(_, _, _), _), _) => 28 
  case CC_A(CC_A(CC_B(), CC_C(_, _), _), CC_C(CC_A(_, _, _), _), _) => 29 
  case CC_A(CC_A(CC_C(_, _), CC_C(_, _), _), CC_C(CC_A(_, _, _), _), _) => 30 
  case CC_A(CC_B(), CC_C(CC_A(_, _, _), _), _) => 31 
  case CC_A(CC_C(_, _), CC_C(CC_A(_, _, _), _), _) => 32 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_C(CC_B(), _), _) => 33 
  case CC_A(CC_A(CC_B(), CC_A(_, _, _), _), CC_C(CC_B(), _), _) => 34 
  case CC_A(CC_A(CC_C(_, _), CC_A(_, _, _), _), CC_C(CC_B(), _), _) => 35 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(), _), CC_C(CC_B(), _), _) => 36 
  case CC_A(CC_A(CC_B(), CC_B(), _), CC_C(CC_B(), _), _) => 37 
  case CC_A(CC_A(CC_C(_, _), CC_B(), _), CC_C(CC_B(), _), _) => 38 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_, _), _), CC_C(CC_B(), _), _) => 39 
  case CC_A(CC_A(CC_B(), CC_C(_, _), _), CC_C(CC_B(), _), _) => 40 
  case CC_A(CC_A(CC_C(_, _), CC_C(_, _), _), CC_C(CC_B(), _), _) => 41 
  case CC_A(CC_B(), CC_C(CC_B(), _), _) => 42 
  case CC_A(CC_C(_, _), CC_C(CC_B(), _), _) => 43 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_C(CC_C(_, _), _), _) => 44 
  case CC_A(CC_A(CC_B(), CC_A(_, _, _), _), CC_C(CC_C(_, _), _), _) => 45 
  case CC_A(CC_A(CC_C(_, _), CC_A(_, _, _), _), CC_C(CC_C(_, _), _), _) => 46 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(), _), CC_C(CC_C(_, _), _), _) => 47 
  case CC_A(CC_A(CC_B(), CC_B(), _), CC_C(CC_C(_, _), _), _) => 48 
  case CC_A(CC_A(CC_C(_, _), CC_B(), _), CC_C(CC_C(_, _), _), _) => 49 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_, _), _), CC_C(CC_C(_, _), _), _) => 50 
  case CC_A(CC_A(CC_B(), CC_C(_, _), _), CC_C(CC_C(_, _), _), _) => 51 
  case CC_A(CC_A(CC_C(_, _), CC_C(_, _), _), CC_C(CC_C(_, _), _), _) => 52 
  case CC_A(CC_B(), CC_C(CC_C(_, _), _), _) => 53 
  case CC_A(CC_C(_, _), CC_C(CC_C(_, _), _), _) => 54 
  case CC_B() => 55 
  case CC_C(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 56 
  case CC_C(CC_A(CC_A(_, _, _), CC_B(), _), _) => 57 
  case CC_C(CC_A(CC_A(_, _, _), CC_C(_, _), _), _) => 58 
  case CC_C(CC_A(CC_B(), CC_A(_, _, _), _), _) => 59 
  case CC_C(CC_A(CC_B(), CC_B(), _), _) => 60 
  case CC_C(CC_A(CC_B(), CC_C(_, _), _), _) => 61 
  case CC_C(CC_A(CC_C(_, _), CC_A(_, _, _), _), _) => 62 
  case CC_C(CC_A(CC_C(_, _), CC_B(), _), _) => 63 
  case CC_C(CC_A(CC_C(_, _), CC_C(_, _), _), _) => 64 
  case CC_C(CC_B(), _) => 65 
  case CC_C(CC_C(_, _), _) => 66 
}
}