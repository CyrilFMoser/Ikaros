package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: T_A[T_A[Byte]], c: T_A[Int]) extends T_A[Int]
case class CC_B[B](a: Int, b: Byte) extends T_A[Int]
case class CC_C() extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_A(CC_A(_, _, _), _, CC_A(CC_B(_, _), _, _)) => 1 
  case CC_A(CC_A(_, _, _), _, CC_A(CC_C(), _, _)) => 2 
  case CC_A(CC_A(_, _, _), _, CC_B(12, _)) => 3 
  case CC_A(CC_A(_, _, _), _, CC_B(_, _)) => 4 
  case CC_A(CC_A(_, _, _), _, CC_C()) => 5 
  case CC_A(CC_B(_, _), _, CC_A(CC_A(_, _, _), _, _)) => 6 
  case CC_A(CC_B(_, _), _, CC_A(CC_B(_, _), _, _)) => 7 
  case CC_A(CC_B(_, _), _, CC_B(12, _)) => 8 
  case CC_A(CC_B(_, _), _, CC_B(_, _)) => 9 
  case CC_A(CC_B(_, _), _, CC_C()) => 10 
  case CC_A(CC_C(), _, CC_A(CC_A(_, _, _), _, _)) => 11 
  case CC_A(CC_C(), _, CC_A(CC_B(_, _), _, _)) => 12 
  case CC_A(CC_C(), _, CC_A(CC_C(), _, _)) => 13 
  case CC_A(CC_C(), _, CC_B(12, _)) => 14 
  case CC_A(CC_C(), _, CC_B(_, _)) => 15 
  case CC_A(CC_C(), _, CC_C()) => 16 
  case CC_B(_, _) => 17 
  case CC_C() => 18 
}
}
// This is not matched: CC_A(CC_B(_, _), _, CC_A(CC_C(), _, _))