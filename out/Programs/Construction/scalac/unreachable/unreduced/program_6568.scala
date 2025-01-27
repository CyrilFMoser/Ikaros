package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_A[CC_A], b: Byte) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: Int, b: ((Int,CC_B),T_A[CC_A])) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, ((_,_),_)) => 2 
}
}