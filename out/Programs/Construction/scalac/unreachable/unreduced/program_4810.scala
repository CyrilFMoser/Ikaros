package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Int) extends T_A[T_A[T_A[Byte, Char], (Char,Int)], D]
case class CC_B[E]() extends T_B[E]
case class CC_C[F](a: T_B[F]) extends T_B[F]
case class CC_D[G](a: T_A[G, G], b: T_A[G, G], c: (CC_C[Char],CC_B[Boolean])) extends T_B[G]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
  case CC_D(_, _, (CC_C(_),CC_B())) => 2 
}
}