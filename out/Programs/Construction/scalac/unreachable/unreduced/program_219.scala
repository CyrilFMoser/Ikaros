package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: D, b: E, c: T_B[Char]) extends T_A[E, D]
case class CC_B[F](a: Int) extends T_A[F, Int]
case class CC_C[G, H]() extends T_A[G, Int]
case class CC_D(a: Byte, b: Boolean, c: (CC_A[Boolean, Boolean],T_A[Int, Int])) extends T_B[T_A[T_A[Char, Byte], CC_A[Byte, Boolean]]]
case class CC_E(a: CC_D, b: Int, c: CC_D) extends T_B[T_A[T_A[Char, Byte], CC_A[Byte, Boolean]]]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}