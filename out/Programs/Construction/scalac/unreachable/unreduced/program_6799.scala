package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D], c: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: CC_B[F], b: Byte, c: CC_B[F]) extends T_A[F]
case class CC_D[G](a: (T_A[Byte],CC_C[Int])) extends T_B[G, T_A[G]]
case class CC_E(a: T_B[T_A[Byte], T_A[(Boolean,Char)]], b: CC_B[T_A[Byte]], c: CC_C[T_A[Int]]) extends T_B[Boolean, T_A[Boolean]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(), _, _) => 1 
  case CC_A(CC_C(_, _, _), _, _) => 2 
  case CC_B() => 3 
  case CC_C(_, _, _) => 4 
}
}