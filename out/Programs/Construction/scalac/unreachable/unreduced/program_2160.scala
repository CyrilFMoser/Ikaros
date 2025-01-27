package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean, b: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_B(a: T_A[T_A[(Byte,Int)]], b: CC_A, c: CC_A) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(true, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(true, CC_A(_, CC_B(_, _, _))) => 1 
  case CC_A(true, CC_B(_, _, _)) => 2 
  case CC_A(false, CC_A(_, CC_A(_, _))) => 3 
  case CC_A(false, CC_A(_, CC_B(_, _, _))) => 4 
  case CC_A(false, CC_B(_, _, _)) => 5 
  case CC_B(_, CC_A(_, _), CC_A(_, _)) => 6 
}
}