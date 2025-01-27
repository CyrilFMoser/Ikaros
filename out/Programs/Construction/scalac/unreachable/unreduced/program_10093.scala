package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[Int], b: B) extends T_A[Int]
case class CC_B(a: CC_A[CC_A[Byte]], b: T_A[(Char,Char)], c: T_A[Char]) extends T_A[Int]
case class CC_C() extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _), _) => 1 
  case CC_A(CC_A(CC_C(), _), _) => 2 
  case CC_A(CC_B(_, _, _), _) => 3 
  case CC_A(CC_C(), _) => 4 
  case CC_B(CC_A(_, _), _, _) => 5 
  case CC_C() => 6 
}
}