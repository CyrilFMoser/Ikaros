package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[T_A[Boolean, Char], Boolean], C]
case class CC_B(a: CC_A[(Int,Int)], b: (CC_A[Char],CC_A[Char]), c: T_A[CC_A[(Char,Int)], (Byte,Byte)]) extends T_A[T_A[T_A[Boolean, Char], Boolean], CC_A[Int]]

val v_a: T_A[T_A[T_A[Boolean, Char], Boolean], CC_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_B(_, (CC_A(_),CC_A(_)), _) => 1 
}
}