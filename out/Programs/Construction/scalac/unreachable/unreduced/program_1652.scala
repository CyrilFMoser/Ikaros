package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: (T_A[Boolean, (Char,Char)],Byte)) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(12, _, (_,_)) => 0 
  case CC_A(_, _, (_,_)) => 1 
  case CC_B() => 2 
}
}