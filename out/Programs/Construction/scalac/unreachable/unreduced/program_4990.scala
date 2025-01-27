package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[Int, T_A[T_A[(Boolean,Char), (Byte,Int)], T_A[Int, Byte]]]
case class CC_B(a: T_A[Boolean, T_A[CC_A, (Int,Byte)]], b: CC_A, c: CC_A) extends T_A[Int, T_A[T_A[(Boolean,Char), (Byte,Int)], T_A[Int, Byte]]]

val v_a: T_A[Int, T_A[T_A[(Boolean,Char), (Byte,Int)], T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}