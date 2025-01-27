package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: ((Char,Int),Char), b: E, c: (T_A[Byte, Byte],T_B[Boolean, Byte])) extends T_A[T_A[Boolean, T_A[Char, Char]], E]
case class CC_B[F]() extends T_A[T_A[Boolean, T_A[Char, Char]], F]
case class CC_C[G, H](a: CC_B[H], b: T_B[G, G]) extends T_B[G, H]
case class CC_D[I, J](a: CC_B[I], b: I) extends T_B[I, J]
case class CC_E[K](a: T_A[T_B[K, K], K], b: (Boolean,CC_A[Int]), c: Byte) extends T_B[CC_A[T_B[Byte, Int]], K]

val v_a: T_B[CC_A[T_B[Byte, Int]], Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(), CC_C(_, _)) => 0 
  case CC_C(CC_B(), CC_D(CC_B(), _)) => 1 
  case CC_C(CC_B(), CC_E(_, _, 0)) => 2 
  case CC_C(CC_B(), CC_E(_, _, _)) => 3 
  case CC_D(_, _) => 4 
  case CC_E(_, (_,CC_A(_, _, _)), _) => 5 
}
}