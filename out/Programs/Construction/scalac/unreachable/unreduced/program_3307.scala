package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[Int], b: T_A[Int], c: T_A[Int]) extends T_A[Int]
case class CC_B(a: (Char,Int), b: (CC_A[Boolean],CC_A[Boolean]), c: T_A[(Char,Boolean)]) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _, _), _, _) => 1 
  case CC_A(CC_B(_, _, _), _, _) => 2 
  case CC_B(_, _, _) => 3 
}
}