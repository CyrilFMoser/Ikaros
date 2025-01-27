package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: Byte) extends T_A[E, T_B[E, E]]
case class CC_B(a: T_A[T_B[Char, Char], T_B[T_B[Char, Char], T_B[Char, Char]]]) extends T_A[T_B[T_A[Byte, Int], T_B[Byte, Byte]], T_B[T_B[T_A[Byte, Int], T_B[Byte, Byte]], T_B[T_A[Byte, Int], T_B[Byte, Byte]]]]
case class CC_C(a: CC_A[(CC_B,(Char,Int))], b: T_A[CC_B, T_B[CC_B, CC_B]], c: T_A[T_B[CC_B, CC_B], T_B[T_B[CC_B, CC_B], T_B[CC_B, CC_B]]]) extends T_A[T_A[Byte, T_B[Byte, Byte]], T_B[T_A[Byte, T_B[Byte, Byte]], T_A[Byte, T_B[Byte, Byte]]]]
case class CC_D[G, F](a: T_B[F, F]) extends T_B[F, G]
case class CC_E(a: CC_A[Boolean]) extends T_B[T_B[T_A[CC_B, CC_B], CC_B], CC_A[(Boolean,CC_C)]]
case class CC_F[I, H](a: CC_A[I], b: T_A[H, CC_A[I]], c: H) extends T_B[I, H]

val v_a: T_B[T_B[T_B[T_A[CC_B, CC_B], CC_B], CC_A[(Boolean,CC_C)]], T_A[T_A[Byte, T_B[Byte, Byte]], T_B[T_A[Byte, T_B[Byte, Byte]], T_A[Byte, T_B[Byte, Byte]]]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(CC_D(_))) => 0 
  case CC_D(CC_D(CC_F(_, _, _))) => 1 
  case CC_D(CC_F(CC_A(_, _), _, CC_D(_))) => 2 
  case CC_D(CC_F(CC_A(_, _), _, CC_E(_))) => 3 
  case CC_D(CC_F(CC_A(_, _), _, CC_F(_, _, _))) => 4 
  case CC_F(CC_A(_, _), _, CC_A(_, _)) => 5 
  case CC_F(CC_A(_, _), _, CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _))) => 6 
}
}