package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[T_B[Int, Byte], T_B[Byte, Int]]) extends T_A[T_B[T_B[(Int,Char), Char], (Boolean,Boolean)], T_A[T_A[Boolean, Char], Char]]
case class CC_B(a: T_A[T_B[CC_A, CC_A], T_A[CC_A, CC_A]], b: CC_A, c: T_A[T_B[Boolean, CC_A], CC_A]) extends T_A[T_B[T_B[(Int,Char), Char], (Boolean,Boolean)], T_A[T_A[Boolean, Char], Char]]
case class CC_C[E, F, G](a: Char, b: T_B[G, ((Int,Int),CC_A)]) extends T_B[F, E]
case class CC_D[I, H](a: T_B[T_B[H, I], H], b: CC_A, c: I) extends T_B[I, H]
case class CC_E[J](a: Boolean, b: (Char,CC_B)) extends T_B[J, CC_A]

val v_a: T_B[Char, CC_A] = null
val v_b: Int = v_a match{
  case CC_C('x', _) => 0 
  case CC_C(_, _) => 1 
  case CC_D(CC_C(_, _), _, _) => 2 
  case CC_D(CC_D(CC_C(_, _), CC_A(_), CC_C(_, _)), _, _) => 3 
  case CC_D(CC_D(CC_D(_, _, _), CC_A(_), CC_C(_, _)), _, _) => 4 
  case CC_D(CC_D(CC_E(_, _), CC_A(_), CC_C(_, _)), _, _) => 5 
  case CC_D(CC_D(CC_C(_, _), CC_A(_), CC_D(_, _, _)), _, _) => 6 
  case CC_D(CC_D(CC_D(_, _, _), CC_A(_), CC_D(_, _, _)), _, _) => 7 
  case CC_D(CC_D(CC_E(_, _), CC_A(_), CC_D(_, _, _)), _, _) => 8 
  case CC_D(CC_E(_, (_,_)), _, _) => 9 
  case CC_E(_, (_,CC_B(_, _, _))) => 10 
}
}