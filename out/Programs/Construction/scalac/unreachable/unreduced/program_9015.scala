package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: (T_B[Boolean, Int],T_B[Byte, (Byte,Boolean)])) extends T_A[F, E]
case class CC_B[G, H]() extends T_A[G, H]
case class CC_C[I](a: CC_A[(Char,Char), I], b: I) extends T_B[T_A[T_B[Byte, Char], T_A[Byte, Int]], I]
case class CC_D[J](a: J) extends T_B[T_A[T_B[Byte, Char], T_A[Byte, Int]], J]
case class CC_E() extends T_B[(T_A[Boolean, Byte],T_A[Boolean, Int]), Int]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B() => 1 
}
}