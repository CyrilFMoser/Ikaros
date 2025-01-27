package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (T_B[(Char,Byte), Boolean],Boolean), b: T_A[E, T_A[E, E]], c: E) extends T_A[E, T_A[E, E]]
case class CC_B[F, G](a: G, b: (CC_A[Byte],T_A[Int, Byte]), c: T_A[F, F]) extends T_B[F, G]
case class CC_C[H, I, J](a: T_A[I, I]) extends T_B[H, I]
case class CC_D[L, K](a: T_B[K, K], b: CC_C[L, L, L], c: T_A[CC_A[K], T_A[CC_A[K], CC_A[K]]]) extends T_B[K, L]

val v_a: T_B[Char, Char] = null
val v_b: Int = v_a match{
  case CC_B('x', (CC_A(_, _, _),_), _) => 0 
  case CC_B(_, (CC_A(_, _, _),_), _) => 1 
  case CC_C(_) => 2 
  case CC_D(_, _, _) => 3 
}
}