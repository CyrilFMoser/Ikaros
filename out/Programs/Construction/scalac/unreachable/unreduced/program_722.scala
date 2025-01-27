package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: CC_A, b: Int, c: T_A[CC_A]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: (T_A[CC_B],T_A[CC_A])) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), 12, _) => 1 
  case CC_B(CC_A(), _, _) => 2 
  case CC_C((_,_)) => 3 
}
}