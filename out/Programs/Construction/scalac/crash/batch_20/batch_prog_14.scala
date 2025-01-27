package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_B[(Int,Char)]]) extends T_A[Char, Int]
case class CC_B[E, D]() extends T_A[E, D]
case class CC_C[F](a: CC_A) extends T_B[F]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
}
}