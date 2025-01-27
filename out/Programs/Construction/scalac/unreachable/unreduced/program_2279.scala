package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Char]) extends T_A[Char]
case class CC_B(a: Char, b: T_A[Char], c: Int) extends T_A[Char]
case class CC_C[C](a: T_A[C], b: C) extends T_B[C]
case class CC_D[D]() extends T_B[D]
case class CC_E(a: T_A[Int], b: T_A[T_B[(Int,Int)]], c: CC_C[Boolean]) extends T_B[CC_D[CC_D[(Int,Byte)]]]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_, _, _)) => 0 
  case CC_D() => 1 
}
}