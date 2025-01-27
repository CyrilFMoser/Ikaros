package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (T_A[Int, Char],T_A[(Boolean,Char), Int])) extends T_A[T_A[((Byte,Int),Char), T_A[Byte, Char]], T_A[Boolean, Boolean]]
case class CC_B() extends T_A[T_A[((Byte,Int),Char), T_A[Byte, Char]], T_A[Boolean, Boolean]]

val v_a: T_A[T_A[((Byte,Int),Char), T_A[Byte, Char]], T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B() => 1 
}
}