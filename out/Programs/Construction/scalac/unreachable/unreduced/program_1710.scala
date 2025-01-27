package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[Int, E], c: (T_A[Int, Char],T_B[(Boolean,Byte), Byte])) extends T_A[Int, E]
case class CC_B(a: T_A[Int, Boolean], b: CC_A[T_A[Char, Char]], c: T_B[CC_A[(Byte,Int)], T_A[Int, Char]]) extends T_A[Int, T_A[T_A[Boolean, Int], CC_A[(Char,Boolean)]]]
case class CC_C[F](a: T_A[Int, F]) extends T_B[F, Byte]
case class CC_D[G](a: T_A[Int, G]) extends T_B[G, Byte]
case class CC_E[H](a: (T_B[CC_B, Byte],CC_B), b: H) extends T_B[H, Byte]

val v_a: T_B[T_A[Int, T_A[T_A[Boolean, Int], CC_A[(Char,Boolean)]]], Byte] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_) => 1 
  case CC_E((_,_), CC_B(_, _, _)) => 2 
}
}
// This is not matched: CC_E((_,_), CC_A(_, _, _))