package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[(Char,(Boolean,Int)), C]]
case class CC_B[D](a: (Char,T_A[Char, Int])) extends T_A[D, T_A[(Char,(Boolean,Int)), D]]
case class CC_C[E](a: T_A[E, CC_B[(Int,Char)]], b: T_A[E, E]) extends T_A[E, T_A[(Char,(Boolean,Int)), E]]

val v_a: T_A[Int, T_A[(Char,(Boolean,Int)), Int]] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
  case CC_A(_) => 1 
  case CC_B((_,_)) => 2 
  case CC_C(_, _) => 3 
}
}