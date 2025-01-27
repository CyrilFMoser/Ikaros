package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B[F, E](a: Char, b: Char) extends T_A[E, F]
case class CC_C[G]() extends T_B
case class CC_D(a: T_B, b: (T_A[T_B, T_B],CC_A[Boolean, (Int,Char)])) extends T_B
case class CC_E(a: T_B, b: T_A[T_A[Boolean, T_B], CC_D], c: Byte) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
}
}