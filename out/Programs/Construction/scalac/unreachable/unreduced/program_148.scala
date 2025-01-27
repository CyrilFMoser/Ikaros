package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[(Char,Char), T_A[(Int,Char), Int]]]
case class CC_B[D]() extends T_A[D, T_A[(Char,Char), T_A[(Int,Char), Int]]]
case class CC_C[E](a: T_A[Char, Char], b: Byte, c: (Byte,CC_B[Boolean])) extends T_A[E, T_A[(Char,Char), T_A[(Int,Char), Int]]]

val v_a: T_A[Boolean, T_A[(Char,Char), T_A[(Int,Char), Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _, (_,_)) => 2 
}
}