package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_A) extends T_A
case class CC_B(a: T_B[CC_A[Int], (T_A,Int)], b: T_A, c: Byte) extends T_A
case class CC_C[D]() extends T_B[CC_B, D]
case class CC_D[E](a: T_B[E, E], b: E, c: E) extends T_B[CC_B, E]
case class CC_E[F](a: Byte, b: T_A) extends T_B[CC_B, F]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_B(_, CC_A(_), _)) => 2 
  case CC_A(CC_B(_, CC_B(_, _, _), _)) => 3 
  case CC_B(_, CC_A(_), _) => 4 
  case CC_B(_, CC_B(_, _, _), _) => 5 
}
}