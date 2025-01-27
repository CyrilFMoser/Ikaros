package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean, b: T_A[T_A[Int]], c: Boolean) extends T_A[T_A[Int]]
case class CC_B(a: Byte, b: (CC_A,T_A[CC_A]), c: T_A[Byte]) extends T_A[T_A[Int]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(_, _, _), _) => 1 
}
}