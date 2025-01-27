package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Int, b: Boolean, c: Int) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_B[T_A[Boolean], CC_A], b: T_A[((Int,Char),CC_A)]) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, true, _) => 0 
  case CC_A(_, false, _) => 1 
  case CC_B(_, _) => 2 
}
}