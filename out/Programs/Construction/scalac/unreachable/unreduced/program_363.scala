package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: (T_B[Int, Byte],Boolean)) extends T_A[E]
case class CC_C[F](a: T_A[F]) extends T_A[F]
case class CC_D[G](a: T_B[T_B[G, G], G], b: T_A[G]) extends T_B[T_B[G, G], G]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_)) => 1 
  case CC_C(_) => 2 
}
}