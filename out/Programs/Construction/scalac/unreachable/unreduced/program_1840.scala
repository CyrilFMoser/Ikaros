package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_A[Char],T_B[Int, Boolean]), b: T_B[T_A[Byte], T_A[Byte]]) extends T_A[T_B[T_B[Int, Byte], T_A[Byte]]]
case class CC_B(a: CC_A, b: Byte, c: T_B[T_A[(Byte,Boolean)], CC_A]) extends T_A[T_B[CC_A, CC_A]]
case class CC_C() extends T_A[T_B[T_B[Int, Byte], T_A[Byte]]]
case class CC_D[E, D]() extends T_B[D, E]
case class CC_E[G, F]() extends T_B[F, G]

val v_a: T_A[T_B[T_B[Int, Byte], T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), CC_D()) => 0 
  case CC_A((_,_), CC_E()) => 1 
  case CC_C() => 2 
}
}