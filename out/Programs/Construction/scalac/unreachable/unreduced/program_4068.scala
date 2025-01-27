package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[Boolean], c: T_A[Char]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: T_A[CC_A], b: T_A[Char], c: T_A[Boolean]) extends T_A[T_A[T_A[Char]]]
case class CC_C() extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}