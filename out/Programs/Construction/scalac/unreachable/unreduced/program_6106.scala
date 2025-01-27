package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Boolean, T_B[Boolean, Boolean]]) extends T_A[T_A[Char]]
case class CC_B(a: T_A[T_A[Char]], b: T_A[T_A[Char]], c: ((CC_A,(Int,Int)),T_B[CC_A, CC_A])) extends T_A[T_A[Char]]
case class CC_C[E, D](a: E) extends T_B[D, E]
case class CC_D[F, G](a: CC_C[G, G], b: T_A[G], c: G) extends T_B[G, F]

val v_a: T_B[Int, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_A(_), CC_A(_), (_,_))) => 0 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_), (_,_))) => 1 
  case CC_C(CC_B(CC_A(_), CC_B(_, _, _), (_,_))) => 2 
  case CC_C(CC_B(CC_B(_, _, _), CC_B(_, _, _), (_,_))) => 3 
  case CC_D(CC_C(_), _, 12) => 4 
  case CC_D(CC_C(_), _, _) => 5 
}
}