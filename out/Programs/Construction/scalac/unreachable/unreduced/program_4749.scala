package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, T_A[C, Int]]) extends T_A[C, T_A[C, Int]]
case class CC_B[D](a: D, b: T_A[D, T_A[D, Int]]) extends T_A[D, T_A[D, Int]]
case class CC_C() extends T_A[T_A[(Boolean,Char), CC_B[Boolean]], T_A[T_A[(Boolean,Char), CC_B[Boolean]], Int]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _))) => 1 
  case CC_A(_, CC_B(_, CC_A(_, _))) => 2 
  case CC_A(_, CC_B(_, CC_B(_, _))) => 3 
  case CC_B(_, CC_A(_, CC_A(_, _))) => 4 
  case CC_B(_, CC_A(_, CC_B(_, _))) => 5 
  case CC_B(_, CC_B(_, _)) => 6 
}
}