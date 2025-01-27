package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_A[T_B[Char], T_B[Char]], T_A[T_A[T_B[Char], T_B[Char]], T_A[T_B[Char], T_B[Char]]]]) extends T_A[D, T_A[D, D]]
case class CC_B[F]() extends T_A[F, T_A[F, F]]
case class CC_C(a: T_A[(Char,Char), T_A[(Char,Char), (Char,Char)]], b: (Boolean,CC_A[Boolean]), c: Int) extends T_A[T_B[(Boolean,(Int,Byte))], T_A[T_B[(Boolean,(Int,Byte))], T_B[(Boolean,(Int,Byte))]]]
case class CC_D[G](a: T_A[G, G]) extends T_B[G]
case class CC_E[H]() extends T_B[H]
case class CC_F[I]() extends T_B[I]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E() => 1 
}
}
// This is not matched: CC_F()