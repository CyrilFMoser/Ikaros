package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_A[(Int,Boolean), ((Boolean,Int),Int)], Boolean]
case class CC_B(a: T_A[T_B[Byte, CC_A], Char]) extends T_A[T_A[(Int,Boolean), ((Boolean,Int),Int)], Boolean]
case class CC_C[E, F]() extends T_B[E, F]
case class CC_D[G, H]() extends T_B[G, H]
case class CC_E[I, J](a: Char, b: I) extends T_B[J, I]

val v_a: T_A[T_A[(Int,Boolean), ((Boolean,Int),Int)], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}