package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: (T_A[Byte, Byte],T_B[Byte])) extends T_A[D, T_B[D]]
case class CC_B[F](a: T_B[F], b: (Boolean,Char)) extends T_A[F, T_B[F]]
case class CC_C[G](a: CC_B[G], b: G, c: Int) extends T_B[G]
case class CC_D[H](a: CC_B[H], b: (T_B[Char],T_B[Boolean]), c: Byte) extends T_B[H]

val v_a: T_A[Byte, T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(CC_D(_, _, _), (_,_)) => 1 
}
}
// This is not matched: CC_B(CC_C(_, _, _), (_,_))