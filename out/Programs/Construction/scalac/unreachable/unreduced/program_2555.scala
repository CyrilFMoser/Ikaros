package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Int) extends T_A[T_A[T_A[Int, Boolean], T_B[Boolean]], D]
case class CC_B[E](a: T_B[CC_A[((Char,Char),Int)]], b: T_A[E, E]) extends T_B[E]
case class CC_C[G](a: CC_B[G], b: CC_B[G], c: T_B[G]) extends T_B[G]
case class CC_D[H](a: H, b: T_B[H], c: T_B[H]) extends T_B[H]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(_, CC_B(CC_B(_, _), _), _) => 2 
  case CC_D(_, CC_B(CC_C(_, _, _), _), _) => 3 
  case CC_D(_, CC_C(_, _, _), _) => 4 
  case CC_D(_, CC_D(_, _, _), _) => 5 
}
}
// This is not matched: CC_D(_, CC_B(CC_D(_, _, _), _), _)