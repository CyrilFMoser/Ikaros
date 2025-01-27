package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: (T_A[(Int,Byte)],T_A[Boolean]), c: T_A[T_A[Boolean]]) extends T_A[T_A[((Byte,Boolean),Byte)]]
case class CC_B() extends T_A[T_A[((Byte,Boolean),Byte)]]

val v_a: T_A[T_A[((Byte,Boolean),Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B() => 1 
}
}