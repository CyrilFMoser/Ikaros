package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Byte]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: Char, b: CC_A, c: CC_A) extends T_A[T_A[T_A[Int]]]
case class CC_C[B](a: T_A[B], b: T_A[B], c: T_A[T_A[CC_A]]) extends T_A[T_A[CC_A]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}