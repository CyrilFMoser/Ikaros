package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[(Int,Boolean), (Int,Int)]) extends T_A[C, T_A[T_A[Byte, Char], T_A[Boolean, Int]]]
case class CC_B[D](a: CC_A[D], b: D) extends T_A[D, T_A[T_A[Byte, Char], T_A[Boolean, Int]]]

val v_a: T_A[Boolean, T_A[T_A[Byte, Char], T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}