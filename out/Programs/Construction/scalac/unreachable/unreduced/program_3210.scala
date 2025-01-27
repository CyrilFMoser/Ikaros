package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Boolean, b: T_A[B], c: T_A[B]) extends T_A[T_A[T_A[Char]]]
case class CC_B() extends T_A[T_A[T_A[Char]]]
case class CC_C(a: T_A[CC_A[CC_B]], b: CC_A[CC_A[Int]]) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}