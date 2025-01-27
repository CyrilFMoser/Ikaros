package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_A[D, D], c: T_B[D]) extends T_A[(T_A[Boolean, Byte],T_A[Char, Boolean]), D]
case class CC_B[E](a: T_A[E, E], b: E) extends T_B[E]
case class CC_C[F]() extends T_B[F]
case class CC_D[G](a: Char) extends T_B[G]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, 12) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
  case CC_D(_) => 3 
}
}