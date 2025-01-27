package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_B[(Int,Int)], T_A[(Char,Int), T_B[Int]]]
case class CC_B[D](a: T_A[D, D]) extends T_A[(Byte,Byte), D]
case class CC_C[E]() extends T_A[(Byte,Byte), E]
case class CC_D[F](a: T_B[F]) extends T_B[F]
case class CC_E[G](a: T_A[G, G]) extends T_B[G]

val v_a: CC_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
}
}