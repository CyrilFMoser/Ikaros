package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, T_A[Boolean, E]], b: Byte, c: (T_A[Int, Int],T_B[Boolean, Int])) extends T_A[E, F]
case class CC_B[H, G](a: Int, b: T_A[H, H]) extends T_A[H, G]
case class CC_C[I](a: Boolean, b: Char) extends T_A[I, T_A[I, I]]
case class CC_D[J](a: CC_C[J], b: CC_C[J], c: T_A[J, J]) extends T_B[CC_B[CC_C[Boolean], (Char,Byte)], J]
case class CC_E[K]() extends T_B[CC_B[CC_C[Boolean], (Char,Byte)], K]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (CC_A(_, _, _),_)) => 0 
  case CC_A(_, _, (CC_B(_, _),_)) => 1 
  case CC_B(_, CC_A(_, 0, (_,_))) => 2 
  case CC_B(_, CC_A(_, _, (_,_))) => 3 
  case CC_B(_, CC_B(_, _)) => 4 
  case CC_C(_, _) => 5 
}
}