package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, T_A[T_A[C, C], C]]
case class CC_B[E](a: E, b: T_A[E, E], c: T_A[E, E]) extends T_A[E, T_A[T_A[E, E], E]]
case class CC_C[F](a: F, b: (T_A[Char, Byte],T_A[Char, Byte])) extends T_A[F, T_A[T_A[F, F], F]]

val v_a: T_A[Byte, T_A[T_A[Byte, Byte], Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(0, (_,_)) => 2 
  case CC_C(_, (_,_)) => 3 
}
}