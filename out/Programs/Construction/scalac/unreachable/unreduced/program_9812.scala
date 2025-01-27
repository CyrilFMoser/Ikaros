package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: D, c: T_A[D]) extends T_A[D]
case class CC_B[E](a: CC_A[E]) extends T_A[E]
case class CC_C(a: Int) extends T_A[(T_B[(Byte,Int), Boolean],T_B[Byte, Char])]
case class CC_D[F](a: F) extends T_B[(CC_C,CC_A[CC_C]), F]
case class CC_E[G](a: G, b: T_A[G]) extends T_B[(CC_C,CC_A[CC_C]), G]

val v_a: T_A[(T_B[(Byte,Int), Boolean],T_B[Byte, Char])] = null
val v_b: Int = v_a match{
  case CC_A((_,_), (_,_), _) => 0 
  case CC_B(CC_A((_,_), (_,_), CC_A(_, _, _))) => 1 
  case CC_B(CC_A((_,_), (_,_), CC_B(_))) => 2 
  case CC_B(CC_A((_,_), (_,_), CC_C(_))) => 3 
  case CC_C(12) => 4 
  case CC_C(_) => 5 
}
}