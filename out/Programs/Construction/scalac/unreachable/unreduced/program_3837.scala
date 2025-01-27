package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[E, E]]
case class CC_B[F](a: F, b: F, c: T_A[F, F]) extends T_A[Int, T_A[Int, Int]]
case class CC_C[G](a: G, b: Int, c: T_A[T_A[G, G], T_A[T_A[G, G], T_A[G, G]]]) extends T_A[G, T_A[G, G]]
case class CC_D[H](a: T_A[H, T_A[H, H]]) extends T_B[T_B[H, H], H]
case class CC_E(a: Char, b: CC_A[T_A[Byte, Boolean]]) extends T_B[T_B[T_B[T_B[CC_D[(Byte,Boolean)], CC_D[(Byte,Boolean)]], CC_D[(Byte,Boolean)]], T_B[T_B[CC_D[(Byte,Boolean)], CC_D[(Byte,Boolean)]], CC_D[(Byte,Boolean)]]], T_B[T_B[CC_D[(Byte,Boolean)], CC_D[(Byte,Boolean)]], CC_D[(Byte,Boolean)]]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _, CC_A()) => 2 
  case CC_C(_, _, CC_C(_, _, _)) => 3 
}
}