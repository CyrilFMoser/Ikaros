package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[D]
case class CC_B[E](a: E, b: (CC_A[Boolean],T_B[Int, Int]), c: T_A[E]) extends T_A[E]
case class CC_C[F]() extends T_B[F, T_A[Boolean]]
case class CC_D() extends T_B[CC_B[(Boolean,Int)], T_A[Boolean]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
  case CC_A(_) => 1 
  case CC_B(_, (CC_A(_),_), CC_A(_)) => 2 
  case CC_B(_, (CC_A(_),_), CC_B(_, (_,_), CC_A(_))) => 3 
  case CC_B(_, (CC_A(_),_), CC_B(_, (_,_), CC_B(_, _, _))) => 4 
}
}