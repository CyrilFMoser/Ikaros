package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: (T_A[Char],Char)) extends T_A[D]
case class CC_C[E](a: Int, b: E, c: T_B[E]) extends T_A[E]
case class CC_D(a: T_A[T_A[Int]], b: T_A[T_A[Boolean]]) extends T_B[T_A[T_A[Boolean]]]
case class CC_E(a: Boolean, b: T_A[Byte], c: T_B[CC_B[CC_D]]) extends T_B[T_A[T_A[Boolean]]]
case class CC_F[F](a: (T_A[Byte],CC_E), b: T_A[F]) extends T_B[T_A[T_A[Boolean]]]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_B(_),_)) => 1 
  case CC_B((CC_C(_, _, _),_)) => 2 
  case CC_C(_, _, _) => 3 
}
}
// This is not matched: CC_B((CC_A(),_))