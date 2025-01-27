package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[Int, Int], b: T_A[Int, Int], c: T_A[(Int,(Char,Char)), T_A[(Boolean,Boolean), Byte]]) extends T_A[Int, Int]
case class CC_B() extends T_A[Int, Int]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(), _) => 1 
  case CC_B() => 2 
}
}