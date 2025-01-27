package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: (T_B[Int],T_A[Byte, Byte]), b: Byte, c: T_A[D, D]) extends T_A[D, E]
case class CC_B[F]() extends T_A[F, (Byte,CC_A[(Int,Int), Byte])]
case class CC_C[G, H](a: CC_B[H], b: (T_B[Int],Boolean)) extends T_A[H, G]
case class CC_D(a: T_A[Char, T_A[Char, Byte]]) extends T_B[T_A[CC_A[Char, Byte], T_A[Char, Boolean]]]
case class CC_E(a: Byte, b: CC_A[T_B[CC_D], T_A[CC_D, Int]]) extends T_B[Boolean]
case class CC_F() extends T_B[T_A[CC_A[Char, Byte], T_A[Char, Boolean]]]

val v_a: T_B[T_A[CC_A[Char, Byte], T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A((_,_), _, CC_A(_, _, _))) => 0 
  case CC_D(CC_A((_,_), _, CC_C(_, _))) => 1 
  case CC_D(CC_C(CC_B(), (_,_))) => 2 
  case CC_F() => 3 
}
}