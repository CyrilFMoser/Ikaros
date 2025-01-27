package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_A[Int],T_A[Char])) extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_B[E, E]) extends T_B[Int, E]
case class CC_C[F](a: T_A[F]) extends T_B[Int, F]
case class CC_D[G](a: T_B[Int, G], b: CC_B[G]) extends T_B[Int, G]

val v_a: T_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), _) => 0 
  case CC_C(CC_A((_,_))) => 1 
  case CC_D(_, _) => 2 
}
}