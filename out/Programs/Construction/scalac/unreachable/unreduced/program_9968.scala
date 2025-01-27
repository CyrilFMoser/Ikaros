package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: (T_A[Char],T_A[Char]), c: (T_B[Char],Boolean)) extends T_A[C]
case class CC_B[D](a: D, b: D, c: T_A[D]) extends T_A[D]
case class CC_C[E](a: (CC_A[Int],T_A[Boolean])) extends T_B[CC_A[CC_A[Int]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, (_,_)) => 0 
  case CC_A(CC_B(_, _, _), _, (_,_)) => 1 
  case CC_B(_, _, CC_A(_, _, _)) => 2 
  case CC_B(_, _, CC_B(_, _, CC_A(_, _, _))) => 3 
  case CC_B(_, _, CC_B(_, _, CC_B(_, _, _))) => 4 
}
}