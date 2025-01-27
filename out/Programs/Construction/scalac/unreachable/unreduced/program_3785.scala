package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_A[D], c: Int) extends T_A[D]
case class CC_B[E](a: E, b: T_B[E, E]) extends T_A[E]
case class CC_C[F](a: Boolean, b: T_B[F, F]) extends T_B[F, (T_A[Int],CC_A[Int])]
case class CC_D[G](a: Char, b: G) extends T_B[G, (T_A[Int],CC_A[Int])]
case class CC_E(a: T_A[T_A[Byte]], b: CC_C[(Byte,Byte)]) extends T_B[CC_C[T_A[Byte]], (T_A[Int],CC_A[Int])]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _), _), _) => 1 
  case CC_A(_, CC_B(_, _), _) => 2 
  case CC_B(_, _) => 3 
}
}