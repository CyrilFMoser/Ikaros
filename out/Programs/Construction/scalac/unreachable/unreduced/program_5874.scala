package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: (T_A[CC_A],T_A[Int]), b: (CC_A,T_A[Int]), c: Int) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: CC_B) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(CC_B((_,_), (_,_), _)) => 1 
}
}
// This is not matched: CC_B(_, _, _)