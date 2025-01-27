package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, Byte]
case class CC_B[E](a: T_A[E, Byte], b: (CC_A[Byte],T_B[Boolean]), c: E) extends T_B[E]
case class CC_C[F](a: CC_A[F]) extends T_B[F]
case class CC_D[G](a: T_A[G, G], b: T_B[G], c: T_B[G]) extends T_B[G]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _, _) => 0 
  case CC_C(CC_A()) => 1 
  case CC_D(_, _, _) => 2 
}
}