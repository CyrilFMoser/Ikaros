package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[E, E]]
case class CC_B(a: T_B[CC_A[Char], T_B[Int, Char]]) extends T_A[T_A[CC_A[Byte], ((Int,Int),Char)], T_B[T_A[CC_A[Byte], ((Int,Int),Char)], T_A[CC_A[Byte], ((Int,Int),Char)]]]
case class CC_C() extends T_A[T_A[CC_A[CC_B], T_A[CC_B, (Char,Int)]], T_B[T_A[CC_A[CC_B], T_A[CC_B, (Char,Int)]], T_A[CC_A[CC_B], T_A[CC_B, (Char,Int)]]]]
case class CC_D[F](a: T_B[F, F]) extends T_B[Boolean, F]
case class CC_E[G](a: Byte, b: T_A[G, G]) extends T_B[G, T_A[CC_B, T_B[CC_B, CC_B]]]
case class CC_F[H](a: T_B[Boolean, H], b: H, c: CC_D[H]) extends T_B[Boolean, H]

val v_a: T_B[Boolean, T_A[T_A[CC_A[CC_B], T_A[CC_B, (Char,Int)]], T_B[T_A[CC_A[CC_B], T_A[CC_B, (Char,Int)]], T_A[CC_A[CC_B], T_A[CC_B, (Char,Int)]]]]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_F(CC_D(_), CC_A(), _) => 1 
  case CC_F(CC_F(_, _, _), CC_A(), _) => 2 
  case CC_F(CC_F(_, _, _), CC_C(), _) => 3 
}
}
// This is not matched: CC_F(CC_D(_), CC_C(), _)