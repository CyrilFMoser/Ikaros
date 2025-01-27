package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: (Char,T_B), b: T_A[(CC_A,Int)], c: CC_A) extends T_A[T_A[T_A[T_B]]]
case class CC_C() extends T_B
case class CC_D(a: (T_A[(Char,Byte)],Char)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D((_,'x')) => 1 
  case CC_D((_,_)) => 2 
}
}