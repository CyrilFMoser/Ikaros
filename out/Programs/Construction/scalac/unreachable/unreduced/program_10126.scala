package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[(Byte,Char), T_A[Byte, Char]], C]
case class CC_B[D](a: CC_A[D], b: T_A[Char, D], c: (Char,T_A[Boolean, Byte])) extends T_A[T_A[(Byte,Char), T_A[Byte, Char]], D]

val v_a: T_A[T_A[(Byte,Char), T_A[Byte, Char]], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, ('x',_)) => 1 
  case CC_B(_, _, (_,_)) => 2 
}
}