package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: Int) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: CC_A, b: T_A[T_A[CC_A]]) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: Int) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
  case CC_A(_, _) => 1 
  case CC_B(CC_A(_, _), _) => 2 
  case CC_C(_) => 3 
}
}