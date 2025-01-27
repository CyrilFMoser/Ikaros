package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: T_A[Boolean], b: Char) extends T_A[T_A[C]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: (CC_B Wildcard (T_A (T_A (T_A Char Char) (T_A Char Char)) (T_A Char Char)))