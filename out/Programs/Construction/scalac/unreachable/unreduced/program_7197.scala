package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[T_A[Char, Byte], (Boolean,Char)], T_B[T_A[Int, Boolean], (Int,Int)]]
case class CC_B[G, F](a: CC_A[G]) extends T_B[G, F]
case class CC_C[H, I](a: T_A[H, I], b: T_B[H, H], c: CC_A[H]) extends T_B[I, H]
case class CC_D[J, K]() extends T_B[J, K]

val v_a: T_B[Boolean, T_A[T_B[T_A[Char, Byte], (Boolean,Char)], T_B[T_A[Int, Boolean], (Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, CC_B(CC_A()), _) => 1 
  case CC_C(_, CC_C(_, CC_B(_), CC_A()), _) => 2 
  case CC_C(_, CC_C(_, CC_C(_, _, _), CC_A()), _) => 3 
  case CC_C(_, CC_C(_, CC_D(), CC_A()), _) => 4 
  case CC_C(_, CC_D(), _) => 5 
}
}
// This is not matched: CC_D()