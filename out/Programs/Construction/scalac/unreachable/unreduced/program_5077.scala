package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Char,Boolean)], b: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Int]]]
case class CC_B[B]() extends T_A[T_A[T_A[Int]]]
case class CC_C(a: (CC_A,CC_B[CC_A]), b: (CC_A,T_A[Boolean]), c: CC_A) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, (CC_A(_, _),_), CC_A(_, _)) => 2 
}
}