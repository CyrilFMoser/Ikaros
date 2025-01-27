package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[T_A[D], D]) extends T_A[D]
case class CC_B[E, F](a: T_A[F]) extends T_A[E]
case class CC_C[G](a: CC_A[G]) extends T_A[G]
case class CC_D(a: Char) extends T_B[T_B[Int, (Int,Int)], T_A[Char]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}