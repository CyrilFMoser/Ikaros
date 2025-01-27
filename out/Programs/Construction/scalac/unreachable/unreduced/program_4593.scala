package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: T_A[Int], c: T_A[(Int,Byte)]) extends T_A[Int]
case class CC_B(a: Int, b: T_A[Int]) extends T_A[Int]
case class CC_C[B]() extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(_, _), _, _) => 1 
  case CC_A(CC_C(), _, _) => 2 
  case CC_B(_, _) => 3 
  case CC_C() => 4 
}
}