package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[D, Byte]
case class CC_B(a: (CC_A[Boolean],CC_A[Byte]), b: T_B[Char]) extends T_A[T_A[T_A[Boolean, Byte], Char], Byte]

val v_a: T_A[T_A[T_A[Boolean, Byte], Char], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((CC_A(_),CC_A(_)), _) => 1 
}
}