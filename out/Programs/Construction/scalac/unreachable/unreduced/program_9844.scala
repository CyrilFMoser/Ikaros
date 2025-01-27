package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[Int]]]
case class CC_B(a: CC_A, b: (CC_A,T_A[CC_A])) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: T_A[T_A[CC_A]], b: CC_A, c: Int) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (CC_A(),_)) => 1 
  case CC_C(_, _, _) => 2 
}
}