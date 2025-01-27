package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, Int], c: T_A[C, C]) extends T_A[C, Int]
case class CC_B(a: T_A[T_A[Int, Int], Int]) extends T_A[T_A[(Int,Boolean), CC_A[Boolean]], Int]
case class CC_C[D](a: Boolean, b: T_A[D, Int], c: Int) extends T_A[D, Int]

val v_a: T_A[T_A[(Int,Boolean), CC_A[Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(_), _) => 1 
  case CC_A(_, CC_C(_, _, _), _) => 2 
  case CC_B(_) => 3 
  case CC_C(_, _, _) => 4 
}
}