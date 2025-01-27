package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_B[Byte, Char], T_B[(Int,Int), Byte]]]
case class CC_B(a: (T_A[(Boolean,Boolean)],(CC_A,CC_A)), b: T_A[CC_A], c: Byte) extends T_A[T_B[T_B[Byte, Char], T_B[(Int,Int), Byte]]]
case class CC_C[E, D]() extends T_B[E, D]
case class CC_D[G, F, H](a: T_A[F], b: Int, c: F) extends T_B[G, F]
case class CC_E[I, J](a: T_B[T_A[(CC_B,CC_B)], (CC_B,CC_B)]) extends T_B[J, I]

val v_a: T_A[T_B[T_B[Byte, Char], T_B[(Int,Int), Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,(_,_)), _, _) => 1 
}
}