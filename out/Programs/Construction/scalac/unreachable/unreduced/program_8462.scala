package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: F) extends T_A[E, F]
case class CC_B[H, G](a: T_A[(Int,Boolean), H], b: T_B[T_B[H, G], H]) extends T_A[H, G]
case class CC_C[J, I](a: Byte, b: T_A[J, J], c: T_B[I, I]) extends T_A[I, J]
case class CC_D(a: T_B[T_A[Boolean, Int], T_A[Int, Char]], b: T_A[CC_B[Char, Byte], T_B[Char, Int]]) extends T_B[CC_A[Char, Boolean], CC_A[T_B[(Byte,Int), Char], T_A[Int, Int]]]
case class CC_E(a: CC_B[Boolean, T_A[CC_D, CC_D]]) extends T_B[CC_A[Char, Boolean], CC_A[T_B[(Byte,Int), Char], T_A[Int, Int]]]

val v_a: T_A[CC_D, Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
  case CC_A(_) => 1 
  case CC_B(_, _) => 2 
  case CC_C(_, CC_A(_), _) => 3 
  case CC_C(_, CC_B(CC_B(_, _), _), _) => 4 
  case CC_C(_, CC_B(CC_C(_, _, _), _), _) => 5 
  case CC_C(_, CC_C(_, _, _), _) => 6 
}
}
// This is not matched: CC_C(_, CC_B(CC_A(_), _), _)