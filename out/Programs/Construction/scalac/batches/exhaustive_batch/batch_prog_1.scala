package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: (Boolean,T_A[Boolean, Char]), c: (Char,T_A[(Byte,Boolean), Int])) extends T_A[C, Char]
case class CC_B[D](a: T_A[D, Char]) extends T_A[D, Char]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
}
}