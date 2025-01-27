package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: Char, c: D) extends T_A[T_B[T_A[Byte, Byte]], D]
case class CC_B[E](a: Char) extends T_A[CC_A[T_A[(Int,Byte), Int]], E]
case class CC_C[F](a: CC_A[F], b: T_B[F], c: T_A[F, CC_B[F]]) extends T_A[CC_A[T_A[(Int,Byte), Int]], F]
case class CC_D[G]() extends T_B[G]

val v_a: T_A[CC_A[T_A[(Int,Byte), Int]], Char] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, CC_D(), _) => 1 
}
}