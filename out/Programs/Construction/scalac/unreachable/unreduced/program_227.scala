package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Boolean],T_A[Int]), b: T_A[T_A[Boolean]], c: T_A[T_A[Char]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_A[CC_A], b: (T_A[CC_A],T_A[CC_A]), c: T_A[T_A[CC_A]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: CC_B, b: (Boolean,(CC_A,CC_A))) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, (_,_)) => 1 
}
}
// This is not matched: CC_B(_, _, _)