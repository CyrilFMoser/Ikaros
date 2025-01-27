package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: Boolean) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: (T_A[CC_A],CC_A)) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: CC_A, b: T_A[Char], c: T_A[Boolean]) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((_,_)) => 1 
  case CC_C(CC_A(_, _), _, _) => 2 
}
}