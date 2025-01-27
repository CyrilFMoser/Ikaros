package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Byte, b: T_A[D], c: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C[F]() extends T_B[F, Int]
case class CC_D[G](a: CC_A[G], b: T_A[G], c: CC_A[G]) extends T_B[G, Int]
case class CC_E[H]() extends T_B[H, Int]

val v_a: T_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(_, CC_A(_, _, _), _), _, CC_A(_, CC_A(_, _, _), _)) => 1 
  case CC_D(CC_A(_, CC_B(_), _), _, CC_A(_, CC_A(_, _, _), _)) => 2 
  case CC_D(CC_A(_, CC_A(_, _, _), _), _, CC_A(_, CC_B(_), _)) => 3 
  case CC_D(CC_A(_, CC_B(_), _), _, CC_A(_, CC_B(_), _)) => 4 
  case CC_E() => 5 
}
}