package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[((Boolean,Byte),Byte)], c: T_A[T_A[Char]]) extends T_A[T_A[((Int,Int),(Boolean,Char))]]
case class CC_B() extends T_A[T_A[((Int,Int),(Boolean,Char))]]

val v_a: T_A[T_A[((Int,Int),(Boolean,Char))]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}