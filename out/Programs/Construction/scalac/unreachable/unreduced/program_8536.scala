package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Int]], b: Char) extends T_A[T_B[T_A[(Char,Byte)], T_A[Byte]]]
case class CC_B[E, D](a: T_B[E, E], b: T_A[D], c: T_A[D]) extends T_B[D, E]
case class CC_C[F]() extends T_B[F, Int]
case class CC_D[G](a: T_B[G, Int], b: CC_C[G], c: T_B[G, Char]) extends T_B[G, Int]

val v_a: T_B[Int, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
  case CC_D(_, _, CC_B(_, _, _)) => 2 
}
}