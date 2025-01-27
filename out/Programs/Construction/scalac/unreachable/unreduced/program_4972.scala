package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[T_A[T_B[Char]]]
case class CC_B(a: (Int,(Byte,Boolean)), b: Byte, c: (T_B[Int],CC_A[Char])) extends T_A[T_A[T_B[Char]]]
case class CC_C(a: T_A[T_B[CC_B]]) extends T_A[T_A[T_B[Char]]]
case class CC_D[D]() extends T_B[D]
case class CC_E[E]() extends T_B[E]
case class CC_F[F](a: T_B[F], b: T_B[F], c: T_B[F]) extends T_B[F]

val v_a: T_A[T_A[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A()