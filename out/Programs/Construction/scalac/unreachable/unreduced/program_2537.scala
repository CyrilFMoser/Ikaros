package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[T_A[Byte, (Char,Boolean)], T_B[Byte, Char]]]
case class CC_B[F](a: F, b: F) extends T_A[F, T_A[T_A[Byte, (Char,Boolean)], T_B[Byte, Char]]]
case class CC_C(a: CC_B[((Boolean,Byte),Char)], b: Int, c: Byte) extends T_A[T_B[CC_A[Char], CC_B[Int]], T_A[T_A[Byte, (Char,Boolean)], T_B[Byte, Char]]]
case class CC_D[H, G](a: T_A[G, H], b: CC_A[H], c: CC_A[H]) extends T_B[H, G]
case class CC_E[I](a: T_B[T_B[I, I], I], b: (Char,CC_D[CC_C, CC_C]), c: T_B[I, I]) extends T_B[CC_B[CC_A[(Byte,Int)]], CC_C]

val v_a: T_A[T_B[CC_A[Char], CC_B[Int]], T_A[T_A[Byte, (Char,Boolean)], T_B[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_D(_, _, CC_A()), CC_D(_, CC_A(), CC_A())) => 1 
  case CC_C(_, _, _) => 2 
}
}