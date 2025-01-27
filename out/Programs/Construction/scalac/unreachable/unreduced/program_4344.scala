package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, (Boolean,(Byte,Int))]) extends T_A[E, F]
case class CC_B[G]() extends T_A[G, CC_A[(Byte,Int), T_B[Char, Boolean]]]
case class CC_C(a: Int, b: CC_A[T_A[(Char,Byte), Int], T_B[(Char,Boolean), Char]], c: Boolean) extends T_A[Char, CC_A[(Byte,Int), T_B[Char, Boolean]]]
case class CC_D[H](a: CC_A[H, H], b: CC_A[H, H], c: CC_C) extends T_B[T_B[T_B[Boolean, CC_C], CC_A[Int, CC_C]], H]
case class CC_E[I](a: CC_A[I, I], b: I, c: CC_A[T_A[I, I], I]) extends T_B[T_B[T_B[Boolean, CC_C], CC_A[Int, CC_C]], I]

val v_a: T_A[Char, CC_A[(Byte,Int), T_B[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, CC_A(_), _)