package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C], b: Char, c: T_B) extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C() extends T_B
case class CC_D(a: T_A[T_B, T_A[T_B, (Boolean,Int)]], b: CC_A[CC_C]) extends T_B
case class CC_E(a: T_A[CC_C, CC_A[(Int,Char)]], b: T_A[T_B, CC_B[Int]], c: Char) extends T_B

val v_a: T_A[T_B, CC_C] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_C()) => 0 
  case CC_A(CC_A(_, _, _), _, CC_D(CC_A(_, _, _), CC_A(_, _, _))) => 1 
  case CC_A(CC_A(_, _, _), _, CC_D(CC_B(), CC_A(_, _, _))) => 2 
  case CC_A(CC_A(_, _, _), _, CC_E(_, _, _)) => 3 
  case CC_A(CC_B(), _, CC_C()) => 4 
  case CC_A(CC_B(), _, CC_D(CC_A(_, _, _), CC_A(_, _, _))) => 5 
  case CC_A(CC_B(), _, CC_D(CC_B(), CC_A(_, _, _))) => 6 
  case CC_A(CC_B(), _, CC_E(_, _, _)) => 7 
}
}
// This is not matched: CC_B()