package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: Byte) extends T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Boolean]], C]
case class CC_B[D](a: CC_A[D], b: CC_A[D], c: Byte) extends T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Boolean]], D]

val v_a: T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}