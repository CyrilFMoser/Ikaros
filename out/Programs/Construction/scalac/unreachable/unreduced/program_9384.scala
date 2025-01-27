package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Char, b: Char) extends T_A[D]
case class CC_B[E](a: CC_A[E], b: T_B[E, E]) extends T_A[E]
case class CC_C[F](a: T_B[F, F], b: Byte, c: T_B[Boolean, T_A[(Byte,Char)]]) extends T_B[Boolean, F]
case class CC_D(a: T_B[T_B[Boolean, Char], CC_A[Byte]]) extends T_B[Boolean, T_A[T_B[Char, Byte]]]
case class CC_E(a: (T_B[Boolean, CC_D],Byte), b: T_A[(CC_D,Boolean)]) extends T_B[Boolean, T_A[T_B[Char, Byte]]]

val v_a: T_A[T_B[Boolean, T_A[T_B[Char, Byte]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}