package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[(T_B[Int],T_A[Byte, (Char,Boolean)]), D]
case class CC_B(a: T_A[T_B[Char], T_A[Int, Char]], b: CC_A[Int]) extends T_A[(T_B[Int],T_A[Byte, (Char,Boolean)]), CC_A[T_A[(Byte,Int), (Char,Byte)]]]
case class CC_C[E](a: CC_B, b: E) extends T_A[(T_B[Int],T_A[Byte, (Char,Boolean)]), E]
case class CC_D[F](a: (Boolean,Char), b: CC_B) extends T_B[F]
case class CC_E[G]() extends T_B[G]
case class CC_F[H](a: (CC_C[CC_B],Byte)) extends T_B[H]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B(_, CC_A())) => 0 
  case CC_E() => 1 
  case CC_F(_) => 2 
}
}