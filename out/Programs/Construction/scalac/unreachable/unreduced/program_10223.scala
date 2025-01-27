package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: C, c: T_A[C]) extends T_A[C]
case class CC_B[D](a: T_A[D], b: T_A[D], c: T_A[D]) extends T_A[D]
case class CC_C[E]() extends T_A[E]
case class CC_D(a: T_B[Boolean], b: CC_C[T_B[Char]], c: T_A[T_A[Byte]]) extends T_B[(CC_C[Int],CC_B[Int])]
case class CC_E(a: T_A[(Byte,Int)], b: Boolean) extends T_B[T_A[CC_C[CC_D]]]
case class CC_F[F](a: Byte, b: F) extends T_B[(CC_C[Int],CC_B[Int])]

val v_a: T_B[(CC_C[Int],CC_B[Int])] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C(), _) => 0 
  case CC_F(_, _) => 1 
}
}