package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Char, Int]]) extends T_A[(T_B[Char, Char],T_A[Byte])]
case class CC_B[D](a: Boolean, b: D) extends T_B[D, CC_A]
case class CC_C[E]() extends T_B[T_B[Int, Boolean], E]
case class CC_D[F](a: T_B[F, F], b: F, c: T_A[F]) extends T_B[F, CC_A]

val v_a: T_B[T_B[Int, Boolean], CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
  case CC_D(CC_C(), _, _) => 2 
}
}