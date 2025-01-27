package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D, E](a: T_A[D, D], b: Int) extends T_A[D, T_A[D, D]]
case class CC_C[F](a: T_A[F, T_A[F, F]], b: T_A[T_A[F, F], T_A[T_A[F, F], T_A[F, F]]], c: (Byte,CC_B[(Int,Char), Char])) extends T_A[F, T_A[F, F]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(), _, (_,CC_B(_, _))) => 2 
  case CC_C(CC_B(_, 12), _, (_,CC_B(_, _))) => 3 
  case CC_C(CC_B(_, _), _, (_,CC_B(_, _))) => 4 
}
}
// This is not matched: CC_C(CC_C(_, _, _), _, (_,CC_B(_, _)))