package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, Int]]
case class CC_B(a: Int) extends T_A[(CC_A[Boolean],T_A[Char, Boolean]), T_A[(CC_A[Boolean],T_A[Char, Boolean]), Int]]
case class CC_C(a: T_A[CC_B, T_A[(Int,Int), CC_B]]) extends T_A[(CC_A[Boolean],T_A[Char, Boolean]), T_A[(CC_A[Boolean],T_A[Char, Boolean]), Int]]

val v_a: T_A[(CC_A[Boolean],T_A[Char, Boolean]), T_A[(CC_A[Boolean],T_A[Char, Boolean]), Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}