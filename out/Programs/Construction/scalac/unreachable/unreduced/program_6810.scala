package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[Boolean, E]
case class CC_B[F](a: T_A[F, F], b: CC_A[F], c: T_A[F, F]) extends T_A[Boolean, F]
case class CC_C[G](a: CC_B[G], b: (T_A[(Char,Byte), Int],T_B[Byte, Int]), c: Char) extends T_A[Boolean, G]
case class CC_D[H, I]() extends T_B[I, H]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, (_,CC_D()), _) => 2 
}
}