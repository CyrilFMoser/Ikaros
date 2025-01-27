package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[T_A[Int, Byte], Char]]
case class CC_B[F](a: Boolean, b: T_A[F, F], c: Boolean) extends T_A[CC_A[F], F]
case class CC_C(a: CC_B[T_B[Boolean, Byte]], b: CC_B[T_A[Boolean, Byte]], c: CC_A[T_B[Char, Boolean]]) extends T_B[CC_B[(Byte,Char)], (CC_B[(Boolean,Char)],T_A[Byte, Boolean])]
case class CC_D[G]() extends T_B[T_A[CC_C, T_A[Char, CC_C]], G]
case class CC_E() extends T_B[CC_B[(Byte,Char)], (CC_B[(Boolean,Char)],T_A[Byte, Boolean])]

val v_a: T_B[CC_B[(Byte,Char)], (CC_B[(Boolean,Char)],T_A[Byte, Boolean])] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(true, _, _), CC_B(_, _, _), CC_A()) => 0 
  case CC_C(CC_B(false, _, _), CC_B(_, _, _), CC_A()) => 1 
  case CC_E() => 2 
}
}