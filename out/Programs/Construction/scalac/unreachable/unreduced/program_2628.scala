package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_A[Boolean, Boolean],T_A[Byte, Char])) extends T_A[T_B[T_A[Boolean, Char]], D]
case class CC_B[E](a: CC_A[E], b: T_B[CC_A[E]], c: T_A[E, E]) extends T_A[T_B[T_A[Boolean, Char]], E]
case class CC_C[F](a: CC_A[F]) extends T_B[F]
case class CC_D[G](a: Boolean, b: Int) extends T_B[G]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_A((_,_))) => 0 
  case CC_D(_, _) => 1 
}
}