package Program_21 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: T_A[(Char,Byte)], c: T_A[Int]) extends T_A[Int]
case class CC_B() extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(0, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(0, _, CC_A(_, _, CC_B())) => 1 
  case CC_A(0, _, CC_B()) => 2 
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 3 
  case CC_A(_, _, CC_A(_, _, CC_B())) => 4 
  case CC_A(_, _, CC_B()) => 5 
  case CC_B() => 6 
}
}