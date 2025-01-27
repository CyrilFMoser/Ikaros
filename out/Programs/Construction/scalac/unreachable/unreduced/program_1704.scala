package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int]) extends T_A[Int]
case class CC_B(a: T_A[T_A[CC_A]], b: Byte, c: T_A[Int]) extends T_A[Int]
case class CC_C() extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_C()) => 1 
  case CC_B(_, _, CC_A(_)) => 2 
  case CC_B(_, _, CC_B(_, _, _)) => 3 
  case CC_B(_, _, CC_C()) => 4 
  case CC_C() => 5 
}
}
// This is not matched: CC_A(CC_B(_, _, _))