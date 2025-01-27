package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[Boolean, T_B[Byte, Int]], E]
case class CC_B[F](a: (Byte,CC_A[Char]), b: CC_A[F]) extends T_A[T_B[Boolean, T_B[Byte, Int]], F]
case class CC_C[G](a: T_A[G, G], b: G, c: G) extends T_A[T_B[Boolean, T_B[Byte, Int]], G]
case class CC_D(a: CC_A[Char], b: Boolean, c: T_A[CC_A[Boolean], Char]) extends T_B[Boolean, T_B[T_B[Boolean, Int], (Boolean,Int)]]
case class CC_E() extends T_B[CC_D, T_B[Byte, T_B[CC_D, Char]]]

val v_a: T_A[T_B[Boolean, T_B[Byte, Int]], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, 'x') => 2 
  case CC_C(_, _, _) => 3 
}
}