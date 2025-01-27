package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: (Boolean,(Int,Char)), b: (Int,T_A[Byte, Boolean]), c: E) extends T_A[D, (Int,T_B[Int])]
case class CC_B[F](a: T_A[F, F], b: CC_A[CC_A[F, F], F]) extends T_A[F, (Int,T_B[Int])]
case class CC_C[G, H](a: CC_B[H], b: H, c: CC_B[H]) extends T_A[G, (Int,T_B[Int])]

val v_a: T_A[Int, (Int,T_B[Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B(_, CC_A((_,_), (_,_), 12)) => 1 
  case CC_B(_, CC_A((_,_), (_,_), _)) => 2 
  case CC_C(_, _, _) => 3 
}
}