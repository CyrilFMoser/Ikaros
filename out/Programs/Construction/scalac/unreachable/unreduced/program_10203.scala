package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_A[(Boolean,Char)]) extends T_A[T_A[T_A[Int]]]

val v_a: CC_A[T_A[T_A[T_A[Int]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_)) => 1 
}
}