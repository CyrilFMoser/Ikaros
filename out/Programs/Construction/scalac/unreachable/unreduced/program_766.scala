package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D, b: D, c: (T_A[Int, Char],CC_A[Byte])) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: (CC_B[Int],Int)) extends T_A[E, T_A[E, E]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, (_,_)) => 1 
  case CC_C(_) => 2 
}
}