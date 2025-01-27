package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Char, b: T_A[T_A[B]], c: T_A[B]) extends T_A[T_A[T_A[Byte]]]
case class CC_B() extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: (Char,T_A[CC_B])) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A('x', _, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B() => 2 
  case CC_C((_,_)) => 3 
}
}