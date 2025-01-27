package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: Byte) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: CC_A[CC_A[Boolean]], b: CC_A[T_A[Int]]) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, CC_A(_, _)) => 2 
}
}