package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_B[Char, Byte]]]
case class CC_B[D, E](a: T_B[D, D], b: CC_A, c: T_B[T_B[D, D], E]) extends T_B[D, E]
case class CC_C[F](a: F, b: T_B[F, F], c: T_A[F]) extends T_B[(CC_B[(Char,Byte), CC_A],CC_A), F]
case class CC_D(a: CC_B[Boolean, T_B[CC_A, CC_A]], b: Char) extends T_B[(CC_B[(Char,Byte), CC_A],CC_A), CC_B[T_A[CC_A], CC_B[CC_A, CC_A]]]

val v_a: T_B[(CC_B[(Char,Byte), CC_A],CC_A), T_A[T_A[T_B[Char, Byte]]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(), _) => 0 
  case CC_C(_, _, _) => 1 
}
}