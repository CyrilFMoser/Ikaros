package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[(Byte,Int)]], b: T_A[T_A[Int]], c: T_A[T_B[Byte]]) extends T_A[T_A[T_A[Char]]]
case class CC_B() extends T_B[T_A[(CC_A,(Char,Byte))]]
case class CC_C() extends T_B[T_A[(CC_A,(Char,Byte))]]
case class CC_D(a: (CC_A,CC_B)) extends T_B[T_A[(CC_A,(Char,Byte))]]

val v_a: T_B[T_A[(CC_A,(Char,Byte))]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C() => 1 
  case CC_D((CC_A(_, _, _),CC_B())) => 2 
}
}