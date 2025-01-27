package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, Int]
case class CC_B(a: CC_A[(Byte,Byte)], b: T_A[T_A[Boolean, Int], T_A[Char, Int]]) extends T_A[(T_A[(Byte,Char), Int],T_A[(Char,Boolean), Int]), Int]

val v_a: T_A[(T_A[(Byte,Char), Int],T_A[(Char,Boolean), Int]), Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}