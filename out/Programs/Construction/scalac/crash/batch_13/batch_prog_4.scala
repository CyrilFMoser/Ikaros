package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, E]
case class CC_B[F](a: F, b: T_B[F]) extends T_A[T_A[F, F], F]
case class CC_C[G](a: Boolean) extends T_B[G]
case class CC_D(a: (CC_A[Boolean, Byte],CC_C[Byte])) extends T_B[Int]
case class CC_E(a: CC_D, b: T_B[CC_C[CC_D]]) extends T_B[Int]

val v_a: CC_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}