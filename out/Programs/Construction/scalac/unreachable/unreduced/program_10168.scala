package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[F, E], b: T_B[F, E]) extends T_A[E, F]
case class CC_B() extends T_A[CC_A[Boolean, T_A[(Char,Boolean), Int]], (T_A[(Byte,Char), Int],CC_A[Char, Char])]
case class CC_C(a: CC_B, b: Char) extends T_B[T_A[CC_B, T_A[CC_B, CC_B]], T_A[T_A[(Int,Boolean), CC_B], (Boolean,CC_B)]]
case class CC_D(a: T_A[Boolean, (Boolean,Char)]) extends T_B[T_A[CC_B, T_A[CC_B, CC_B]], T_A[T_A[(Int,Boolean), CC_B], (Boolean,CC_B)]]
case class CC_E(a: CC_D, b: CC_B) extends T_B[T_A[CC_B, T_A[CC_B, CC_B]], T_A[T_A[(Int,Boolean), CC_B], (Boolean,CC_B)]]

val v_a: T_B[T_A[CC_B, T_A[CC_B, CC_B]], T_A[T_A[(Int,Boolean), CC_B], (Boolean,CC_B)]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_A(_, _)) => 1 
}
}
// This is not matched: CC_E(_, _)