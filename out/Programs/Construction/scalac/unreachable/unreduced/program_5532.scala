package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_B[Char, Boolean],Char)) extends T_A[D]
case class CC_B[E](a: CC_A[E], b: T_A[E]) extends T_B[CC_A[T_A[Int]], E]
case class CC_C[F](a: CC_B[F]) extends T_B[CC_A[T_A[Int]], F]
case class CC_D[G](a: CC_B[G], b: G) extends T_B[CC_A[T_A[Int]], G]

val v_a: T_B[CC_A[T_A[Int]], Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A((_,_)), CC_A((_,_))) => 0 
  case CC_C(CC_B(_, CC_A(_))) => 1 
  case CC_D(_, _) => 2 
}
}