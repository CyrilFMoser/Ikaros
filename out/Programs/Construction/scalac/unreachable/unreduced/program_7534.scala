package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: Boolean, b: T_B[D], c: T_A[E, D]) extends T_A[E, D]
case class CC_B[F, G]() extends T_A[F, G]
case class CC_C() extends T_A[T_A[T_A[Boolean, Char], T_A[Char, Int]], T_A[CC_A[Byte, Char], T_A[Int, Boolean]]]
case class CC_D(a: Char, b: Byte, c: T_B[T_A[CC_C, CC_C]]) extends T_B[T_A[T_A[CC_C, CC_C], ((Int,Int),CC_C)]]
case class CC_E() extends T_B[T_A[T_A[CC_C, CC_C], ((Int,Int),CC_C)]]
case class CC_F(a: CC_B[(Char,CC_C), Byte], b: CC_B[CC_C, T_B[(Int,Char)]]) extends T_B[T_A[T_A[CC_C, CC_C], ((Int,Int),CC_C)]]

val v_a: T_A[CC_E, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_A(_, _, CC_B())