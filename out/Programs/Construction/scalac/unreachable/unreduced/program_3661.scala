package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[Boolean, E], E]
case class CC_B[F](a: CC_A[F], b: T_A[F, F]) extends T_A[T_A[Boolean, F], F]
case class CC_C() extends T_A[T_A[Boolean, CC_A[CC_A[(Int,Int)]]], CC_A[CC_A[(Int,Int)]]]
case class CC_D(a: T_B[T_B[CC_C, CC_C], Byte], b: Char, c: CC_A[CC_B[CC_C]]) extends T_B[CC_A[Char], CC_B[CC_C]]
case class CC_E[G](a: T_B[G, CC_A[G]], b: G) extends T_B[G, CC_A[G]]
case class CC_F(a: T_A[T_A[Boolean, CC_C], CC_C]) extends T_B[CC_A[Char], CC_B[CC_C]]

val v_a: T_A[T_A[Boolean, CC_F], CC_F] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
}
}