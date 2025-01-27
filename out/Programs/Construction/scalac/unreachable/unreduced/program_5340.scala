package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[C, T_A[T_A[Int, Boolean], T_A[Int, Char]]]
case class CC_B[D](a: T_A[D, CC_A[D]]) extends T_A[D, T_A[T_A[Int, Boolean], T_A[Int, Char]]]

val v_a: T_A[Boolean, T_A[T_A[Int, Boolean], T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}