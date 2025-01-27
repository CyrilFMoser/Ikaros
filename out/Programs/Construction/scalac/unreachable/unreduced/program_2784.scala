package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[Int, C]) extends T_A[Int, C]
case class CC_B[D](a: CC_A[D], b: Byte) extends T_A[Int, D]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _))) => 1 
  case CC_A(_, CC_B(CC_A(_, _), 0)) => 2 
  case CC_A(_, CC_B(CC_A(_, _), _)) => 3 
  case CC_B(_, 0) => 4 
  case CC_B(_, _) => 5 
}
}