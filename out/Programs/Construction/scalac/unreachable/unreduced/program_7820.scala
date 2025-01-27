package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: (T_A[Char],T_A[Byte]), c: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: Int, b: (T_A[CC_A],CC_A)) extends T_A[T_A[T_A[CC_A]]]
case class CC_C() extends T_A[T_A[T_A[CC_A]]]

val v_a: T_A[T_A[T_A[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,CC_A(_, _, _))) => 0 
  case CC_C() => 1 
}
}