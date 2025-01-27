package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B(a: T_B[T_B[Boolean, Char], (Boolean,Char)], b: CC_A[CC_A[Char]]) extends T_A[CC_A[T_B[(Boolean,Byte), Int]]]
case class CC_C(a: CC_A[Int], b: CC_B, c: CC_A[CC_A[CC_B]]) extends T_A[CC_A[T_B[(Boolean,Byte), Int]]]
case class CC_D[E](a: T_A[T_A[E]]) extends T_B[CC_C, E]
case class CC_E[F]() extends T_B[CC_C, F]

val v_a: T_B[CC_C, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_)) => 0 
  case CC_E() => 1 
}
}