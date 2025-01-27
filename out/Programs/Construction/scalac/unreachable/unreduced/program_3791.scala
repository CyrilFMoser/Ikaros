package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[(Byte,Char), (Byte,Byte)]]
case class CC_B(a: ((Boolean,(Boolean,Char)),T_B[Byte, Char]), b: (T_B[Char, Byte],T_B[(Byte,Char), Boolean])) extends T_A[T_B[T_B[Boolean, Byte], Byte], T_B[(Byte,Char), (Byte,Byte)]]
case class CC_C[F](a: F) extends T_B[F, CC_A[Char]]
case class CC_D[G]() extends T_B[G, CC_A[Char]]
case class CC_E() extends T_B[T_A[CC_D[Char], CC_A[CC_B]], CC_A[Char]]

val v_a: T_B[T_A[CC_D[Char], CC_A[CC_B]], CC_A[Char]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_E()