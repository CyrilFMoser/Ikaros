package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: T_A[Int, Byte], c: T_A[C, C]) extends T_A[Int, C]
case class CC_B() extends T_A[Int, Int]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(0, _, CC_A(_, _, _))) => 0 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, CC_A(_, _, _))) => 1 
  case CC_A(_, CC_A(_, _, _), CC_A(0, _, CC_B())) => 2 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, CC_B())) => 3 
  case CC_A(_, CC_A(_, _, _), CC_B()) => 4 
  case CC_B() => 5 
}
}