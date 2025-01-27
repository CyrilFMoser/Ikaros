package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_A[Char]]]
case class CC_B(a: CC_A, b: T_A[(CC_A,(Byte,Byte))], c: T_B[CC_A]) extends T_A[T_A[T_A[Char]]]
case class CC_C[C]() extends T_A[T_A[T_A[Char]]]
case class CC_D[D](a: CC_A, b: T_B[D]) extends T_B[D]
case class CC_E[E](a: T_A[E], b: CC_C[E]) extends T_B[E]
case class CC_F[F](a: T_B[F]) extends T_B[F]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, CC_E(_, CC_C())) => 1 
  case CC_B(CC_A(), _, CC_F(_)) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_B(CC_A(), _, CC_D(_, _))