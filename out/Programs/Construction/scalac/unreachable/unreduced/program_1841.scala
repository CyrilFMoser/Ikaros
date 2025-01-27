package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: Boolean, c: (T_A[Boolean, Char],T_A[(Char,Char), (Int,Char)])) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]
case class CC_C[E](a: CC_B[E], b: CC_A[E], c: (Boolean,T_A[Byte, Int])) extends T_A[E, CC_B[E]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, (_,_)) => 0 
  case CC_A(CC_B(), _, (_,_)) => 1 
  case CC_B() => 2 
}
}