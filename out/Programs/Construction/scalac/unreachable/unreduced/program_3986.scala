package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[D], c: T_A[D, Boolean]) extends T_A[D, Boolean]
case class CC_B(a: CC_A[CC_A[Int]], b: T_A[T_A[Byte, (Byte,Byte)], Boolean], c: T_A[T_B[Byte], T_B[Char]]) extends T_A[T_B[T_A[Byte, Byte]], Boolean]
case class CC_C[E](a: T_A[E, Boolean], b: E, c: Byte) extends T_A[E, Boolean]
case class CC_D[F](a: (((Byte,Boolean),Boolean),T_B[CC_B]), b: T_A[F, Boolean], c: (Byte,T_A[CC_B, Boolean])) extends T_B[F]
case class CC_E(a: T_B[T_B[CC_B]]) extends T_B[CC_D[Char]]

val v_a: T_B[CC_D[Char]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, (_,CC_A(_, _, _))) => 0 
  case CC_D(_, _, (_,CC_C(_, _, _))) => 1 
}
}
// This is not matched: CC_E(CC_D(_, _, _))