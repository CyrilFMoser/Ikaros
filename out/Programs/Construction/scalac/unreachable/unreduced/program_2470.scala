package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_A[T_B[Int, Boolean], T_A[Char, Byte]], T_A[T_B[Boolean, (Byte,Char)], T_A[Boolean, Boolean]]]
case class CC_B(a: Byte, b: CC_A, c: CC_A) extends T_A[T_A[T_B[Int, Boolean], T_A[Char, Byte]], T_A[T_B[Boolean, (Byte,Char)], T_A[Boolean, Boolean]]]
case class CC_C[E, F](a: T_B[F, F]) extends T_A[E, F]
case class CC_D[G]() extends T_B[CC_B, G]

val v_a: T_A[T_A[T_B[Int, Boolean], T_A[Char, Byte]], T_A[T_B[Boolean, (Byte,Char)], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A()