package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[D, C]
case class CC_B[E]() extends T_A[E, (CC_A[Char, Byte],CC_A[Boolean, Char])]
case class CC_C[F](a: T_A[F, F]) extends T_A[F, (CC_A[Char, Byte],CC_A[Boolean, Char])]

val v_a: T_A[Int, (CC_A[Char, Byte],CC_A[Boolean, Char])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}