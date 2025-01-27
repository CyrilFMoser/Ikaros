package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Int]]) extends T_A[T_A[T_B[Boolean]]]
case class CC_B(a: (CC_A,T_A[Int]), b: (T_A[CC_A],(CC_A,CC_A))) extends T_A[T_A[T_B[Boolean]]]
case class CC_C() extends T_A[T_A[T_B[Boolean]]]
case class CC_D[C](a: C, b: C) extends T_B[C]
case class CC_E[D](a: T_A[D], b: T_B[D], c: CC_D[D]) extends T_B[D]

val v_a: T_A[T_A[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, (_,(_,_))) => 1 
  case CC_C() => 2 
}
}