package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Int]], C]
case class CC_B[D](a: D) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Int]], D]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Int]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}