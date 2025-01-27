package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: E) extends T_A[T_B[T_A[Boolean, Int], T_B[(Byte,Char), Boolean]], E]
case class CC_B(a: Boolean) extends T_A[T_B[T_A[Boolean, Int], T_B[(Byte,Char), Boolean]], T_A[T_A[Int, Char], CC_A[Int]]]

val v_a: T_A[T_B[T_A[Boolean, Int], T_B[(Byte,Char), Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}