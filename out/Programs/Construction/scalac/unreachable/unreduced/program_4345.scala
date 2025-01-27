package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: Byte, c: E) extends T_A[E, T_B[(Int,(Byte,Char)), E]]
case class CC_B[F](a: Boolean, b: T_B[T_A[F, F], F], c: Byte) extends T_A[F, T_B[(Int,(Byte,Char)), F]]
case class CC_C(a: T_A[T_B[(Byte,Int), Byte], Char], b: T_B[T_B[Char, Boolean], T_A[Int, Boolean]]) extends T_A[Int, CC_A[(Int,Boolean)]]
case class CC_D[H, G](a: (T_B[(Byte,Boolean), CC_C],T_A[CC_C, CC_C])) extends T_B[G, H]

val v_a: T_A[CC_C, T_B[(Int,(Byte,Char)), CC_C]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _), 0, CC_C(_, _)) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_A(CC_C(_, _), _, CC_C(_, _))