package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[T_A[Int, (Boolean,Boolean)], T_A[Byte, Boolean]], C]
case class CC_B[D](a: D) extends T_A[T_A[T_A[Int, (Boolean,Boolean)], T_A[Byte, Boolean]], D]
case class CC_C[E](a: E) extends T_A[T_A[T_A[Int, (Boolean,Boolean)], T_A[Byte, Boolean]], E]

val v_a: T_A[T_A[T_A[Int, (Boolean,Boolean)], T_A[Byte, Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}