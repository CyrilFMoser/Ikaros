package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_B[C], c: T_A[C]) extends T_A[C]
case class CC_B[D](a: (Int,T_A[Boolean]), b: D, c: (T_B[Char],Int)) extends T_A[D]
case class CC_C[E](a: T_B[Boolean], b: (T_A[Int],CC_A[Int]), c: E) extends T_B[Boolean]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B((_,_), _, (_,_))) => 1 
  case CC_B(_, _, _) => 2 
}
}