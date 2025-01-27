package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Byte, Char], T_A[Boolean, Int]], C]
case class CC_B[D](a: D) extends T_A[T_A[T_A[Byte, Char], T_A[Boolean, Int]], D]

val v_a: T_A[T_A[T_A[Byte, Char], T_A[Boolean, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}