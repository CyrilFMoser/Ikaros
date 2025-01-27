package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, Int]
case class CC_B[E]() extends T_A[E, Int]
case class CC_C[F](a: F) extends T_A[F, Int]
case class CC_D[G](a: CC_B[G], b: (T_A[Byte, (Int,Char)],CC_A[Int])) extends T_B[G]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B()