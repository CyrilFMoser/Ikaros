package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[T_B[T_A[Char, Byte]], D]
case class CC_B[E](a: CC_A[E]) extends T_A[T_B[T_A[Char, Byte]], E]
case class CC_C[F](a: Int) extends T_B[F]
case class CC_D[G](a: T_B[G], b: Byte, c: T_A[G, G]) extends T_B[G]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_C(_), _, _) => 1 
  case CC_D(CC_D(CC_C(_), _, _), _, _) => 2 
  case CC_D(CC_D(CC_D(_, _, _), _, _), _, _) => 3 
}
}