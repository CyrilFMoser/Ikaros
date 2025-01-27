package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F, G](a: T_A[T_B[F, F]], b: Byte) extends T_B[T_B[T_A[Int], T_A[Byte]], F]

val v_a: T_B[T_B[T_A[Int], T_A[Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), _) => 0 
  case CC_C(CC_B(), _) => 1 
}
}