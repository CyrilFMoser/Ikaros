package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, E]) extends T_A[E, Int]
case class CC_B[F](a: T_A[F, Int]) extends T_B[F, T_A[T_A[(Byte,Byte), Boolean], Boolean]]
case class CC_C[G]() extends T_B[T_A[T_A[(Boolean,Boolean), Int], CC_B[Char]], T_A[T_A[(Byte,Byte), Boolean], Boolean]]
case class CC_D[H](a: Byte) extends T_B[CC_C[(Int,Byte)], H]

val v_a: T_B[CC_C[(Int,Byte)], T_A[T_A[(Byte,Byte), Boolean], Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_D(_) => 1 
}
}