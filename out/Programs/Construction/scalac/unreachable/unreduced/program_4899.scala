package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B], c: Byte) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_A[T_A[Byte]], b: CC_A[CC_A[Int]], c: Int) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _), _) => 1 
}
}