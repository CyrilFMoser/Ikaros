package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int, b: Boolean, c: Char) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: T_A[T_A[CC_A]], b: T_A[T_A[CC_A]]) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}