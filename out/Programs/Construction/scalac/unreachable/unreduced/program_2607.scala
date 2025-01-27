package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[(T_B[Byte],T_B[Byte]), D]
case class CC_B[E](a: E) extends T_A[(T_B[Byte],T_B[Byte]), E]
case class CC_C[F]() extends T_A[(T_B[Byte],T_B[Byte]), F]
case class CC_D(a: CC_A[T_A[Int, Byte]]) extends T_B[CC_C[CC_C[Char]]]
case class CC_E(a: T_A[CC_D, T_A[CC_D, CC_D]], b: T_B[CC_A[(Char,Char)]]) extends T_B[CC_C[CC_C[Char]]]
case class CC_F(a: (T_B[CC_D],T_B[CC_D])) extends T_B[T_B[T_A[CC_E, (Boolean,Int)]]]

val v_a: T_A[(T_B[Byte],T_B[Byte]), T_B[CC_C[CC_C[Char]]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_D(CC_A())) => 1 
  case CC_B(CC_E(_, _)) => 2 
  case CC_C() => 3 
}
}