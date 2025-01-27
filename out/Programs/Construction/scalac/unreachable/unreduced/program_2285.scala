package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Char, b: T_B[Byte], c: T_B[T_A[Int, Int]]) extends T_A[T_A[T_A[Char, Boolean], (Int,(Byte,Char))], T_B[Boolean]]
case class CC_B(a: CC_A, b: Int, c: T_A[T_A[CC_A, (Char,Int)], CC_A]) extends T_A[T_A[T_A[Char, Boolean], (Int,(Byte,Char))], T_B[Boolean]]
case class CC_C[D](a: T_B[D], b: T_A[D, D], c: Byte) extends T_B[D]
case class CC_D[E](a: CC_A, b: E, c: E) extends T_B[E]
case class CC_E[F](a: T_B[F], b: T_B[F]) extends T_B[F]

val v_a: T_A[T_A[T_A[Char, Boolean], (Int,(Byte,Char))], T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, CC_D(_, _, _), _), _, _) => 1 
  case CC_B(CC_A(_, CC_E(_, _), _), _, _) => 2 
}
}
// This is not matched: CC_B(CC_A(_, CC_C(_, _, _), _), _, _)