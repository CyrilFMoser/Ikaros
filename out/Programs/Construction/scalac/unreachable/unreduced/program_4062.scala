package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: E, c: T_B[E, CC_A[E]]) extends T_A[E]
case class CC_C[F](a: CC_B[F], b: F) extends T_A[CC_A[(Boolean,Int)]]
case class CC_D(a: T_A[Char]) extends T_B[CC_C[CC_B[Boolean]], CC_B[T_A[Byte]]]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_A(_, CC_A(CC_A(_, _), CC_B(_, _, _))) => 1 
  case CC_A(_, CC_A(CC_B(_, _, _), CC_A(_, _))) => 2 
  case CC_A(_, CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 3 
  case CC_A(_, CC_B(_, CC_D(_), _)) => 4 
  case CC_B(_, CC_D(CC_A(_, _)), _) => 5 
  case CC_B(_, CC_D(CC_B(_, _, _)), _) => 6 
}
}