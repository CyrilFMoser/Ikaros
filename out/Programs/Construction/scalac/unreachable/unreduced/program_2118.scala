package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: T_A[Boolean], b: T_A[T_A[CC_A]]) extends T_A[T_A[T_A[Char]]]
case class CC_C() extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
  case CC_A(_) => 1 
  case CC_B(_, _) => 2 
  case CC_C() => 3 
}
}