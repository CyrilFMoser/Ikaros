package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: Byte, b: Int, c: Int) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: (CC_A,T_A[CC_B]), b: T_A[CC_B], c: CC_A) extends T_A[CC_B]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}