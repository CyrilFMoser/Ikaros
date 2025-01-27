package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Byte, b: T_A[D, D]) extends T_A[D, (Byte,(Int,Char))]
case class CC_B[E, F](a: T_B[E], b: Byte) extends T_A[E, (Byte,(Int,Char))]
case class CC_C[G](a: T_B[G]) extends T_B[G]

val v_a: T_A[Byte, (Byte,(Int,Char))] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_A(_, _)