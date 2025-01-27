package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[F, E], b: T_A[E, F], c: T_A[F, F]) extends T_A[E, F]
case class CC_B[G]() extends T_A[Char, G]
case class CC_C(a: (T_A[Byte, Int],CC_A[Boolean, Byte])) extends T_A[Char, T_B[T_A[(Char,Byte), Boolean], CC_A[Byte, Byte]]]
case class CC_D[H](a: CC_B[H], b: H) extends T_B[T_B[T_A[CC_C, CC_C], Byte], H]
case class CC_E[I](a: (CC_D[CC_C],CC_A[CC_C, Boolean])) extends T_B[T_B[T_A[CC_C, CC_C], Byte], I]

val v_a: T_A[Char, CC_C] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(), CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 1 
  case CC_A(_, CC_B(), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 2 
  case CC_B() => 3 
}
}