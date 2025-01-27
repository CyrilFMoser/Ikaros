package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_B[Byte, Boolean], T_B[Char, Boolean]], b: T_B[((Int,Int),Int), T_B[Int, Boolean]]) extends T_A[T_A[T_B[Boolean, Boolean], T_A[Char, Byte]], T_B[Int, Char]]
case class CC_B[E](a: T_A[E, E], b: (Boolean,T_B[CC_A, CC_A]), c: E) extends T_B[Int, E]
case class CC_C(a: CC_A, b: (T_B[Int, Byte],Byte), c: T_B[(Byte,CC_A), T_B[CC_A, CC_A]]) extends T_B[Int, Byte]
case class CC_D[F](a: F) extends T_B[Int, F]

val v_a: T_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_C(_, _, _)