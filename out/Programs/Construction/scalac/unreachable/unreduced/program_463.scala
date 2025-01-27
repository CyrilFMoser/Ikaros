package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean) extends T_A[T_A[Int]]
case class CC_B(a: CC_A, b: (T_A[CC_A],CC_A), c: T_A[CC_A]) extends T_A[T_A[Int]]
case class CC_C(a: CC_A, b: Char) extends T_A[(T_A[(Byte,Char)],CC_A)]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}