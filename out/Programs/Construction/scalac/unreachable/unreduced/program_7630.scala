package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: (CC_A,T_A[CC_A]), b: T_B[CC_A], c: CC_A) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: T_A[T_A[CC_B]], b: CC_A, c: (Int,CC_B)) extends T_A[T_A[T_A[Int]]]
case class CC_D() extends T_B[T_A[CC_B]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((CC_A(_),_), _, CC_A(_)) => 1 
  case CC_C(_, _, _) => 2 
}
}