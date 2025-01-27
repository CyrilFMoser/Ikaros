package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Int, b: T_B[Char, T_A[Int]], c: T_A[T_B[Byte, Boolean]]) extends T_A[T_A[T_B[Byte, Int]]]
case class CC_B(a: Boolean, b: T_A[T_B[Int, CC_A]], c: T_A[T_A[CC_A]]) extends T_A[T_A[T_B[Byte, Int]]]
case class CC_C[E, D](a: CC_A, b: T_B[D, D], c: CC_B) extends T_B[D, E]
case class CC_D[G, F](a: CC_B) extends T_B[G, F]
case class CC_E[I, H](a: I) extends T_B[H, I]

val v_a: T_B[T_A[T_A[T_B[Byte, Int]]], CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, CC_C(_, _, _), _), _, CC_B(_, _, _)) => 0 
  case CC_C(CC_A(_, CC_D(_), _), _, CC_B(_, _, _)) => 1 
  case CC_C(CC_A(_, CC_E(_), _), _, CC_B(_, _, _)) => 2 
  case CC_D(CC_B(_, _, _)) => 3 
  case CC_E(_) => 4 
}
}