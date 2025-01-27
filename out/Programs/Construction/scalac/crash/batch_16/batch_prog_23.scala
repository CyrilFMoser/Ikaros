package Program_23 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B], c: T_A[B]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A[CC_A[Byte]], b: CC_A[CC_A[(Byte,Int)]], c: CC_A[CC_A[Boolean]]) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}