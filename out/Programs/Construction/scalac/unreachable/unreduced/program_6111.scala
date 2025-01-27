package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Boolean, T_A[Boolean, Boolean]], b: T_A[T_A[Int, (Byte,Boolean)], T_A[Char, Byte]], c: T_A[((Int,Boolean),Int), T_A[Char, Int]]) extends T_A[(T_A[Char, (Int,Byte)],Char), T_A[T_A[Boolean, Byte], T_A[Boolean, Int]]]
case class CC_B() extends T_A[(T_A[Char, (Int,Byte)],Char), T_A[T_A[Boolean, Byte], T_A[Boolean, Int]]]
case class CC_C() extends T_A[(T_A[Char, (Int,Byte)],Char), T_A[T_A[Boolean, Byte], T_A[Boolean, Int]]]

val v_a: T_A[(T_A[Char, (Int,Byte)],Char), T_A[T_A[Boolean, Byte], T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C()