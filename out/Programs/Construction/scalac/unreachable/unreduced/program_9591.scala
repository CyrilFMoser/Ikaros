package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Int],T_A[(Byte,Boolean)])) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_A[CC_A], b: T_A[T_A[CC_A]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C() extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}