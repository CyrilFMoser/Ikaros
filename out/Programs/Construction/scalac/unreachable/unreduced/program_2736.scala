package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[T_A[Int, Byte], T_A[Boolean, Boolean]], C]
case class CC_B[D](a: D, b: D) extends T_A[T_A[T_A[Int, Byte], T_A[Boolean, Boolean]], D]

val v_a: T_A[T_A[T_A[Int, Byte], T_A[Boolean, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}