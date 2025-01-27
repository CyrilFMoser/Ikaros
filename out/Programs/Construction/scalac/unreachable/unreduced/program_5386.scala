package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Int, Byte], T_A[Boolean]], b: T_A[T_A[Boolean]], c: T_B[Int, T_A[Int]]) extends T_A[T_A[T_B[Boolean, Boolean]]]
case class CC_B(a: Int) extends T_A[T_A[T_B[Boolean, Boolean]]]

val v_a: T_A[T_A[T_B[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(12) => 1 
  case CC_B(_) => 2 
}
}