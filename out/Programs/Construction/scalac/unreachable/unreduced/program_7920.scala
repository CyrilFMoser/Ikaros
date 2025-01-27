package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[(Int,(Byte,Byte)), (Int,Byte)], T_A[Int, T_A[Boolean, Byte]]]
case class CC_B(a: CC_A, b: T_A[Boolean, (CC_A,CC_A)], c: CC_A) extends T_A[T_A[(Int,(Byte,Byte)), (Int,Byte)], T_A[Int, T_A[Boolean, Byte]]]

val v_a: T_A[T_A[(Int,(Byte,Byte)), (Int,Byte)], T_A[Int, T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, CC_A()) => 1 
}
}