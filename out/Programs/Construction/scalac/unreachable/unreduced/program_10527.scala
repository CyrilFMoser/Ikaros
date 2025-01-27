package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Int,Char)], b: Char) extends T_A[(T_A[(Char,Int)],T_A[Int])]
case class CC_B() extends T_A[(T_A[(Char,Int)],T_A[Int])]
case class CC_C[B](a: T_A[B]) extends T_A[(T_A[(Char,Int)],T_A[Int])]

val v_a: T_A[(T_A[(Char,Int)],T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
  case CC_A(_, _) => 1 
  case CC_B() => 2 
  case CC_C(_) => 3 
}
}