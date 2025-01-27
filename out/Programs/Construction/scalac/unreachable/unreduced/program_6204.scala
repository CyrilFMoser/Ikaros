package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Char, b: T_A[B], c: T_A[B]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: T_A[CC_A[Byte]]) extends T_A[T_A[T_A[Char]]]
case class CC_C() extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}