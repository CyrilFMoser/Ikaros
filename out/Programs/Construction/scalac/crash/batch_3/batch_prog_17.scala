package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[E, D]
case class CC_B() extends T_A[CC_A[T_A[Int, Char], CC_A[Int, Int]], T_A[CC_A[Byte, Int], T_B[Int]]]
case class CC_C[F](a: CC_B) extends T_B[F]
case class CC_D[G]() extends T_B[G]
case class CC_E() extends T_B[Int]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
}
}
// This is not matched: CC_D()