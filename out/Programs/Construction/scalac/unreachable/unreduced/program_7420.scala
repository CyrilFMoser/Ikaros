package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_A[Byte, T_A[Boolean, Byte]], D]
case class CC_B[E, F](a: CC_A[F], b: E) extends T_A[E, F]
case class CC_C[G]() extends T_A[T_A[Byte, T_A[Boolean, Byte]], G]
case class CC_D(a: T_A[T_B[Boolean], CC_B[Byte, Byte]], b: T_A[T_A[Byte, Byte], CC_C[Boolean]]) extends T_B[CC_C[T_A[Byte, (Byte,Int)]]]
case class CC_E(a: T_B[Boolean], b: T_B[CC_B[CC_D, CC_D]], c: Byte) extends T_B[CC_C[T_A[Byte, (Byte,Int)]]]
case class CC_F(a: CC_C[Byte]) extends T_B[CC_C[T_A[Byte, (Byte,Int)]]]

val v_a: T_B[CC_C[T_A[Byte, (Byte,Int)]]] = null
val v_b: Int = v_a match{
  case CC_E(_, _, _) => 0 
  case CC_F(_) => 1 
}
}
// This is not matched: CC_D(CC_B(_, _), CC_B(CC_A(), _))