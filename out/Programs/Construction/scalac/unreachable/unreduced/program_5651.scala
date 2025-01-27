package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: Boolean) extends T_A[T_B[(Byte,Byte), T_B[Boolean, Boolean]], E]
case class CC_B[F](a: F) extends T_A[T_B[(Byte,Byte), T_B[Boolean, Boolean]], F]

val v_a: T_A[T_B[(Byte,Byte), T_B[Boolean, Boolean]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}