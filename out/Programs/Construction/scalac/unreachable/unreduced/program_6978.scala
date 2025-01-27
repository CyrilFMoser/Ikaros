package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_A[E], c: T_A[E]) extends T_B[T_A[T_B[E, E]], E]
case class CC_C[F](a: (Int,CC_B[Boolean]), b: F, c: F) extends T_B[T_A[T_B[F, F]], F]
case class CC_D[G](a: T_B[G, G], b: CC_C[G]) extends T_B[G, CC_B[T_B[(Int,Byte), Byte]]]

val v_a: T_B[T_A[T_B[Int, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_A(_, _)), _, CC_A(_, CC_A(_, _))) => 0 
  case CC_C(_, _, _) => 1 
}
}