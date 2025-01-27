package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[(Char,T_A[(Int,Int)])]
case class CC_B(a: (CC_A,Boolean), b: T_A[CC_A]) extends T_A[(Char,T_A[(Int,Int)])]

val v_a: T_A[(Char,T_A[(Int,Int)])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_), _) => 1 
}
}