package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[Int, C]) extends T_A[Int, C]
case class CC_B[D](a: Boolean, b: T_A[D, D], c: D) extends T_A[Int, D]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(0, CC_A(0, CC_A(_, _))) => 0 
  case CC_A(0, CC_A(0, CC_B(_, _, _))) => 1 
  case CC_A(0, CC_A(_, CC_A(_, _))) => 2 
  case CC_A(0, CC_A(_, CC_B(_, _, _))) => 3 
  case CC_A(0, CC_B(_, _, _)) => 4 
  case CC_A(_, CC_A(0, CC_A(_, _))) => 5 
  case CC_A(_, CC_A(0, CC_B(_, _, _))) => 6 
  case CC_A(_, CC_A(_, CC_A(_, _))) => 7 
  case CC_A(_, CC_A(_, CC_B(_, _, _))) => 8 
  case CC_A(_, CC_B(_, _, _)) => 9 
  case CC_B(_, _, _) => 10 
}
}