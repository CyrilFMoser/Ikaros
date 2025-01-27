package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: (Byte,T_A[Boolean])) extends T_A[D]
case class CC_B[E](a: CC_A[E]) extends T_A[E]
case class CC_C(a: T_A[(Char,(Int,Int))], b: T_B[T_A[(Boolean,Byte)], CC_B[Char]]) extends T_A[CC_B[((Int,Char),Byte)]]
case class CC_D[F](a: T_B[CC_B[Boolean], F], b: F) extends T_B[CC_B[Boolean], F]

val v_a: T_A[CC_B[((Int,Char),Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), (_,_)) => 0 
  case CC_A(CC_B(_), (_,_)) => 1 
  case CC_A(CC_C(_, _), (_,_)) => 2 
  case CC_C(CC_A(_, _), _) => 3 
  case CC_C(CC_B(_), _) => 4 
}
}
// This is not matched: CC_B(CC_A(_, _))