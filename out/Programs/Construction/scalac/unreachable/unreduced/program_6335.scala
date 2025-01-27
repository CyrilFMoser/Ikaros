package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[Int]]]
case class CC_B(a: (CC_A,CC_A)) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: T_A[Boolean], b: T_A[CC_B], c: CC_A) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),CC_A())) => 1 
  case CC_C(_, _, CC_A()) => 2 
}
}