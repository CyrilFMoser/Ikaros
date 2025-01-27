package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_A[C], b: (T_B[Char],T_A[Char]), c: T_A[D]) extends T_A[C]
case class CC_B[E](a: E, b: T_B[E]) extends T_A[E]
case class CC_C[F](a: T_A[F]) extends T_A[F]
case class CC_D(a: T_A[T_A[Int]]) extends T_B[Boolean]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, (_,_), _), (_,CC_A(_, _, _)), _) => 0 
  case CC_A(CC_B(_, _), (_,CC_A(_, _, _)), _) => 1 
  case CC_A(CC_C(CC_A(_, _, _)), (_,CC_A(_, _, _)), _) => 2 
  case CC_A(CC_C(CC_B(_, _)), (_,CC_A(_, _, _)), _) => 3 
  case CC_A(CC_C(CC_C(_)), (_,CC_A(_, _, _)), _) => 4 
  case CC_A(CC_A(_, (_,_), _), (_,CC_B(_, _)), _) => 5 
  case CC_A(CC_B(_, _), (_,CC_B(_, _)), _) => 6 
  case CC_A(CC_C(CC_A(_, _, _)), (_,CC_B(_, _)), _) => 7 
  case CC_A(CC_C(CC_B(_, _)), (_,CC_B(_, _)), _) => 8 
  case CC_A(CC_C(CC_C(_)), (_,CC_B(_, _)), _) => 9 
  case CC_A(CC_A(_, (_,_), _), (_,CC_C(_)), _) => 10 
  case CC_A(CC_B(_, _), (_,CC_C(_)), _) => 11 
  case CC_A(CC_C(CC_A(_, _, _)), (_,CC_C(_)), _) => 12 
  case CC_A(CC_C(CC_B(_, _)), (_,CC_C(_)), _) => 13 
  case CC_A(CC_C(CC_C(_)), (_,CC_C(_)), _) => 14 
  case CC_B(_, _) => 15 
  case CC_C(_) => 16 
}
}