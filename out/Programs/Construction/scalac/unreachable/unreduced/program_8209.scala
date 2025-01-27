package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: Char, b: T_A[E, F], c: T_B[F, E]) extends T_A[T_B[T_A[Byte, Boolean], T_B[(Boolean,Byte), Char]], E]
case class CC_B[G](a: Char, b: Int) extends T_A[T_B[T_A[Byte, Boolean], T_B[(Boolean,Byte), Char]], G]

val v_a: T_A[T_B[T_A[Byte, Boolean], T_B[(Boolean,Byte), Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A('x', _, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_, 12) => 2 
  case CC_B(_, _) => 3 
}
}