package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[D]
case class CC_B[E](a: E) extends T_A[E]
case class CC_C[F](a: CC_B[CC_A[F]], b: CC_A[F], c: Boolean) extends T_A[F]
case class CC_D(a: CC_C[CC_A[(Char,Byte)]], b: Int, c: T_A[T_B[Boolean, Char]]) extends T_B[(T_B[Int, Byte],Boolean), CC_C[(Boolean,Char)]]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(CC_C(_, _, _), _, CC_A(_))) => 0 
  case CC_A(CC_D(CC_C(_, _, _), _, CC_B(_))) => 1 
  case CC_A(CC_D(CC_C(_, _, _), _, CC_C(_, _, _))) => 2 
  case CC_B(CC_D(CC_C(_, _, _), _, CC_A(_))) => 3 
  case CC_B(CC_D(CC_C(_, _, _), _, CC_B(_))) => 4 
  case CC_B(CC_D(CC_C(_, _, _), _, CC_C(_, _, _))) => 5 
  case CC_C(_, CC_A(_), _) => 6 
}
}