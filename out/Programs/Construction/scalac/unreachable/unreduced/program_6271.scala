package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: ((Int,Byte),T_A[Int]), b: T_A[Int], c: T_A[T_A[(Int,Int)]]) extends T_A[T_A[Int]]
case class CC_B(a: CC_A) extends T_A[T_A[Int]]
case class CC_C(a: Char, b: T_A[T_A[CC_A]], c: Char) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C('x', _, 'x') => 2 
  case CC_C(_, _, 'x') => 3 
  case CC_C('x', _, _) => 4 
  case CC_C(_, _, _) => 5 
}
}