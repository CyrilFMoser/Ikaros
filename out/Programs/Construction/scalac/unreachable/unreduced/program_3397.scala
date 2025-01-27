package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_B[T_A[(Int,Int), Char], T_B[Boolean, (Byte,Char)]], T_B[T_B[Byte, Boolean], Byte]]
case class CC_B(a: CC_A, b: T_B[T_A[CC_A, CC_A], CC_A], c: Int) extends T_A[T_B[T_A[(Int,Int), Char], T_B[Boolean, (Byte,Char)]], T_B[T_B[Byte, Boolean], Byte]]
case class CC_C() extends T_A[T_B[T_A[(Int,Int), Char], T_B[Boolean, (Byte,Char)]], T_B[T_B[Byte, Boolean], Byte]]
case class CC_D[E](a: T_A[E, CC_C], b: CC_B, c: CC_C) extends T_B[Byte, E]
case class CC_E[G, F](a: Int, b: CC_A, c: T_B[G, G]) extends T_B[F, G]
case class CC_F[H](a: CC_C, b: H) extends T_B[CC_B, H]

val v_a: T_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(_, _, CC_D(_, _, CC_C())) => 1 
  case CC_E(_, _, CC_E(_, CC_A(), CC_E(_, _, _))) => 2 
}
}
// This is not matched: CC_E(_, _, CC_E(_, CC_A(), CC_D(_, _, _)))