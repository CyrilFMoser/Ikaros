package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: (T_A[(Int,Char), Boolean],T_A[Boolean, Char]), b: Byte, c: T_B[E, E]) extends T_A[E, F]
case class CC_B[G]() extends T_A[T_A[T_B[Byte, Char], T_A[Char, Byte]], G]
case class CC_C[H, I]() extends T_A[CC_A[T_B[Byte, Boolean], T_A[Char, Byte]], H]
case class CC_D[J](a: J, b: Boolean) extends T_B[CC_C[J, J], J]
case class CC_E[K, L](a: CC_B[K]) extends T_B[T_B[CC_C[CC_D[K], CC_D[K]], CC_D[K]], K]
case class CC_F() extends T_B[CC_C[CC_A[T_A[Int, Char], CC_A[Int, Boolean]], CC_A[T_A[Int, Char], CC_A[Int, Boolean]]], CC_A[T_A[Int, Char], CC_A[Int, Boolean]]]

val v_a: T_B[CC_C[CC_A[T_A[Int, Char], CC_A[Int, Boolean]], CC_A[T_A[Int, Char], CC_A[Int, Boolean]]], CC_A[T_A[Int, Char], CC_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _), _) => 0 
  case CC_F() => 1 
}
}