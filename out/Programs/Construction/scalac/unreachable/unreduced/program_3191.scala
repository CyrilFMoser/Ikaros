package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Boolean, b: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_B[E, E]) extends T_A[E]
case class CC_C[F](a: T_A[CC_A[(Boolean,Char)]], b: T_B[F, F]) extends T_A[F]
case class CC_D(a: Boolean, b: T_A[(Int,Boolean)], c: Byte) extends T_B[Char, T_A[Byte]]
case class CC_E() extends T_B[Char, T_A[Byte]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _))) => 1 
  case CC_A(_, CC_A(_, CC_C(_, _))) => 2 
  case CC_A(_, CC_B(CC_A(_, _), _)) => 3 
  case CC_A(_, CC_B(CC_B(_, _), _)) => 4 
  case CC_A(_, CC_B(CC_C(_, _), _)) => 5 
  case CC_A(_, CC_C(_, _)) => 6 
  case CC_B(_, _) => 7 
  case CC_C(_, _) => 8 
}
}