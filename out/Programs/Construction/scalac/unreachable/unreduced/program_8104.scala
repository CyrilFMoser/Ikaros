package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D], c: Boolean) extends T_A[D]
case class CC_B[E](a: (T_A[Char],(Char,Int)), b: T_A[E]) extends T_A[E]
case class CC_C[F](a: T_B[F, Byte], b: CC_B[F]) extends T_B[F, Byte]
case class CC_D[G, H](a: Char) extends T_B[G, Byte]

val v_a: T_B[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, CC_B(_, _)), CC_B(_, CC_A(_, _, _))) => 0 
  case CC_C(CC_C(_, CC_B(_, _)), CC_B(_, CC_B(_, _))) => 1 
  case CC_C(CC_D(_), CC_B(_, CC_A(_, _, _))) => 2 
  case CC_C(CC_D(_), CC_B(_, CC_B(_, _))) => 3 
  case CC_D(_) => 4 
}
}